
package estructura;
import java.io.Serializable;



public class LCDE  implements Serializable{
    
   private Nodo_Circular inicio, fin;  
    
   
   public boolean vacia(){
     return inicio == null;
   
   }
    
   
    public void add(Object e){
      Nodo_Circular circular = new Nodo_Circular((String)e, null, null, null);
        
         if(vacia()){
           inicio = circular; 
           
         }else{
           Nodo_Circular auxiliar = inicio; 
           while(auxiliar.getSiguiente()!=inicio)
              auxiliar= auxiliar.getSiguiente();
              auxiliar.setSiguiente(circular);
              circular.setAnterior(auxiliar);
              circular.setSiguiente(inicio);
              inicio.setAnterior(circular);
         
         }
    }     
         
    public void delete(Object e){
        
        
        
    }     
      
       
   
    
    
    
    
    
    
    
    
}

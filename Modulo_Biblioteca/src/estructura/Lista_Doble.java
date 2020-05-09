    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

import java.io.Serializable;



public class Lista_Doble  implements Serializable{
    private Nodo_Doble inicio,fin;    
    
    public Lista_Doble(){
        inicio = fin = null;
    }
    
   //Lista de Categorias vacia 
    
    public boolean Vacia(){
      return inicio ==null;
    
    }
    
    public void add(Object e){    
        if(!Vacia()){
          fin = new Nodo_Doble((String)e, null, fin);
          fin.anterior.siguiente=fin;
        } else {
           inicio=fin=new Nodo_Doble((String)e);     
        }
        
    }
    
    public void mostrarlista(){
        if(!Vacia()){
          String cat = null;
          Nodo_Doble auxiliar = inicio;
            while(auxiliar!=null){
              cat = cat + auxiliar.categoría;
              auxiliar = auxiliar.siguiente;
                
            }
        
        }
    }    
    
    public void delete(Object e){
        if(!Vacia()){
          String cat = null;

        }
            
    
    
    
    }    
        
    
    
    
    
    
}

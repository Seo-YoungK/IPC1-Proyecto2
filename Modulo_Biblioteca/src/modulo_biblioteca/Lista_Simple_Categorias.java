
package modulo_biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author karen
 */
public class Lista_Simple_Categorias {
    private Nodos_Categorias cabeza;
    
    
    public void agregar(String categoria){
    
    Nodos_Categorias categorias = new Nodos_Categorias(categoria);
       
    
    if(cabeza == null){
       cabeza = categorias;

    }else{
       Nodos_Categorias auxiliar = cabeza; 
       while(auxiliar.getSiguiente() != null){
       auxiliar = auxiliar.getSiguiente();
        
       }
       
       auxiliar.setSiguiente(categorias);
     }
    }
    
    
    public void imprimir (){
    
           if(cabeza==null){
           JOptionPane.showInputDialog("La lista esta vacia, agregue elementos");
       
       }else{
       
           for(Nodos_Categorias auxiliar = this.getInicio();auxiliar!= null; auxiliar=auxiliar.getSiguiente()){
               
           System.out.println(auxiliar.getCategorias());
            }

        }  
    
    }
    
    
    public Nodos_Categorias getInicio(){
        return cabeza;
    }
    
    public void setInicio(Nodos_Categorias inicio){
    
        this.cabeza=inicio;
    }    
    
    
}


package modulo_biblioteca;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author karen
 */
public class Lista_Simple_Imagenes extends EstructuraDeDatos{
    
    private nodos_imagenes inicio; //cabeza de la lista 

    
    
    public Lista_Simple_Imagenes() {
        this.inicio = null;
    }

    
    public boolean vacio(){
        return this.inicio == null;
       
    }
    
    public void add(ImageIcon imagen2){
    
       nodos_imagenes imagenes = new nodos_imagenes (imagen2);
       
       if(vacio()){
          inicio = imagenes; //si no hay elementos entoces el nuevo sera el inicial
          
       }else{
            nodos_imagenes aux = inicio; //asignando a la variable lista simple el inicio 
          
             while(aux.getSiguiente() != null){
              aux = aux.getSiguiente();
          
             }
       
           aux.setSiguiente(imagenes);   //asignando el valor siguiente al nodo nuevo   
       } 
    
    }   
    
    
    public void imprimir(){
       
       if(vacio()){
           JOptionPane.showInputDialog("La lista esta vacia, agregue elementos");
       
       }else{
       
           for(nodos_imagenes aux=this.getInicio();aux!=null; aux=aux.getSiguiente()){
           System.out.println(aux.getImagen());
            }

        }   
        
    }
    

    public void delete(String e){
        inicio = null;
 
     }

    public nodos_imagenes getInicio() {
        return inicio;
    }

    public void setInicio(nodos_imagenes inicio) {
        this.inicio = inicio;
    }

}

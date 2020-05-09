
package modulo_biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author karen
 */
public class Lista_Simple_Usuarios extends EstructuraDeDatos{
    
    private Nodos1 inicio; //cabeza de la lista 

    
    
    public Lista_Simple_Usuarios() {
        this.inicio = null;
    }

    
    public boolean vacio(){
        return this.inicio == null;
       
    }
    
    public void add(String usuario){
    
       Nodos1 usuario_nuevo = new Nodos1(usuario);
       
       if(vacio()){
          inicio = usuario_nuevo; //si no hay elementos entoces el nuevo sera el inicial
          
       }else{
            Nodos1 aux = inicio; //asignando a la variable lista simple el inicio 
          
             while(aux.getSiguiente() != null){
              aux = aux.getSiguiente();
          
             }
       
           aux.setSiguiente(usuario_nuevo);   //asignando el valor siguiente al nodo nuevo   
       } 
    
    }   
    
    public void imprimir(){
       
       if(vacio()){
           JOptionPane.showInputDialog("La lista esta vacia, agregue elementos");
       
       }else{
       
           for(Nodos1 aux=this.getInicio();aux!=null; aux=aux.getSiguiente()){
           System.out.println(aux.getUsuario());
            }

        }   
        
    }
    

    public void delete(String e){
        inicio = null;
 
     }
    
    
    public Nodos1 getInicio(){
        return inicio;
    }
    
    public void setInicio(Nodos1 inicio){
    
        this.inicio=inicio;
    }
 
}

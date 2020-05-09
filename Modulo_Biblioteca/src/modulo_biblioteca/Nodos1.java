/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_biblioteca;

public class Nodos1 {
    
    
private String usuario; 
private Nodos1 siguiente;


    public Nodos1(String usuario) {
        this.usuario = usuario;
        siguiente = null;      //la lista no contiene elementos aun. //No es necesario colocar que es nulo, porque el siguiente sera nulo. 
    }

    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Nodos1 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos1 siguiente) {
        this.siguiente = siguiente;
    }


    
}
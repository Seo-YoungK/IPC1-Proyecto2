/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_biblioteca;

/**
 *
 * @author karen
 */
public class Nodos_Categorias {
    private String categorias; 
    private Nodos_Categorias siguiente;



    public Nodos_Categorias(String categorias) {
        this.categorias = categorias;
        this.siguiente = null;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public Nodos_Categorias getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos_Categorias siguiente) {
        this.siguiente = siguiente;
    }


    
}

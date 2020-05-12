/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_biblioteca;

import javax.swing.ImageIcon;


public class nodos_imagenes {
    
    private ImageIcon imagen; 
    private nodos_imagenes siguiente;
    
    

    public nodos_imagenes(ImageIcon imagen) {
        this.imagen = imagen;
        siguiente = null;
    }
    
    

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public nodos_imagenes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodos_imagenes siguiente) {
        this.siguiente = siguiente;
    }


    
}
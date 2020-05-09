package estructura;

import estructura.LCDE;


public class Nodo_Circular {
    
    private String inicio;
    private Nodo_Circular siguiente;
    private Nodo_Circular anterior ;
    public LCDE imagenes;

    public Nodo_Circular(String inicio, Nodo_Circular siguiente, Nodo_Circular anterior, LCDE imagenes) {
        this.inicio = inicio;
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.imagenes = new LCDE();
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public Nodo_Circular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Circular siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo_Circular getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_Circular anterior) {
        this.anterior = anterior;
    }

    public LCDE getImagenes() {
        return imagenes;
    }

    public void setImagenes(LCDE imagenes) {
        this.imagenes = imagenes;
    }
    
    


    
    
    
    
    
    

    
    
    

    
    
    
    
    
    
 
   

}

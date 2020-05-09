
package estructura;

import java.io.Serializable;

/**
 *
 * @author karen
 */
public class Nodo_Doble implements Serializable{
    
    public String categoría;
    Nodo_Doble siguiente, anterior;

    //Con nodos
    public Nodo_Doble(String cat, Nodo_Doble s, Nodo_Doble a ) {
       this.categoría =cat;
       this.siguiente = s;
       this.anterior = a;
    }
    
        //Sin nodos 
    public Nodo_Doble(String cat) {
        this(cat,null,null);
    }
 
}

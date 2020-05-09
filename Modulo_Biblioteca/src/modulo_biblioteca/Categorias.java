/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_biblioteca;
import javax.swing.JOptionPane;


public class Categorias {
    
    public static void main(String[] args) {
       
      Lista_Simple_Categorias usuarios = new Lista_Simple_Categorias();
      String nombre_Cat= JOptionPane.showInputDialog(null,"Nombra tu categoría");
      usuarios.agregar(nombre_Cat);
      usuarios.imprimir();

    }
    
    
    
    
    
}

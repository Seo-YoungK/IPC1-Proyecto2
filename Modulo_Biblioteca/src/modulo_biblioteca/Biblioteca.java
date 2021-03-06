/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_biblioteca;


import estructura.Lista_Doble;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author karen
 */
public class Biblioteca extends javax.swing.JFrame {
    
    private DefaultListModel modeloLista;
    ImageIcon img[] = new ImageIcon[5];
    public File seleccion; //imagen seleccionada 
    public BufferedImage input;  //imagen original
    public int height;
    public int width;
    
    
    private int contador;
    
    
    public Biblioteca() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        modeloLista = new DefaultListModel();
        mostrarlista.setModel(modeloLista);

        }
    
    
    
        //this.setExtendedState(MAXIMIZED_BOTH);//
        //MAXIMIZED_BOTH =6   //extender la pantalla hasta el tamano completo del usuario
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categorias = new javax.swing.JPanel();
        siguiente = new javax.swing.JToggleButton();
        anterior = new javax.swing.JToggleButton();
        lugarimagen = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarlista = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        abririmagen = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Agregar = new javax.swing.JMenu();
        eliminarcategoria = new javax.swing.JMenu();
        agregarimagen = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Foto (adjuntat nombre de la foto)");
        setExtendedState(1);
        setSize(new java.awt.Dimension(500, 5));

        categorias.setBackground(new java.awt.Color(51, 51, 51));
        categorias.setPreferredSize(new java.awt.Dimension(900, 588));

        siguiente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        siguiente.setText(">");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anterior.setText("<");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        lugarimagen.setBackground(new java.awt.Color(204, 204, 204));
        lugarimagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        lugarimagen.setOpaque(true);

        usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Categorías");

        jScrollPane1.setViewportView(mostrarlista);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la imagen...." }));

        javax.swing.GroupLayout categoriasLayout = new javax.swing.GroupLayout(categorias);
        categorias.setLayout(categoriasLayout);
        categoriasLayout.setHorizontalGroup(
            categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoriasLayout.createSequentialGroup()
                .addGroup(categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(categoriasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(categoriasLayout.createSequentialGroup()
                        .addGroup(categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(categoriasLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE))
                            .addGroup(categoriasLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(anterior)
                                .addGap(18, 18, 18)))
                        .addGroup(categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 468, Short.MAX_VALUE)
                            .addComponent(lugarimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(siguiente)))
                .addGap(51, 51, 51))
        );
        categoriasLayout.setVerticalGroup(
            categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoriasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(categoriasLayout.createSequentialGroup()
                            .addComponent(lugarimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoriasLayout.createSequentialGroup()
                            .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(233, 233, 233)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoriasLayout.createSequentialGroup()
                        .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))
                    .addGroup(categoriasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jMenuBar1.setOpaque(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(525, 35));

        abririmagen.setBackground(new java.awt.Color(51, 51, 51));
        abririmagen.setForeground(new java.awt.Color(255, 255, 255));
        abririmagen.setText("Abrir Imagen");
        abririmagen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        abririmagen.setOpaque(true);
        abririmagen.setPreferredSize(new java.awt.Dimension(105, 19));
        abririmagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abririmagenMouseClicked(evt);
            }
        });
        abririmagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abririmagenActionPerformed(evt);
            }
        });
        jMenuBar1.add(abririmagen);

        jMenu2.setBackground(new java.awt.Color(51, 51, 51));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Eliminar Imagen ");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenu2.setMaximumSize(new java.awt.Dimension(125, 32767));
        jMenu2.setOpaque(true);
        jMenu2.setPreferredSize(new java.awt.Dimension(120, 19));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        Agregar.setBackground(new java.awt.Color(51, 51, 51));
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("Agregar Categoría ");
        Agregar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Agregar.setMaximumSize(new java.awt.Dimension(150, 32767));
        Agregar.setOpaque(true);
        Agregar.setPreferredSize(new java.awt.Dimension(130, 19));
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        jMenuBar1.add(Agregar);

        eliminarcategoria.setBackground(new java.awt.Color(51, 51, 51));
        eliminarcategoria.setForeground(new java.awt.Color(255, 255, 255));
        eliminarcategoria.setText("Eliminar Categoría");
        eliminarcategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eliminarcategoria.setOpaque(true);
        eliminarcategoria.setPreferredSize(new java.awt.Dimension(145, 19));
        eliminarcategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarcategoriaMouseClicked(evt);
            }
        });
        jMenuBar1.add(eliminarcategoria);

        agregarimagen.setBackground(new java.awt.Color(51, 51, 51));
        agregarimagen.setForeground(new java.awt.Color(255, 255, 255));
        agregarimagen.setText("Añadir a Categoría ");
        agregarimagen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        agregarimagen.setMaximumSize(new java.awt.Dimension(140, 32767));
        agregarimagen.setOpaque(true);
        agregarimagen.setPreferredSize(new java.awt.Dimension(150, 19));
        agregarimagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarimagenMouseClicked(evt);
            }
        });
        jMenuBar1.add(agregarimagen);

        jMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Regresar");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setMaximumSize(new java.awt.Dimension(90, 32767));
        jMenu1.setOpaque(true);
        jMenu1.setPreferredSize(new java.awt.Dimension(80, 19));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(51, 51, 51));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Salir                                                  ");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setMaximumSize(new java.awt.Dimension(80, 32767));
        jMenu3.setOpaque(true);
        jMenu3.setPreferredSize(new java.awt.Dimension(45, 19));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(51, 51, 51));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Ingresar al Convertidor");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenu4.setOpaque(true);
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categorias, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void abririmagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abririmagenActionPerformed

        
    }//GEN-LAST:event_abririmagenActionPerformed

    private void abririmagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abririmagenMouseClicked

        JFileChooser imagen = new JFileChooser();
        imagen.setDialogTitle("Buscar en:" );
        int estado = imagen.showOpenDialog(null);
        

        if(estado== JFileChooser.APPROVE_OPTION){
              if(input == null){
              seleccion = imagen.getSelectedFile();
                  try {
                      input = ImageIO.read(seleccion);
                  } catch (IOException ex) {
                      Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
                  }
              height = input.getHeight();
              width = input.getWidth();
            }  

        
        
        
        
        for(int i=1; i<img.length; i++ ){  //obteniendo la longitud de las imagenes
   
        ImageIcon n = new ImageIcon(input);     
        ImageIcon l = new ImageIcon(n.getImage().getScaledInstance(lugarimagen.getWidth(), lugarimagen.getHeight(), Image.SCALE_DEFAULT));
        this.lugarimagen.setIcon(l);
        
          img[i] = img[1];  
          }
         
        }
    
    }//GEN-LAST:event_abririmagenMouseClicked

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        if(contador ==5){
           contador =0;
        }
        contador ++;
        this.lugarimagen.setIcon(img[contador]);
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        if(contador==1){
           contador = img.length;
        }
        
        contador --;
        
        this.lugarimagen.setIcon(img[contador]);
    }//GEN-LAST:event_anteriorActionPerformed

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
      String categorias = JOptionPane.showInputDialog(null,"Nombra tu categoría");
      
          Lista_Simple_Categorias lista = new Lista_Simple_Categorias();
          modeloLista.addElement(categorias);
          lista.agregar(categorias);
    }//GEN-LAST:event_AgregarMouseClicked

    private void eliminarcategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarcategoriaMouseClicked
         int respuesta = JOptionPane.showConfirmDialog(null, "Está seguro que desea eliminar la categoria ?");
         
        if (respuesta==0){
          Lista_Doble lista = new Lista_Doble();
          int seleccion = mostrarlista.getSelectedIndex();
          modeloLista.remove(seleccion);
          lista.delete((int)seleccion);
        }
 
        
    }//GEN-LAST:event_eliminarcategoriaMouseClicked

    private void agregarimagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarimagenMouseClicked
       
           /* try{
        
        //se debe abrir una ventana emergente donde se veean todas las categorias para agregarlas. 
        
        
        }catch(Exception e){
        
         JOptionPane.showInputDialog(null,"Debe seleccionar una categoria!");
        
        }*/    
       
    }//GEN-LAST:event_agregarimagenMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
       Ventana_Principal vent = new Ventana_Principal();
       vent.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
       Panel_Convertidor convertidor = new Panel_Convertidor();
       convertidor.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
 
            }


        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agregar;
    private javax.swing.JMenu abririmagen;
    private javax.swing.JMenu agregarimagen;
    private javax.swing.JToggleButton anterior;
    private javax.swing.JPanel categorias;
    private javax.swing.JMenu eliminarcategoria;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lugarimagen;
    private javax.swing.JList<String> mostrarlista;
    private javax.swing.JToggleButton siguiente;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    private int getResource(ImageIcon l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

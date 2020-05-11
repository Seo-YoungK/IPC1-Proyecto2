/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_biblioteca;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author karen
 */
public class Panel_Editor extends javax.swing.JFrame {
    
    private BufferedImage input;  //imagen original
    private BufferedImage output;  //imagen trabajada
    private BufferedImage segundoinput; //segund imagen
    private File seleccion; //imagen seleccionada 
    
    private int R[][];
    private int G[][];
    private int B[][];
    
    private int monocromatico[][];
    
    private int height;
    private int width;
    
    public Panel_Editor() {
        initComponents();
        this.setLocationRelativeTo(null);
        botones.add(opc_1);
        botones.add(opc_2);
        botones.add(opc_3);
        botones2.add(op1);
        botones2.add(op2);
    }

    /*INICIO DE METODOS DE TRANSFORMACION*/
    /*Metodo para transformar imagene en blanco y negro*/
    

    public void seleccionar() throws IOException{
    
        JFileChooser imagen = new JFileChooser();
        imagen.setDialogTitle("Buscar en:" );
        int estado = imagen.showOpenDialog(null);
        

        if(estado== JFileChooser.APPROVE_OPTION){
              if(input == null){
              seleccion = imagen.getSelectedFile();
              input = ImageIO.read(seleccion);
              height = input.getHeight();
              width = input.getWidth();
            }  
              seleccion = imagen.getSelectedFile();
              segundoinput = ImageIO.read(seleccion);
        }
            
    }    

    public BufferedImage getinput(){
        return input;
    
    }
    

    public void blanco_y_negro() throws IOException{
        int resultado;
        Color colorAux; 
        
          
         monocromatico = new int[width][height];
         R = new int[width][height];
         G = new int[width][height];
         B = new int[width][height];
         
         
         for(int x=0; x < width; x++){
             for(int y=0; y< height; y++){
              colorAux = new Color(input.getRGB(x,y)); 
              R[x][y]= colorAux.getRed();
              G[x][y]= colorAux.getGreen();
              B[x][y]= colorAux.getBlue();
              resultado= (int)((colorAux.getRed()*0.3) + (colorAux.getGreen()*0.59) + (colorAux.getBlue()*0.11))/3;
              int RGB = resultado<<16 | resultado<<8 | resultado;
              monocromatico [x][y] = resultado;

              input.setRGB(x, y, RGB );
            }

        }
 
    }
    
     public void verde() throws IOException{
        int resultado;
        Color colorAux; 
        
          
         monocromatico = new int[width][height]; //matriz donde se almacenaran los pixeles blanco y negro 
         R = new int[width][height];
         G = new int[width][height];
         B = new int[width][height];
         
         
         for(int x=0; x < width; x++){
             for(int y=0; y< height; y++){
              colorAux = new Color(input.getRGB(x,y)); 
              R[x][y]= colorAux.getRed();
              G[x][y]= colorAux.getGreen();
              B[x][y]= colorAux.getBlue();
              resultado= (int)((colorAux.getRed()*0) + (colorAux.getGreen()*0.59) + (colorAux.getBlue()*0)); // R=0, B=0, G=0.59, y es 255 A
              int RGB = resultado<<16 | resultado<<8 | 0;  //parametros de los colores
              monocromatico [x][y] = resultado;
              
              input.setRGB(x, y, RGB );
            }
              seleccion = new File("C:\\Users\\karen\\Pictures\\IPC IMAGENES\\verde.jpg"); //ruta donde se colocara la imagen
              ImageIO.write(input, "jpg", seleccion);
        }
 
         
    }   
    
     public void azul() throws IOException{
        int resultado;
        Color colorAux; 
        
          
         monocromatico = new int[width][height];
         R = new int[width][height];
         G = new int[width][height];
         B = new int[width][height];
         
         
        for(int x=0; x < width; x++){
             for(int y=0; y< height; y++){
              colorAux = new Color(input.getRGB(x,y)); 
              R[x][y]= colorAux.getRed();
              G[x][y]= colorAux.getGreen();
              B[x][y]= colorAux.getBlue();
              resultado= (int)((colorAux.getRed()*0.3) + (colorAux.getGreen()*0.59) + (colorAux.getBlue()*0.11));
              monocromatico [x][y] = resultado;
              
              input.setRGB(x, y, resultado);
            }
        }
              seleccion = new File("C:\\Users\\karen\\Pictures\\IPC IMAGENES\\azul.jpg"); //ruta donde se colocara la imagen
              ImageIO.write(input, "jpg", seleccion);
        }
 

     public void rojo() throws IOException{
        int resultado;
        Color colorAux; 
        
          
         monocromatico = new int[width][height]; //matriz donde se almacenaran los pixeles blanco y negro 
         R = new int[width][height];
         G = new int[width][height];
         B = new int[width][height];
         
         
         for(int x=0; x < width; x++){
             for(int y=0; y< height; y++){
              colorAux = new Color(input.getRGB(x,y)); 
              R[x][y]= colorAux.getRed();
              G[x][y]= colorAux.getGreen();
              B[x][y]= colorAux.getBlue();
              resultado= (int)((colorAux.getRed()*0.3) + (colorAux.getGreen()*0) + (colorAux.getBlue()*0)); // R=0.3, B=, G=, y es 255 A
              /*int RGB = resultado<<16 | resultado<<8 |0;  //parametros de los colores*/
              monocromatico [x][y] = resultado;
              
              input.setRGB(x, y, resultado );
            }
              seleccion = new File("C:\\Users\\karen\\Pictures\\IPC IMAGENES\\rojo.jpg"); //ruta donde se colocara la imagen
              ImageIO.write(input, "jpg", seleccion);
        }
 
         
    }     
     
     public void JPGE_BMP() throws IOException{
   
        seleccion = new File("C:\\Users\\karen\\Pictures\\IPC IMAGENES\\BMP.bmp"); //ruta donde se colocara la imagen
        ImageIO.write(input, "bmp", seleccion);       

     }
     
     public void BMP_JPGE() throws IOException{
   
        seleccion = new File("C:\\Users\\karen\\Pictures\\IPC IMAGENES\\JPGE.jpg"); //ruta donde se colocara la imagen
        ImageIO.write(input, "jpg", seleccion);       

     }
          
     
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        botones = new javax.swing.ButtonGroup();
        botones2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lugarimagen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        seleccionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        op2 = new javax.swing.JRadioButton();
        opc_1 = new javax.swing.JRadioButton();
        opc_3 = new javax.swing.JRadioButton();
        Convertir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        opc_2 = new javax.swing.JRadioButton();
        Convertir2 = new javax.swing.JButton();

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Convertir JPGE a BMP");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lugarimagen.setBackground(new java.awt.Color(255, 255, 255));
        lugarimagen.setForeground(new java.awt.Color(255, 255, 255));
        lugarimagen.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Previsualización");

        seleccionar.setText("Seleccionar Imagen");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Instrucciones");

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Modificar Imagen");

        op2.setBackground(new java.awt.Color(51, 51, 51));
        op2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        op2.setForeground(new java.awt.Color(255, 255, 255));
        op2.setText("     Rojo, Verde y Azul");

        opc_1.setBackground(new java.awt.Color(51, 51, 51));
        opc_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        opc_1.setForeground(new java.awt.Color(255, 255, 255));
        opc_1.setText("     Convertir JPGE a BMP");

        opc_3.setBackground(new java.awt.Color(51, 51, 51));
        opc_3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        opc_3.setForeground(new java.awt.Color(255, 255, 255));
        opc_3.setText("     Copiar Imagen");

        Convertir.setText("Convertir");
        Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertirActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1. Convierte la imagen de JPGE A BMP");

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("2. Si la imagen es BMP conviertela a JPGE");

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("copia de la imagen modificada. ");

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("3. Presiona copiar imagen, si quieres realizar una ");

        op1.setBackground(new java.awt.Color(51, 51, 51));
        op1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        op1.setForeground(new java.awt.Color(255, 255, 255));
        op1.setText("     Blanco y Negro");

        opc_2.setBackground(new java.awt.Color(51, 51, 51));
        opc_2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        opc_2.setForeground(new java.awt.Color(255, 255, 255));
        opc_2.setText("     Convertir BMP a JPGE");

        Convertir2.setText("Convertir");
        Convertir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Convertir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lugarimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(93, 93, 93))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(opc_3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(opc_1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(opc_2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(82, 82, 82)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Convertir2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(op2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(lugarimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(opc_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opc_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opc_3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(op1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Convertir2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        try{
            
          seleccionar();
          ImageIcon n = new ImageIcon(input);     
          ImageIcon l = new ImageIcon(n.getImage().getScaledInstance(lugarimagen.getWidth(), lugarimagen.getHeight(), Image.SCALE_DEFAULT));
          this.lugarimagen.setIcon(l);
        
        }catch(IOException ex){
        
    }

    }//GEN-LAST:event_seleccionarActionPerformed

    private void ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertirActionPerformed
           
        String mensaje;

            if (opc_1.isSelected()){
               
                try {    
                    JPGE_BMP();
                }
                
                catch (IOException ex) {
                    Logger.getLogger(Panel_Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            
            }else if (opc_2.isSelected()){
                
                 try {
                    BMP_JPGE();
                }
                 
                 catch (IOException ex) {
                    Logger.getLogger(Panel_Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                  JOptionPane.showMessageDialog(null, "Operacion Finalizada");
            
            }else if (opc_3.isSelected()) {

            }else{
                 JOptionPane.showMessageDialog(null,"Seleccione una opcion");

            }
            
    }//GEN-LAST:event_ConvertirActionPerformed

    private void Convertir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Convertir2ActionPerformed
                   
         if (op1.isSelected()){
               
            try {
                blanco_y_negro(); //metodo para obtener la imagen en blanco y negro
                seleccion = new File("C:\\Users\\karen\\Pictures\\IPC IMAGENES\\output.jpg");  //ruta donde se colocara la imagen
                ImageIO.write(input, "jpg", seleccion);
            }
            
            catch (IOException ex) {
                Logger.getLogger(Panel_Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
                 
    
        }else if (op2.isSelected()){
                
            try {
                verde();  //metodo para obtener la imagen en verde
            } catch (IOException ex) {
                 Logger.getLogger(Panel_Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            try {
                azul(); //metodo para obtener la imagen en azul
            } catch (IOException ex) {
                Logger.getLogger(Panel_Editor.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
            try {
                rojo();
            } catch (IOException ex) {
                Logger.getLogger(Panel_Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             JOptionPane.showMessageDialog(null, "Operacion Finalizada");
            
            }else if (opc_3.isSelected()) {
            
                  // mensaje2 = "copiar";
                  
                  
            }else{
                 JOptionPane.showMessageDialog(null, "Seleccione una opcion");

            }
    }//GEN-LAST:event_Convertir2ActionPerformed

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
            java.util.logging.Logger.getLogger(Panel_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convertir;
    private javax.swing.JButton Convertir2;
    private javax.swing.ButtonGroup botones;
    private javax.swing.ButtonGroup botones2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lugarimagen;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton opc_1;
    private javax.swing.JRadioButton opc_2;
    private javax.swing.JRadioButton opc_3;
    private javax.swing.JButton seleccionar;
    // End of variables declaration//GEN-END:variables
}

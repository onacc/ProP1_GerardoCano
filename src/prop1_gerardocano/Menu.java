/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prop1_gerardocano;

import javax.swing.JOptionPane;

/**
 *
 * @author gcano
 */
public class Menu extends javax.swing.JFrame {
Cancion song = new Cancion();
Recursion recur = new Recursion();
    /**
     * Creates new form Menu
     */
    public Menu() {
        setVisible(true);
        setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menucan = new javax.swing.JFrame();
        labot1 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        infor = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        menus = new javax.swing.JButton();
        labo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        recu = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        convertidor = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        menu2 = new javax.swing.JButton();
        conv = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        binadec = new javax.swing.JButton();
        decabin = new javax.swing.JButton();
        menurec = new javax.swing.JButton();
        fondo = new javax.swing.JPanel();
        labot = new javax.swing.JButton();
        recursion = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        listar.setText("Listar");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        infor.setText("Informacion");
        infor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inforActionPerformed(evt);
            }
        });

        mod.setText("Modificar Cancion");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        menus.setText("Menu");
        menus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusActionPerformed(evt);
            }
        });

        labo.setText("Labotify");

        jLabel3.setText("dawg te voy a save time diciendo que no hice nada aqui por estar haciendo recursion lmfao");

        javax.swing.GroupLayout labot1Layout = new javax.swing.GroupLayout(labot1);
        labot1.setLayout(labot1Layout);
        labot1Layout.setHorizontalGroup(
            labot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labot1Layout.createSequentialGroup()
                .addGroup(labot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labot1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(labot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregar)
                            .addGroup(labot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(listar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(menus, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addGroup(labot1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(labot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(labot1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(labo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        labot1Layout.setVerticalGroup(
            labot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labot1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar)
                .addGap(18, 18, 18)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menus)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menucanLayout = new javax.swing.GroupLayout(menucan.getContentPane());
        menucan.getContentPane().setLayout(menucanLayout);
        menucanLayout.setHorizontalGroup(
            menucanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menucanLayout.setVerticalGroup(
            menucanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setText("Recursion");

        convertidor.setText("Convertidor Binario");
        convertidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertidorActionPerformed(evt);
            }
        });

        mult.setText("MultiplicacionMatrices");
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });

        menu2.setText("Menu");
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(convertidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(menu2)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(convertidor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu2)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout recuLayout = new javax.swing.GroupLayout(recu.getContentPane());
        recu.getContentPane().setLayout(recuLayout);
        recuLayout.setHorizontalGroup(
            recuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        recuLayout.setVerticalGroup(
            recuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setText("Recursion");

        binadec.setText("Binario a Decimal");
        binadec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binadecActionPerformed(evt);
            }
        });

        decabin.setText("Decimal a Binario");
        decabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decabinActionPerformed(evt);
            }
        });

        menurec.setText("Menu Recursion");
        menurec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menurecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menurec)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(decabin)
                                .addComponent(binadec))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel2)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(binadec)
                .addGap(18, 18, 18)
                .addComponent(decabin)
                .addGap(18, 18, 18)
                .addComponent(menurec)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout convLayout = new javax.swing.GroupLayout(conv.getContentPane());
        conv.getContentPane().setLayout(convLayout);
        convLayout.setHorizontalGroup(
            convLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        convLayout.setVerticalGroup(
            convLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labot.setText("Labotify");
        labot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labotActionPerformed(evt);
            }
        });

        recursion.setText("Recursion");
        recursion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recursionActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        titulo.setText("Proyecto - Laboratorio P1 Gerardo Cano(12151024)");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(93, 93, 93))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labot)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(salir))))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(recursion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titulo)
                .addGap(43, 43, 43)
                .addComponent(labot)
                .addGap(12, 12, 12)
                .addComponent(recursion)
                .addGap(18, 18, 18)
                .addComponent(salir)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labotActionPerformed
        dispose();
        menucan.setLocationRelativeTo(null);
        menucan.setVisible(true);
        menucan.setResizable(false);
        menucan.pack();
    }//GEN-LAST:event_labotActionPerformed

    private void recursionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recursionActionPerformed
        dispose();
        recu.setLocationRelativeTo(null);
        recu.setVisible(true);
        recu.setResizable(false);
        recu.pack();
    }//GEN-LAST:event_recursionActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        String op="";
        
        song.agregar();
         op = JOptionPane.showInputDialog("Desea Ingresar otra cancion?s/n");
         
       
    }//GEN-LAST:event_agregarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        
        
        JOptionPane.showMessageDialog(null, song.aString());
       
    }//GEN-LAST:event_listarActionPerformed

    private void inforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inforActionPerformed
        
    }//GEN-LAST:event_inforActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        
    }//GEN-LAST:event_modActionPerformed

    private void menusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusActionPerformed
        menucan.dispose();
        setVisible(true);

    }//GEN-LAST:event_menusActionPerformed

    private void convertidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertidorActionPerformed
        recu.dispose();
        conv.setLocationRelativeTo(null);
        conv.setSize(420,300);
        conv.setResizable(false);
        conv.setVisible(true);
        
    }//GEN-LAST:event_convertidorActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        int fila1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fila de la primera matriz"));
        int col1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna de la primera matriz"));
        int fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fila de la segunda matriz"));
        int col2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna de la segunda matriz"));
        if(col1!=fila2){
            JOptionPane.showMessageDialog(null, "Es imposible hacer esta operacion");
        }else{
            JOptionPane.showMessageDialog(null, "Matriz 1:"+"\n"+recur.print(recur.randommat(fila1, col1)));
            
            JOptionPane.showMessageDialog(null, "Matriz 2:"+"\n"+recur.print(recur.randommat(fila2, col2)));
            int [][] mat2 = recur.randommat(fila2, col2); 
            int [][] mat = recur.randommat(fila1, col1); 
            //JOptionPane.showMessageDialog(null, recur.print(recur.multiplicarmat(fila1, col1,mat , fila2, col2, mat2)));
        }
    }//GEN-LAST:event_multActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        recu.dispose();
        setVisible(true);
    }//GEN-LAST:event_menu2ActionPerformed

    private void binadecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binadecActionPerformed
       String bin = JOptionPane.showInputDialog("Ingrese un numero binario");
        JOptionPane.showMessageDialog(null, "El numero "+bin+" a Decimal es "+recur.binAdec(bin));
    }//GEN-LAST:event_binadecActionPerformed

    private void decabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decabinActionPerformed
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un decimal que desea pasar a binario "));
        JOptionPane.showMessageDialog(null, "El numero "+num+" a binario es: "+recur.decAbin(num));
        
    }//GEN-LAST:event_decabinActionPerformed

    private void menurecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menurecActionPerformed
        conv.dispose();
        recu.setVisible(true);
    }//GEN-LAST:event_menurecActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton binadec;
    private javax.swing.JFrame conv;
    private javax.swing.JButton convertidor;
    private javax.swing.JButton decabin;
    private javax.swing.JButton eliminar;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton infor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labo;
    private javax.swing.JButton labot;
    private javax.swing.JPanel labot1;
    private javax.swing.JButton listar;
    private javax.swing.JButton menu2;
    private javax.swing.JFrame menucan;
    private javax.swing.JButton menurec;
    private javax.swing.JButton menus;
    private javax.swing.JButton mod;
    private javax.swing.JButton mult;
    private javax.swing.JFrame recu;
    private javax.swing.JButton recursion;
    private javax.swing.JButton salir;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
 public int decAbin(int decimal_number)
    {
        if (decimal_number == 0)
            return 0;
             
        else
         
        return (decimal_number % 2 + 10 *
                decAbin(decimal_number / 2));
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Janela_Principal extends javax.swing.JFrame {
    
    static String senha = "";
    
    /**
     * Creates new form Janela_Principal
     */
    public Janela_Principal() {
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

        JanelaInternaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Arquivo = new javax.swing.JMenu();
        Item_Venda_Direta = new javax.swing.JMenuItem();
        Item_Clientes = new javax.swing.JMenuItem();
        Item_Fornecedores = new javax.swing.JMenuItem();
        Item_Estoque = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout JanelaInternaPrincipalLayout = new javax.swing.GroupLayout(JanelaInternaPrincipal);
        JanelaInternaPrincipal.setLayout(JanelaInternaPrincipalLayout);
        JanelaInternaPrincipalLayout.setHorizontalGroup(
            JanelaInternaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JanelaInternaPrincipalLayout.setVerticalGroup(
            JanelaInternaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        Menu_Arquivo.setText("Arquivo");
        Menu_Arquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ArquivoActionPerformed(evt);
            }
        });

        Item_Venda_Direta.setText("Venda Direta");
        Item_Venda_Direta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_Venda_DiretaActionPerformed(evt);
            }
        });
        Menu_Arquivo.add(Item_Venda_Direta);

        Item_Clientes.setText("Clientes");
        Menu_Arquivo.add(Item_Clientes);

        Item_Fornecedores.setText("Fornecedores");
        Menu_Arquivo.add(Item_Fornecedores);

        Item_Estoque.setText("Estoque");
        Menu_Arquivo.add(Item_Estoque);

        jMenuBar1.add(Menu_Arquivo);

        jMenu2.setText("Sobre");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JanelaInternaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JanelaInternaPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
            .addKeyEventDispatcher(new KeyEventDispatcher() {
                @Override
                public boolean dispatchKeyEvent(KeyEvent event) {
                    if(event.getID() == KeyEvent.KEY_RELEASED 
                       && event.getKeyCode() == KeyEvent.VK_F5){
                        Tela_de_Venda obj = new Tela_de_Venda();
                        JanelaInternaPrincipal.add(obj);
                        obj.setVisible(true);
                           return true;
                           
                           
                     }
                     else
                     if(event.getID() == KeyEvent.KEY_RELEASED 
                       && event.getKeyCode() == KeyEvent.VK_ESCAPE){
                        //JOptionPane.showMessageDialog(null,"Deseja Sair ?");//
                        
                        Object[] options = { "Sim", "Não" };   
                 int opcao = JOptionPane.showOptionDialog(null,"Deseja Sair ?","Tem certeza ?"
                 ,JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                 
                        if (opcao == 0){
                            System.exit(0);
                        }
                        
                           return true;
                     }
                     return false;
                }
        }); 
        
        this.setExtendedState(MAXIMIZED_BOTH);//DEFINE A JANELA PARA INICIAR MAXIMIZADA
        
        java.io.File DIRETORIO = new java.io.File("C:\\Financial_Application_Testing");
        DIRETORIO.mkdir();//CRIA A PASTA DO PROGRAMA
        
        java.io.File autenticador = new java.io.File(DIRETORIO,"Autenticador.txt");
        
        try {
            autenticador.createNewFile();//CRIA O ARQUIVO TXT
        } catch (IOException ex) {
            Logger.getLogger(Janela_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*FileWriter escrever = null;//INICIO ESCRITA NO ARQUIVO
        try {
            escrever = new FileWriter(autenticador);
        } catch (IOException ex) {
            Logger.getLogger(Janela_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PrintWriter gravarArq = new PrintWriter(escrever);
        
        {
              gravarArq.println("THMPV-77D6F-94376-8HGKG-VRDRQ");
        }
        
        try {
            escrever.close();
        } catch (IOException ex) {
            Logger.getLogger(Janela_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/////FIM ESCRITA NO ARQUIVO
        
        File ARQUIVO = new File("C:\\Financial_Application_Testing\\Autenticador.txt");//PRIMEIRA PARTE PARA LEITURA
        
        FileReader fileReader;
        try {
            
            fileReader = new FileReader(ARQUIVO);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            try {
                String SERIAL = bufferedReader.readLine();//RECEBE O SERIAL DO ARQUIVO
                if(SERIAL.equals("THMPV-77D6F-94376-8HGKG-VRDRQ")){
                    JOptionPane.showMessageDialog(null,"Serial Válido");
                }
                else
                if(!SERIAL.equals("THMPV-77D6F-94376-8HGKG-VRDRQ")){
                    JOptionPane.showMessageDialog(null,"O sistema será encerrado.","Serial Inválido",JOptionPane.WARNING_MESSAGE);
                    System.exit(0);
                }
            } catch (IOException ex) {
                Logger.getLogger(Janela_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Janela_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }//GEN-LAST:event_formWindowOpened

    private void Menu_ArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ArquivoActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_Menu_ArquivoActionPerformed

    private void Item_Venda_DiretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_Venda_DiretaActionPerformed
        // TODO add your handling code here:
        
        Tela_de_Venda obj = new Tela_de_Venda();
        JanelaInternaPrincipal.add(obj);
        obj.setVisible(true);
        
    }//GEN-LAST:event_Item_Venda_DiretaActionPerformed

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
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Password psw = new Password();
                
                while(!senha.equals(psw.senha)){
                    senha = psw.senha;//JOptionPane.showInputDialog(null,"Digite a Senha do Administrador ","Autenticação Necessária",JOptionPane.WARNING_MESSAGE);
                    
                    if(!senha.equals(psw.senha)){
                        JOptionPane.showMessageDialog(null,"Senha incorreta, tente novamente","Aviso",JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
                
                new Janela_Principal().setVisible(true);

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Item_Clientes;
    private javax.swing.JMenuItem Item_Estoque;
    private javax.swing.JMenuItem Item_Fornecedores;
    private javax.swing.JMenuItem Item_Venda_Direta;
    private javax.swing.JDesktopPane JanelaInternaPrincipal;
    private javax.swing.JMenu Menu_Arquivo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

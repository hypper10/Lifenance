package gui;

import gui.JDialog.JDialogTelaConfig;
import gui.panels.*;
import java.awt.CardLayout;
import javax.swing.*;
import jiconfont.icons.font_awesome.FontAwesome;
import util.TelaUtils;

public class TelaPrincipal extends javax.swing.JFrame {
    //Atributos
    private final CardLayout panelPrincipal;

    //Creates new form TelaPrincipal
    public TelaPrincipal() {
        initComponents();
        panelPrincipal = (CardLayout) jPanelPrincipal.getLayout();
    }
    
    public void setLookAndFeel(LookAndFeel tema) {
        try {
            UIManager.setLookAndFeel(tema);
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
            jLabelLogo.setIcon(TelaUtils.getIconFontAwesome(FontAwesome.BOOK, 42)); 
        } catch (UnsupportedLookAndFeelException erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuPrincipal = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jButtonConfig = new javax.swing.JButton();
        jButtonCartao = new javax.swing.JButton();
        jButtonDespesa = new javax.swing.JButton();
        jButtonVisualizar = new javax.swing.JButton();
        jButtonReceita = new javax.swing.JButton();
        jButtonBanco = new javax.swing.JButton();
        jButtonReceita1 = new javax.swing.JButton();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelTelaPrincipal = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Lifenance");
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLabelLogo.setFont(new java.awt.Font("Montserrat", 1, 25)); // NOI18N
        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(TelaUtils.getIconFontAwesome(FontAwesome.BOOK, 42));
        jLabelLogo.setText("Lifenance");
        jLabelLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabelLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoMouseClicked(evt);
            }
        });

        jButtonConfig.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jButtonConfig.setText("Configura��o");
        jButtonConfig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigActionPerformed(evt);
            }
        });

        jButtonCartao.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jButtonCartao.setText("Registrar cart�o");
        jButtonCartao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCartaoActionPerformed(evt);
            }
        });

        jButtonDespesa.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jButtonDespesa.setText("<html><center>Registrar<br> Despesa</br><cemter></html>");
        jButtonDespesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonVisualizar.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jButtonVisualizar.setText("Visualizar");
        jButtonVisualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonReceita.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jButtonReceita.setText("<html><center>Registrar<br>Receita</br><center></html>");
        jButtonReceita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonBanco.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jButtonBanco.setText("<html><center>Registrar<br>Banco</br><center></html>");
        jButtonBanco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBancoActionPerformed(evt);
            }
        });

        jButtonReceita1.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jButtonReceita1.setText("<html><center>Registrar<br>Conta</br><center></html>");
        jButtonReceita1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonReceita1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceita1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuPrincipalLayout = new javax.swing.GroupLayout(jPanelMenuPrincipal);
        jPanelMenuPrincipal.setLayout(jPanelMenuPrincipalLayout);
        jPanelMenuPrincipalLayout.setHorizontalGroup(
            jPanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDespesa)
                    .addComponent(jButtonVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReceita)
                    .addComponent(jButtonBanco)
                    .addComponent(jButtonReceita1))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanelMenuPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonBanco, jButtonCartao, jButtonConfig, jButtonDespesa, jButtonReceita, jButtonVisualizar});

        jPanelMenuPrincipalLayout.setVerticalGroup(
            jPanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReceita1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanelMenuPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonBanco, jButtonCartao, jButtonConfig, jButtonDespesa, jButtonReceita, jButtonVisualizar});

        jPanelPrincipal.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanelTelaPrincipalLayout = new javax.swing.GroupLayout(jPanelTelaPrincipal);
        jPanelTelaPrincipal.setLayout(jPanelTelaPrincipalLayout);
        jPanelTelaPrincipalLayout.setHorizontalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1041, Short.MAX_VALUE)
        );
        jPanelTelaPrincipalLayout.setVerticalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
        );

        jPanelPrincipal.add(jPanelTelaPrincipal, "telaPrincipal");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jMenu1.setText("Arquivo");

        jMenu3.setText("jMenu3");
        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoMouseClicked
        try {
            panelPrincipal.show(jPanelPrincipal, "telaPrincipal");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabelLogoMouseClicked

    private void jButtonConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigActionPerformed
        try {
            JDialogTelaConfig telaConfig = new JDialogTelaConfig(this, true);
            telaConfig.setVisible(true);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConfigActionPerformed

    private void jButtonBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBancoActionPerformed
        try {
            JPanelBanco banco = new JPanelBanco(this);
            jPanelPrincipal.add(banco, "telaBanco");
            panelPrincipal.show(jPanelPrincipal, "telaBanco");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBancoActionPerformed

    private void jButtonCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCartaoActionPerformed
       try {
            JPanelCartao cartao = new JPanelCartao(this);
            jPanelPrincipal.add(cartao, "telaCartao");
            panelPrincipal.show(jPanelPrincipal, "telaCartao");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCartaoActionPerformed

    private void jButtonReceita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceita1ActionPerformed
        try {
            JPanelConta conta = new JPanelConta(this);
            jPanelPrincipal.add(conta, "telaConta");
            panelPrincipal.show(jPanelPrincipal, "telaConta");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonReceita1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBanco;
    private javax.swing.JButton jButtonCartao;
    private javax.swing.JButton jButtonConfig;
    private javax.swing.JButton jButtonDespesa;
    private javax.swing.JButton jButtonReceita;
    private javax.swing.JButton jButtonReceita1;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelMenuPrincipal;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTelaPrincipal;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

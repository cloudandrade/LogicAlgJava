package srcT1P2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Botao01 extends JFrame {
    
     private JButton finalizar;
    
    
  public Botao01() {
         
  Icon Prato_Pronto = new ImageIcon("src\\ImagemT1P2\\Botao_OP_A.jpg");
  finalizar = new JButton(Prato_Pronto);
  add(finalizar);
  setTitle("Conclusão Labirinto");
  setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  setSize(1285,775);
  setLocationRelativeTo(null);
  setVisible(true);
  setResizable(false);

    EscolhaBotao executar = new EscolhaBotao();
    finalizar.addActionListener(executar);   

    }
    
    
    
    private class EscolhaBotao implements ActionListener {
        int resultado=0;
        String s="";
       @Override
    public void actionPerformed( ActionEvent e ){
       
        if (e.getSource()==finalizar){
        dispose();
        }          

        }
    }
    }
    

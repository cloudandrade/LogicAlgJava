
package srcT1P1;

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


public class BotaoPortaTres extends JFrame{
     private JButton finalizar;
    
    
  public BotaoPortaTres() {
        
  Icon Prato_Pronto = new ImageIcon("src\\ImagemT1P1\\Botao_porta_tres.jpg");
  finalizar = new JButton(Prato_Pronto);
  add(finalizar);
  setTitle("Conclusão Labirinto");
  setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  setSize(1900,980);
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
    
   
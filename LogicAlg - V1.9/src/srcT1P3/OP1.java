package srcT1P3;

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

public class OP1 extends JFrame {
    
     private JButton finalizar;
    
    
  public OP1() {
          JMenuBar barramenu = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    
    JMenuItem desenvolvedores = new  JMenuItem("Desenvolvedores");
    desenvolvedores.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
    JOptionPane.showMessageDialog(null,"LogicAlg - Projeto desenvolvido por Leonardo dos Santos Esteves - Keven Pacheco Baraúna - Raphael Carvalho Monteiro - Erick Vinicius Pinto dos Santos", "Iinformações", JOptionPane.INFORMATION_MESSAGE);
    }});        

    JMenuItem sair = new  JMenuItem("Sair do Programa");
    sair.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
    System.exit(0);
    }});    
    menu.add(desenvolvedores);
    menu.add(sair);
    barramenu.add(menu);
    setJMenuBar(barramenu); 
  Icon Prato_Pronto = new ImageIcon("src\\ImagemT1P3\\operrada.jpg");
  finalizar = new JButton(Prato_Pronto);
  add(finalizar);
  setTitle("Conclusão Labirinto");
  setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  setSize(1366,768);
  setUndecorated(true);
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
    

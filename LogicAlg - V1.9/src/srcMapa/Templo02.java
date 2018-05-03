package srcMapa;

//import srcCasa01.JanelasErick;
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
import srcTemplo01.JanelasTemplo01;
import srcTemplo02.JanelasTemplo02;

public class Templo02 extends JFrame {

private JButton oplogicos;

public Templo02() {
    JMenuBar barramenu = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenuItem desenvolvedores = new  JMenuItem("Desenvolvedores");
    desenvolvedores.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
    JOptionPane.showMessageDialog(null,"LogicAlg - ", "Informações", JOptionPane.INFORMATION_MESSAGE);
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
    Icon Pegar_Imagem = new ImageIcon("src\\ImagemTemplo02\\botao.png ");

    oplogicos = new JButton(Pegar_Imagem);
    add(oplogicos);
    setTitle("TEMPLO 01");
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    setSize(1280,1024);
    setUndecorated(true);
    setLocationRelativeTo(null);
    setVisible(true);
    setResizable(false);
    Templo02.EscolhaBotao executar = new Templo02.EscolhaBotao();
    oplogicos.addActionListener(executar);  
    //setExtendedState(JFrame.MAXIMIZED_BOTH); 
}

private class EscolhaBotao implements ActionListener {
    int resultado=0;
    String s="";
    @Override
    public void actionPerformed( ActionEvent e ){

    if (e.getSource()==oplogicos){
    new JanelasTemplo02();
    dispose();
    }          
    }
    }
}

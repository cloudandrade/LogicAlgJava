
package srcT1P3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import srcMapa.ConfJanela;

public class JanelasT1P3 extends JFrame{

public JanelasT1P3() {

    JMenuBar barramenu = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenu opcoes = new JMenu("Voltar para o Mapa Principal");
    JMenuItem sobre = new  JMenuItem("Sobre");
    sobre.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {

    JOptionPane.showMessageDialog(null,"LogicAlg_______", "Informações", JOptionPane.INFORMATION_MESSAGE);
    }
    });
    JMenuItem sair = new  JMenuItem("Sair do Programa");
    sair.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
    System.exit(0);
    }
    });    
    JMenuItem voltar = new  JMenuItem("Voltar para o Mapa");
    voltar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
    dispose();
    ConfJanela.getInstancia().setVisible(true);
    }
    });  

    menu.add(sobre);
    menu.add(sair);
    opcoes.add(voltar);
    barramenu.add(menu);
    barramenu.add(opcoes);
    setJMenuBar(barramenu);           

    add(new FaseT1P3());//Vai criar uma fase na janela
    setTitle("Casa 04 - Variáveis");// Este método setTitle vai permiti que seja criado um titulo para a tela.
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// Este método permite fechar a tela do jogo ao clicar no X na parte direita superior. 
    setSize(1285,775);// Este método vai criar o tamalho da janela, neste caso x=coluna e y=linha, nesta ordem
    setLocationRelativeTo(null);//Este método vai fazer com que a tela fique no centro da tela do pc.     
    setVisible(true);// Este método faz com que a tela apareça.
    setResizable(false);// Este método vai fazer com que o usuario não consiga alterar o tamanho da tela.
    }
}

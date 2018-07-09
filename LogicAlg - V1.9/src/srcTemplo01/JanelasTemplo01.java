
package srcTemplo01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import srcMapa.ConfJanela;
import srcMapa.Som;


public class JanelasTemplo01 extends JFrame {//Criar uma classe que vai abriu uma janela para o jogo.
//Essa classe vai estender o JFrame, pra criar as telas, para estender usamos Extendes
private static JFrame janelatemplo1;
private static JFrame trocatela;
    
public JanelasTemplo01() {// Para construir as telas, vamos criar um contrutor da classe, que receber métodos para configuar as janelas.
    janelatemplo1 = new JFrame("Templo 1");
    JMenuBar barramenu = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenu opcoes = new JMenu("Voltar para o Mapa Principal");
    JMenuItem sobre = new  JMenuItem("Sobre");
    sobre.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
    JOptionPane.showMessageDialog(null,"LogicAlg ________", "Informações", JOptionPane.INFORMATION_MESSAGE);
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
    
        ConfJanela.getInstancia().setVisible(true);
        janelatemplo1.dispose();
        Som.play("BGM_MAPA");
    }
    });  

    menu.add(sobre);
    menu.add(sair);
    opcoes.add(voltar);
    barramenu.add(menu);
    barramenu.add(opcoes);
    janelatemplo1.setJMenuBar(barramenu);   

    janelatemplo1.add(new FaseTemplo01());
    janelatemplo1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// Este método permite fechar a tela do jogo ao clicar no X na parte direita superior. 
    janelatemplo1.setUndecorated(false);
    janelatemplo1.setSize(1900,980);// Este método vai criar o tamalho da janela, neste caso x=coluna e y=linha, nesta ordem
   // janelatemplo1.setExtendedState(MAXIMIZED_BOTH);//aplica tamanho maximo da tela
    janelatemplo1.setLocationRelativeTo(null);//Este método vai fazer com que a tela fique no centro da tela do pc.     
    janelatemplo1.setVisible(true);// Este método faz com que a tela apareça.
    janelatemplo1.setResizable(false);// Este método vai fazer com que o usuario não consiga alterar o tamanho da tela.
    
    }

public static JFrame getInstancia(){
    return janelatemplo1;
}


}

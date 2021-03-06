
package srcTemplo02;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import srcMapa.ConfJanela;
import srcMapa.Som;


public class JanelasTemplo02 extends JFrame {//Criar uma classe que vai abriu uma janela para o jogo.
//Essa classe vai estender o JFrame, pra criar as telas, para estender usamos Extendes
    
    private static JFrame janelastemplo2;

public JanelasTemplo02() {// Para construir as telas, vamos criar um contrutor da classe, que receber métodos para configuar as janelas.
   janelastemplo2 = new JFrame("Templo 2");
    
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
    dispose();
        ConfJanela.getInstancia().setVisible(true);
        Som.play("BGM_MAPA");
    }
    });  

    menu.add(sobre);
    menu.add(sair);
    opcoes.add(voltar);
    barramenu.add(menu);
    barramenu.add(opcoes);
    janelastemplo2.setJMenuBar(barramenu);   

    janelastemplo2.add(new FaseTemplo02()); 
    janelastemplo2.setTitle("Templo 02");// Este método setTitle vai permiti que seja criado um titulo para a tela.
    janelastemplo2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// Este método permite fechar a tela do jogo ao clicar no X na parte direita superior. 
    janelastemplo2.setUndecorated(true);
    janelastemplo2.setSize(1366,768);// Este método vai criar o tamalho da janela, neste caso x=coluna e y=linha, nesta ordem
    janelastemplo2.setExtendedState(MAXIMIZED_BOTH);
    janelastemplo2.setLocationRelativeTo(null);//Este método vai fazer com que a tela fique no centro da tela do pc.     
    
    janelastemplo2.setVisible(true);// Este método faz com que a tela apareça.
    janelastemplo2.setResizable(false);// Este método vai fazer com que o usuario não consiga alterar o tamanho da tela.
    
 //   setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }

public static JFrame getInstancia(){
    return janelastemplo2;
}

}

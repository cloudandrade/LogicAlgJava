
package srcTemplo01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import srcMapa.ConfJanela;
import srcMapa.Menu;
import srcMapa.Som;


public class JanelasTemplo01 extends JFrame {//Criar uma classe que vai abriu uma janela para o jogo.
//Essa classe vai estender o JFrame, pra criar as telas, para estender usamos Extendes
private static JFrame janelatemplo1;
private static JFrame trocatela;
    
public JanelasTemplo01() {// Para construir as telas, vamos criar um contrutor da classe, que receber métodos para configuar as janelas.
    janelatemplo1 = new JFrame("Templo 1");
    JMenuBar barramenu = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    
   //---------------excluir este item após conclusão--------------
    JMenuItem sair = new  JMenuItem("Sair do Programa");
    sair.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
    System.exit(0);
    }
    }); 
   //---------------------------------------------------------------- 
    JMenuItem voltar = new  JMenuItem("Voltar ao Menu Principal");
    voltar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
      
        
      new Menu(); //instanciando a classe meu frame para poder usar os metodos dela.
      trocatela = Menu.getInstancia();
     // trocatela.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      trocatela.show();
     janelatemplo1.dispose();
    }
    });    
   
    
   
    menu.add(voltar);
    //-----------------
    menu.add(sair);
    //------------------
    barramenu.add(menu);
    janelatemplo1.setJMenuBar(barramenu);   

    janelatemplo1.add(new FaseTemplo01());
    janelatemplo1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// Este método permite fechar a tela do jogo ao clicar no X na parte direita superior. 
    janelatemplo1.setUndecorated(true);
    janelatemplo1.setSize(1366,768);// Este método vai criar o tamalho da janela, neste caso x=coluna e y=linha, nesta ordem
   // janelatemplo1.setExtendedState(MAXIMIZED_BOTH);//aplica tamanho maximo da tela
    janelatemplo1.setLocationRelativeTo(null);//Este método vai fazer com que a tela fique no centro da tela do pc.     
    janelatemplo1.setVisible(true);// Este método faz com que a tela apareça.
    janelatemplo1.setResizable(false);// Este método vai fazer com que o usuario não consiga alterar o tamanho da tela.
    
    }

public static JFrame getInstancia(){
    return janelatemplo1;
}


}

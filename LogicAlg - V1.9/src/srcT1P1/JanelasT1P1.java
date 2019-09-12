
package srcT1P1;
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


public class JanelasT1P1 extends JFrame {//Criar uma classe que vai abriu uma janela para o jogo.
//Essa classe vai estender o JFrame, pra criar as telas, para estender usamos Extendes
private static JFrame jt1p1;
private static JFrame trocatela;
    
    
public JanelasT1P1() {// Para construir as telas, vamos criar um contrutor da classe, que receber métodos para configuar as janelas.
    jt1p1 = new JFrame("Templo 1 - Nivel 1");
    
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
     jt1p1.dispose();
    }
    });    
   
    
   
    menu.add(voltar);
    //-----------------
    menu.add(sair);
    //------------------
    barramenu.add(menu);
    jt1p1.setJMenuBar(barramenu);   

    jt1p1.add(new FaseT1P1()); 
    jt1p1.setTitle("Nível 01 - Templo 01");// Este método setTitle vai permiti que seja criado um titulo para a tela.
    jt1p1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// Este método permite fechar a tela do jogo ao clicar no X na parte direita superior. 
    jt1p1.setSize(1366,768);// Este método vai criar o tamalho da janela, neste caso x=coluna e y=linha, nesta ordem
    jt1p1.setLocationRelativeTo(null);//Este método vai fazer com que a tela fique no centro da tela do pc.     
    jt1p1.setUndecorated(true);
    jt1p1.setVisible(true);// Este método faz com que a tela apareça.
    jt1p1.setResizable(false);// Este método vai fazer com que o usuario não consiga alterar o tamanho da tela.
    }

public static JFrame getInstancia(){
    return jt1p1;
}

}

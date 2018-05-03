
package srcT2P2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FaseT2P2 extends JPanel implements ActionListener {
    private Image imagemfase;
    private PersonagemT2P2 personagem;
    private Timer tempo;// classe trata o ambiente como thread, se o personagem se mover a tela será atualiada.    

    public FaseT2P2() {
      setFocusable(true);//Para que a tela fique em foco.      
      setDoubleBuffered(true);// Sempre que a imagem seja trocada de uma forma dinamica e não de pra perseber que esta ocorrento uma troca de tela.
      addKeyListener(new Teclado());// Vai pegar os eventos de aperta e soltar o botao para criar um evento no Criador_De_Fases. 
      ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P2\\FundoCasa03.jpg");// Para pegar a imagem que esta na pasta, 
      //será criado um objeto do tipo o ImageIcon.
      imagemfase  = imagem_pasta.getImage();// A imagemfase vai receber a imagem que esta na pasta. 
      personagem = new PersonagemT2P2();
      tempo = new Timer(5, this);//Será definido o tempo onde a imagem da fase será 
      //sempre atualizada para receber a mesma image, o this vai chamar a propria classe Criador_De_Fases.
      tempo.start();//Para ligar o tempo, e fazer com que ele inicie a contagem.        
        
    }
public void paint(Graphics g){//Para fazer a fase aparecer na tela.
      Graphics2D cenario = (Graphics2D) g;//Para trabalhar com imagens 2D, será criado o metodo Graphics2D.
      cenario.drawImage(imagemfase,0,0,null);//Para a imagem aparecer será informado a imagem, e as Coordenadas x e y e 
      //como a imagem não vai mecher ele vai receber um valor null
      cenario.drawImage(personagem.getImagempersonagem(),personagem.getCoord_P_x(),personagem.getCoord_P_y(),this);
      //Para que o personagem apareça na tela será informado as coordenadas do personagem,o this vai chamar a propria classe Criador_De_Fases.
      g.dispose(); //Quando o pesonagem andar este metodo vai apagar o movimento anterior.   
    }

    @Override
    public void actionPerformed(ActionEvent ae) { //Para qeu seja impementado um dos metodos da classe pai
    personagem.andar(); //que passar o tempo, este metodo será chamado. O metodo utilizado foi para que o personagem possa andar.
     repaint();//Sempre que o boneco andar a imagem da fase se, ele vai exibir na tela a imagem da fase acada tempo,
     //neste caso 5 milesegundos "tempo = new Timer(5, this)".
    }
    
    private class Teclado extends KeyAdapter{//classe criada para pegar os eventos de aperta e soltar botão.

        @Override
        public void keyReleased(KeyEvent ke) {//Implementar os metodos keyReleased
            personagem.keyReleased(ke); //O metodo de aperta e solta o botao será chamado.
        }

        @Override
        public void keyPressed(KeyEvent ke) { //Implementar os metodos keyPressed
            personagem.keyPressed(ke); //O metodo de aperta e solta o botao será chamado.
        }   
}           

}

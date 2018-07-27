package srcMapa;
//FASE\\
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.JPanel;
import javax.swing.Timer;
import sun.audio.AudioPlayer;

public class Fase extends JPanel implements ActionListener { //CLASSE FASE - PARA CONTROLAR TODO MAPA DO JOGO
   
    private Personagem personagem; // IMAGEM DO PERSONAGEM
    private Fundo fundoo; //IMAGEM DO FUNDO
    private Timer tempo;//TEMPO PARA PRINTAR A TELA
 

    public Fase() {//METODO CONSTRUTOR
        
        addKeyListener(new TecladoAdapter());//ADICIOANDO PARA A IMAGEM SEGUIR AS TECLAS QUE O USUARIO DIGITAR
     
        setDoubleBuffered(true);//NEM LEMBRO OQ FOI KKKK, VOU MARCAR PRA DPS VER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        setFocusable(true);//NEM LEMBRO OQ FOI KKKKKK, VOU MARCAR PRA DPS VER \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        
         personagem = new Personagem();// REFERENCIA E A IMAGEM DO PERSONAGEM
         fundoo = new Fundo();// FUNDOO  E A IMAGEM DO FUNDO QUE IRA FICAR SE MOVIMENTANDO
        
        tempo = new Timer(3,this);//DEFININDO PARA A IAMGEM PRINTAR NA TELA A CADA 7 MILESEGUNDOS
        tempo.start();//INICINADO ESSE TEMPO
        Som.play("BGM_MAPA");
       
       
        
    }
    

    
    @Override
    public void paint(Graphics g){//PARA TRABALHAR COM GRAFICOS 2D
        
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundoo.getImagem(),fundoo.getX(),fundoo.getY(),this);//IMAGEM DE FUNDO
        graficos.drawImage(personagem.getImagem(),personagem.getX(),personagem.getY(),this);//IMAGEM DO PERSONAGEM
        
        g.dispose();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
     fundoo.mexer();//PARA PRINTAR O FUNDO QUNADO ELE SE MOVIMENTAR
     personagem.mexer();//PARA PRINTAR O BONECO QUNADO ELE SE MOVIMENTAR
     repaint();//PARA REPRINTAR A TELA

     
    }
   
    
  private class TecladoAdapter extends KeyAdapter{ // PARA LER QUANDO O USUARIO DIGITAR ALGO
 
        @Override
        public void keyReleased(KeyEvent ke) {
            
            if (personagem.getX()>700){//SE O PERSONAGEM ESTIVER NO MEIO DA TELA ELE ENTRA AQUI
            fundoo.keyReleased(ke);//O FUNDO SE MOVIMENTA
            personagem.keyReleased(ke); //O PERSONAGEM SE MOVIMENTAR      
            }
            if (personagem.getX()<700){//SE O PERSONAGEM NÃO ESTIVER NO CENTRO DA TELA ELE ENTRA AQUI
            personagem.keyReleased(ke);//O PERSONAGEM SE MOMENTA NORMALMENTE
            }
            
        }
      
        @Override
        public void keyPressed(KeyEvent ke) {
            if(personagem.getX()>700){//SE O PERSONAGEM ESTIVER NO MEIO DA TELA ELE ENTRA AQUI
            fundoo.keyPressed(ke);//O FUNDO SE MOVIMENTAR 
            personagem.keyPressed(ke);//O PERSONAGEM SE MOVIMENTAR 
            }
            if (personagem.getX()<700){//SE O PERSONAGEM NÃO ESTIVER NO CENTRO DA TELA ELE ENTRA AQUI
            personagem.keyPressed(ke);//O PERSONAGEM SE MOVIMENTAR 
            }
        }   
  }     
   
    
}

package srcMapa;
//BINECO\\
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.time.Clock;
import javax.swing.ImageIcon;

public class Personagem {
    
    private int x;//CORDENADA 
    private int y;//CORDENADA 
    private int dx;//CORDENADA 
    private int dy;//CORDENADA 
    private Image imagem;//IMAGEM DO PERSONAGEM

    public Personagem() {
        
        ImageIcon referencia = new ImageIcon("src\\ImagemMapa\\Boneco.png"); // CRIANDO O PERSONAGEM E PEGANDO A IAMGEM DA - src\\Imagens\\Boneco.png
        imagem = referencia.getImage();// "IMAGEM" VAI RECEBER A IMAGEM QUE ESTA NA PASTA
        
        this.x=680; // O PERSONAGEM VAI COMEÇAR NA POSIÇÃO X =100//posição do personagem horizontelmente
        this.y= 680; // O PERSONAGEM VAI COMEÇAR NA POSIÇÃO Y =475//posição do personagem verticalmente
    }//posições referentes ao mapa principal
    
    public void mexer(){//PARA SE MOVIMENTAR
        
        //System.out.println("PERSONAGEM = " + x);
        x +=dx; // A POSIÇÃO X DO PERSONAGEM VAI RECEBER X + DX ( DX É DEFINIDO PELO keyPressed )
        y +=dy; // A POSIÇÃO Y DO PERSONAGEM VAI RECEBER Y + Dy ( DY É DEFINIDO PELO keyPressed )

               
   if (x<-702){//PARA QUE O PERSONAGEM NÃO SAIA PELO LADO ESQUERDO DA TELA
       x=-702;//PARA QUE O PERSONAGEM NÃO SAIA PELO LADO ESQUERDO DA TELA
        //x=-702;//PARA QUE O PERSONAGEM NÃO SAIA PELO LADO ESQUERDO DA TELA
   }//PARA QUE O PERSONAGEM NÃO SAIA PELO LADO ESQUERDO DA TELA
   
   if (x>=703){//PARA QUE O PERSONAGEM NÃO SAIA DO MEIO DA TELA
       x=x-1;//PARA QUE O PERSONAGEM NÃO SAIA DO MEIO DA TELA
   }//PARA QUE O PERSONAGEM NÃO SAIA DO MEIO DA TELA

       
    }
   
    
    public int getX() {//PARA PEGAR A POSIÇÃO X DO PERSONAGEM
        return x;
    }

    public int getY() {//PARA PEGAR A POSIÇÃO Y DO PERSONAGEM
        return y;
    }

    public Image getImagem() {//PARA PEGAR A IMAGEM DO PERSONAGEM
        return imagem;
    }
    
    public void keyPressed(KeyEvent tecla){//PARA RECEBER DADOS DA TECLA DO PERSONAGEM - AO APERTAR
    int codigo = tecla.getKeyCode();//CODIGO ´É O NOME DA VARIAVEL DA TECLA QUE O USUARIO DIGITAR

    if (codigo == KeyEvent.VK_LEFT){//SE FOR PRA ESQUERDA
      //  dx = -1;
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemMapa\\Esquerda.gif");//.gif 
        imagem = imagem_pasta.getImage();
    }
    if (codigo == KeyEvent.VK_RIGHT){//SE FOR PRA DIREITA
        dx = 1;
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemMapa\\Direita.gif");//.gif 
        imagem = imagem_pasta.getImage();    
    }

    }    
    
    public void keyReleased(KeyEvent tecla){//PARA RECEBER DADOS DA TECLA DO PERSONAGEM - AO SOLTAR
    
     int codigo = tecla.getKeyCode(); //CODIGO ´É O NOME DA VARIAVEL DA TECLA QUE O USUARIO DIGITAR   
  
    if (codigo == KeyEvent.VK_LEFT){//SE FOR PRA ESQUERDA
        //dx = 0;
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemMapa\\esquerdaPerso.png"); 
        imagem = imagem_pasta.getImage();        
    }
    
    if (codigo == KeyEvent.VK_RIGHT){//SE FOR PRA DIREITA
        dx = 0;
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemMapa\\Boneco.png"); 
       imagem = imagem_pasta.getImage();        
    }
 
    }  
    
    
}
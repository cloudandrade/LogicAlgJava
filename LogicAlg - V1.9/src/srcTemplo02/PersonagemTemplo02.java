package srcTemplo02;

import java.awt.Image;
import java.awt.event.KeyEvent; 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import srcMapa.ConfJanela;
import srcT1P1.JanelasT1P1;
import srcT1P2.JanelasT1P2;
import srcT1P3.JanelasT1P3;
import srcT2P1.JanelasT2P1;
import srcT2P2.JanelasT2P2;

public class PersonagemTemplo02 extends JFrame{
    private int Coord_P_x,Coord_P_y; // Coordenadas do Personagem= Coord_P, coluna=x, linha=y
    private int Coord_M_x,Coord_M_y; // Coordenadas para movimentar o personagem= Coord_M, coluna=x, linha=y
    private Image imagempersonagem; // Criar a imagem do personagem da classe Image
    private int enter=0;

    public PersonagemTemplo02() { // Terá que criar um cnstrutor para que a imagem apareça e o local onde ela vai ficar na tela. 
        //Foi criada uma pasta com as imagem que vai ser colocadas no jogo.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemTemplo02\\direito.png");// Para pegar a imagem que esta na pasta, será criado um objeto do tipo o ImageIcon.
        imagempersonagem = imagem_pasta.getImage();// A imagempersonagem vai receber a imagem que esta na pasta. 
        this.Coord_P_x=81;//Local do personagem na tela: "coluna".
        this.Coord_P_y=730;//Local do personagem na tela: "linha".      
    }
    
    public void andar(){ //Criar um metodo para que o personagegm ande na tela.
       Coord_P_x += Coord_M_x; //A Coordenada do personagem vai somar com a Coordenada de movimentos na tela.
       Coord_P_y += Coord_M_y; //A Coordenada do personagem vai somar com a Coordenada de movimentos na tela.  
       
          //System.err.println("PERSONAGEM TEMPLO 02 = " + Coord_P_x);    
          
       if (Coord_P_x<=29){ // Para não ultrapassar a parede esquerda. //29
       Coord_P_x=29+1;  
       }
       
       if (Coord_P_x>=1151){ // Para não ultrapassar a parede direita.//1151
       Coord_P_x=1151-1;  
       }
//-------------Escolha PORTA ------------

//        if ((Coord_P_x>=175) && (Coord_P_x<=333)&& (enter==1)){ 
//      
//       dispose();
//        ConfJanela.getInstancia().setVisible(true);
//            
//        enter=0;
//        }              
//-------------Escolha DICA ------------

        if ((Coord_P_x>=1010) && (Coord_P_x<=1150)&& (enter==1)){ 
        new BotaoDicas().show();
        enter=0;
        }

//-------------Escolha mesa 01 ------------

        if ((Coord_P_x>=175) && (Coord_P_x<=333)&& (enter==1)){ 
            
  
    new JanelasT2P1().show();   
    ConfJanela.getInstancia().setVisible(false);
    enter=0;
        }
//-------------Escolha mesa 02 ------------
        if ((Coord_P_x>=480) && (Coord_P_x<=649)&& (enter==1)){ 
        new JanelasT2P2().show(); 
        enter=0;
        }    
//-------------Escolha mesa 03 ------------
        if ((Coord_P_x>=804) && (Coord_P_x<=982)&& (enter==1)){ 
        new JanelasT1P3().show();
        enter=0;
        }
        
    if ((Coord_P_x>=56 && Coord_P_x<=151)&& (enter==1)){     
    
    //new ConfJanela(); 
   // setVisible(false);
   // System.exit(0);
   //dispose();
    
    }
        
        
       }               
                 
     

    public int getCoord_P_x() {// Será necessario pegar as Coordenadas do personagem getCoord_P_x.
        return Coord_P_x;
    }

    public int getCoord_P_y() {// Será necessario pegar as Coordenadas do personagem getCoord_P_y.
        return Coord_P_y;
    }

    public Image getImagempersonagem() {// Será necessario pegar a imagem do personagem.
        return imagempersonagem;
    }
    
    //Como será necessario pegar os dados que o usuario vai digitar no teclado vamos utilizar um metodo que vai 
    //interpretar os botões de setar para baico, para cima, para direira e para esquerda.
    //Obs.: Colunas e linhas começam com 0.
    
    public void keyPressed(KeyEvent botao){//Receber dados ao aperta a tecla do teclado. Ao aperta a Coordenada de movimento vai somar ou subtrair.
    int botao_escolhido = botao.getKeyCode();//Será comporado o botão que o usuario vai clicar com o metodo KeyCode, que consegue saber qual foi a tecla.
    int aperte_enter = botao.getKeyCode();

    if (botao_escolhido == KeyEvent.VK_LEFT){//Se for igual a seta para esquerda.
        Coord_M_x = -1; // Se o usuario for para esquerda a posição que ele esta vai diminuir.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemTemplo02\\personagem_esquerda.gif"); 
        imagempersonagem = imagem_pasta.getImage();
    }
    if (botao_escolhido == KeyEvent.VK_RIGHT){//Se for igual a seta para diraita
        Coord_M_x = 1; // Se o usuario for para direita a posição que ele esta vai aumentar.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemTemplo02\\personagem_direita.gif"); 
        imagempersonagem = imagem_pasta.getImage();    
    }  
    if (aperte_enter == KeyEvent.VK_ENTER){//Criado para que a caixa com as opções que ficam no tapete apareçam
        enter = 1; // Se aperta enter ele recebe 1       
    }     
    }    

    public void keyReleased(KeyEvent botao){//Receber dados ao sooltar a tecla do teclado. Ao soltar a Coordenada de movimento vai receber um valor nulo.
    
     int botao_escolhido = botao.getKeyCode();//Será comporado o botão que o usuario vai clicar com o metodo KeyCode, que consegue saber qual foi a tecla.
     int aperte_enter = botao.getKeyCode();
   
    if (botao_escolhido == KeyEvent.VK_LEFT){//Se for igual a seta para esquerda.
        Coord_M_x = 0;// Se o usuario for para esquerda a posição que ele esta vai diminuir.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemTemplo02\\esquerda.png"); 
        imagempersonagem = imagem_pasta.getImage();        
    }
    if (botao_escolhido == KeyEvent.VK_RIGHT){//Se for igual a seta para diraita
        Coord_M_x = 0; // Se o usuario for para direita a posição que ele esta vai aumentar.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemTemplo02\\direito.png"); 
        imagempersonagem = imagem_pasta.getImage();        
       
    }
     if (aperte_enter == KeyEvent.VK_ENTER){
        
         enter = 0;      
    }      
    
    
    }        
}



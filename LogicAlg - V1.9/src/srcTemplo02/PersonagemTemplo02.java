package srcTemplo02;

import java.awt.Image;
import java.awt.event.KeyEvent; 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import srcMapa.ConfJanela;
import srcT1P3.JanelasT1P3;
import srcT2P1.JanelasT2P1;
import srcT2P2.JanelasT2P2;
import srcT2P3.JanelasT2P3;

public class PersonagemTemplo02 extends JFrame{
    private int Coord_P_x,Coord_P_y;  //- Coordenadas do Personagem= Coord_P, coluna=x, linha=y
    private int Coord_M_x,Coord_M_y;  //- Coordenadas para movimentar o personagem= Coord_M, coluna=x, linha=y
    private Image imagempersonagem;   //- Criar a imagem do personagem da classe Image
    private int enter=0;

    public PersonagemTemplo02() { // Terá que criar um cnstrutor para que a imagem apareça e o local onde ela vai ficar na tela. 
        //Foi criada uma pasta com as imagem que vai ser colocadas no jogo.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemTemplo02\\direito.png");// Para pegar a imagem que esta na pasta, será criado um objeto do tipo o ImageIcon.
        imagempersonagem = imagem_pasta.getImage();// A imagempersonagem vai receber a imagem que esta na pasta. 
        this.Coord_P_x=81;//Local do personagem na tela: "coluna".
        this.Coord_P_y=500;//Local do personagem na tela: "linha".      
    }
    
    public void andar(){ //Criar um metodo para que o personagegm ande na tela.
       Coord_P_x += Coord_M_x; //A Coordenada do personagem vai somar com a Coordenada de movimentos na tela.
       Coord_P_y += Coord_M_y; //A Coordenada do personagem vai somar com a Coordenada de movimentos na tela.  
       
       //System.err.println("PERSONAGEM TEMPLO 02 = " + Coord_P_x);    
          
       if (Coord_P_x<=29){ // Para não ultrapassar a parede esquerda. //29
       Coord_P_x=29+1;  
       }
       
       if (Coord_P_x>=1801){ // Para não ultrapassar a parede direita.//1151
       Coord_P_x=1801-1;  
       }

//-------------PT SAIDA ------------

        if ((Coord_P_x>=30 ) && (Coord_P_x<=89)&& (enter==1)){ 
        ConfJanela.getInstancia().show();
       JanelasTemplo02.getInstancia().dispose();
        enter=0;
       }

//-------------Escolha DICA ------------

        if ((Coord_P_x>=1069  ) && (Coord_P_x<=1178)&& (enter==1)){ 
        new BotaoDicas().show();
        enter=0;
        }

//-------------Escolha mesa 01 ------------

<<<<<<< HEAD
     if ((Coord_P_x>=309  ) && (Coord_P_x<=416)&& (enter==1)){ 
        new JanelasT2P1(); 
        JanelasTemplo02.getInstancia().dispose();
    
        enter=0;
       }
//-------------Escolha mesa 02 ------------
        if ((Coord_P_x>=580  ) && (Coord_P_x<=690 )&& (enter==1)){ 
        new JanelasT2P2();
        JanelasTemplo02.getInstancia().dispose();
        enter=0;
        }    
//-------------Escolha mesa 03 ------------
       if ((Coord_P_x>=852) && (Coord_P_x<=955 )&& (enter==1)){ 
        new JanelasT2P3();
        JanelasTemplo02.getInstancia().dispose();
=======
        if ((Coord_P_x>=458  ) && (Coord_P_x<=597)&& (enter==1)){ 
    new JanelasT2P1();   
    ConfJanela.getInstancia().setVisible(false);
    enter=0;
        }
//-------------Escolha mesa 02 ------------
        if ((Coord_P_x>=815  ) && (Coord_P_x<=956 )&& (enter==1)){ 
        new JanelasT2P2(); 
        enter=0;
        }    
//-------------Escolha mesa 03 ------------
        if ((Coord_P_x>=1218) && (Coord_P_x<=1327 )&& (enter==1)){ 
        new JanelasT2P3();
>>>>>>> 1677b1e294d1feb801ab373aa50c04188136bc4e
        enter=0;
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
         System.out.println(Coord_P_x);
         enter = 0;      
    }      
    
    
    }        
}



package srcT1P1;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import java.awt.Image;
import java.awt.event.KeyEvent; 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import srcMapa.ConfJanela;
import srcMapa.Som;
import srcT1P2.JanelasT1P2;
import srcTemplo01.JanelasTemplo01;

public class PersonagemT1P1 extends JFrame{
    private int Coord_P_x,Coord_P_y; // Coordenadas do Personagem= Coord_P, coluna=x, linha=y
    private int Coord_M_x,Coord_M_y; // Coordenadas para movimentar o personagem= Coord_M, coluna=x, linha=y
    private Image imagempersonagem; // Criar a imagem do personagem da classe Image
    private int enter=0;
    private static int t1p1con = 0;
    private static int t1p2con = 0;
    private static int t1p3con = 0;
    private static int pontost1p1 = 0;
    
    public PersonagemT1P1() { // Terá que criar um cnstrutor para que a imagem apareça e o local onde ela vai ficar na tela. 
        //Foi criada uma pasta com as imagem que vai ser colocadas no jogo.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT1P1\\direito.png");// Para pegar a imagem que esta na pasta, será criado um objeto do tipo o ImageIcon.
        imagempersonagem = imagem_pasta.getImage();// A imagempersonagem vai receber a imagem que esta na pasta. 
        this.Coord_P_x=81;//Local do personagem na tela: "coluna".
        this.Coord_P_y=419;//Local do personagem na tela: "linha".
    }
    
  public void andar(){ //Criar um metodo para que o personagegm ande na tela.

      
      
      
      Coord_P_x += Coord_M_x; //A Coordenada do personagem vai somar com a Coordenada de movimentos na tela.
       Coord_P_y += Coord_M_y; //A Coordenada do personagem vai somar com a Coordenada de movimentos na tela.  
       
               
          
       if (Coord_P_x<=76){ // Para não ultrapassar a parede esquerda. //29
       Coord_P_x=76+1;  
       }
       
       if (Coord_P_x>=1700){ // Para não ultrapassar a parede direita.//1151
       Coord_P_x=1700-1;  
       }

     //-------------PORTA de saida------------
//       if ((Coord_P_y>=Coord_P_y)&&(Coord_P_y<=Coord_P_y)&&(Coord_P_x>=30) && (Coord_P_x<=180)&& (enter==1)){ 
//       JanelasTemplo01.getInstancia().setVisible(true);
//       JanelasT1P1.getInstancia().dispose();
//        enter=0;
//        }     

     //-------------PORTA------------
      // if ((Coord_P_y>=Coord_P_y)&&(Coord_P_y<=Coord_P_y)&&(Coord_P_x>=30) && (Coord_P_x<=165)&& (enter==1)){ 
      // JanelasTemplo01.getInstancia().setVisible(true);
      // JanelasT1P1.getInstancia().dispose();
       // enter=0;
       // }     
       //-------------PT SAIDA ------------

        if ((Coord_P_x>=114) && (Coord_P_x<=264)&& (enter==1)){ 
        JanelasTemplo01.getInstancia().setVisible(true);
        JanelasT1P1.getInstancia().dispose();
        enter=0;
        }
       
        
//-------------Escolha DICA ------------

        if ((Coord_P_x>=1146) && (Coord_P_x<=1227)&& (enter==1)){ 
       new BotaoDicas().show();//ao modificar para padrao meio singleton n se usa o show.
        enter=0;
        }

//-------------Escolha Porta 01 ------------
        
        
        if (t1p1con == 0){//comparador que verifica se o jogador já utilizou aquela opção
            //se o comparador da porta for 0, ele não utilizou e pode mostrar o botão e computar pontos
        if ((Coord_P_x>=278) && (Coord_P_x<=418) && (enter==1)){ 
            new BotaoPortaUm().show();
             enter=0;
             pontost1p1+=20; //atribuição de pontos sempre deve ser += para acrescentar em vez de substituir  
            t1p1con = 1;
       // Som.play("DING");
        //Som.stop("DING");
        
        }  
        }
     //if((t1p1con == 1) && (enter == 1)){//se o comparador for > 0 quando ele apertar enter na porta, não poderá utilizar a porta mais
      //      JOptionPane.showMessageDialog(null, "\n \n \n Você já escolheu esta opção1, Não poderá escolher esta mesma opção novamente \n \n \n ");
       //     enter = 0;
            
      //  };
//-------------Escolha Porta 02 ------------
   
if (t1p2con == 0){       

       if ((Coord_P_x>=418 && Coord_P_x<=735)&& (enter==1)){ 
        new BotaoPortaDois().show();
        enter=0;
        t1p2con = 1;
        pontost1p1+=5;
        } 
       
       } 
//if((t1p2con == 1) && (enter == 1)){
//           JOptionPane.showMessageDialog(null, "\n \n \n Você já escolheu esta opção2, Não poderá escolher esta mesma opção novamente \n \n \n ");
//            enter = 0;
//        }
//-------------Escolha Porta 03 ------------
    
        if (t1p3con == 0){        

        if ((Coord_P_x>=860 && Coord_P_x<=1018)&& (enter==1)){ 
        new BotaoPortaTres().show();
        enter=0;
        t1p3con = 1;
        pontost1p1+=5;
        }

     } 
//        if((t1p3con == 1) && (enter == 1)){
//            JOptionPane.showMessageDialog(null, "\n \n \n Você já escolheu esta opção3, Não poderá escolher esta mesma opção novamente \n \n \n ");
//            enter = 0;
//     }

    } //fim da função andar              
                 
     

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
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT1P1\\personagem_esquerda.gif"); 
        imagempersonagem = imagem_pasta.getImage();
    }
    if (botao_escolhido == KeyEvent.VK_RIGHT){//Se for igual a seta para diraita
        Coord_M_x = 1; // Se o usuario for para direita a posição que ele esta vai aumentar.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT1P1\\personagem_direita.gif"); 
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
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT1P1\\esquerda.png"); 
        imagempersonagem = imagem_pasta.getImage();        
    }
    if (botao_escolhido == KeyEvent.VK_RIGHT){//Se for igual a seta para diraita
        Coord_M_x = 0; // Se o usuario for para direita a posição que ele esta vai aumentar.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT1P1\\direito.png"); 
        imagempersonagem = imagem_pasta.getImage();        
       
    }
     if (aperte_enter == KeyEvent.VK_ENTER){
     enter = 0; 
     
    }      
    
    
    }   
    
    public static int getInstancia(){
        return pontost1p1;
    }
    
}



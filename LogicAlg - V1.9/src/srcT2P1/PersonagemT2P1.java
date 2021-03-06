package srcT2P1;

import java.awt.Image;
import java.awt.event.KeyEvent; 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import srcMapa.ConfJanela;
import srcMapa.Som;
import srcT1P2.JanelasT1P2;
import srcTemplo02.BotaoPortaDois;
import srcTemplo02.BotaoPortaTres;
import srcTemplo02.BotaoPortaUm;
import srcTemplo02.JanelasTemplo02;

public class PersonagemT2P1 extends JFrame{
    private int Coord_P_x,Coord_P_y; // Coordenadas do Personagem= Coord_P, coluna=x, linha=y
    private int Coord_M_x,Coord_M_y; // Coordenadas para movimentar o personagem= Coord_M, coluna=x, linha=y
    private Image imagempersonagem; // Criar a imagem do personagem da classe Image
    private int enter=0;
    private static int t2p1con = 0;
    private static int t2p2con = 0;
    private static int t2p3con = 0;
    private static int pontost2p1 = 0;

    public PersonagemT2P1() { // Terá que criar um construtor para que a imagem apareça e o local onde ela vai ficar na tela. 
        //Foi criada uma pasta com as imagem que vai ser colocadas no jogo.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P1\\direito.png");// Para pegar a imagem que esta na pasta, será criado um objeto do tipo o ImageIcon.
        imagempersonagem = imagem_pasta.getImage();// A imagempersonagem vai receber a imagem que esta na pasta. 
        this.Coord_P_x=81;//Local do personagem na tela: "coluna".
        this.Coord_P_y=429;//Local do personagem na tela: "linha".
    }
    
  public void andar(){ //Criar um metodo para que o personagegm ande na tela.
       Coord_P_x += Coord_M_x; //A Coordenada do personagem vai somar com a Coordenada de movimentos na tela.
       Coord_P_y += Coord_M_y; //A Coordenada do personagem vai somar com a Coordenada de movimentos na tela.  
       
       //   System.err.println("T1P1: " + Coord_P_x);     
          
          /*
          ++
          
          SAIDA 56 x 253
T1 = 379x 628
P2 = 849 x 1041
P3 = 1217x 1447
DICA 1506x 
PAREDE FIM 
PAREDE INI = 55
          
          ++
          */
          
       if (Coord_P_x<=67){ // Para não ultrapassar a parede esquerda. //29
       Coord_P_x=67+1;  
       }
       
       if (Coord_P_x>=1221){ // Para não ultrapassar a parede direita.//1151
       Coord_P_x=1221-1;  
       }
     //-------------PORTA------------

      // if ((Coord_P_y>=Coord_P_y)&&(Coord_P_y<=Coord_P_y)&&(Coord_P_x>=30) && (Coord_P_x<=165)&& (enter==1)){ 
      // ConfJanela.getInstancia().setVisible(true);
      //  Som.play("BGM_MAPA");
      // JanelasT2P1.getInstancia().dispose();
      //  enter=0;
      //  }     

       if ((Coord_P_y>=Coord_P_y)&&(Coord_P_y<=Coord_P_y)&&(Coord_P_x>=30) && (Coord_P_x<=165)&& (enter==1)){ 
       JanelasTemplo02.getInstancia().setVisible(true);
       JanelasT2P1.getInstancia().dispose();
        enter=0;
        }     

       //-------------PT SAIDA ------------

       if ((Coord_P_x>=68) && (Coord_P_x<=160)&& (enter==1)){ 
       new JanelasTemplo02();
       JanelasT2P1.getInstancia().dispose();
       enter=0;
        }
       
//-------------Escolha DICA ------------

        if ((Coord_P_x>=1121) && (Coord_P_x<=1220)&& (enter==1)){ 
        new BotaoDicas().show();//ao modificar para padrao meio singleton n se usa o show.
        enter=0;
        }

//-------------Escolha Porta 01 ------------
if (t2p1con == 0){//comparador que verifica se o jogador já utilizou aquela opção
            //se o comparador da porta for 0, ele não utilizou e pode mostrar o botão e computar pontos

        if ((Coord_P_x>=281) && (Coord_P_x<=417)&& (enter==1)){ 
        new BotaoMesaUm().show();
        enter=0;
        pontost2p1+=5; //atribuição de pontos sempre deve ser += para acrescentar em vez de substituir  
        t2p1con += 1;
        }
        
        }


//    else if((t2p1con > 0) && (enter == 1)){//se o comparador for > 0 quando ele apertar enter na porta, não poderá utilizar a porta mais
//            JOptionPane.showMessageDialog(null, "\n \n \n Você já escolheu esta opção, Não poderá escolher esta mesma opção novamente \n \n \n ");
//            enter = 0;
//            
//        }
//-------------Escolha Porta 02 ------------
        if (t2p2con == 0){//comparador que verifica se o jogador já utilizou aquela opção
            //se o comparador da porta for 0, ele não utilizou e pode mostrar o botão e computar pontos
 
        if ((Coord_P_x>=558 && Coord_P_x<=726)&& (enter==1)){ 
        new BotaoMesaDois().show();
        enter=0;
        pontost2p1+=20; //atribuição de pontos sempre deve ser += para acrescentar em vez de substituir  
        t2p2con += 1;
        }  
        } 
//        else if((t2p2con > 0) && (enter == 1)){//se o comparador for > 0 quando ele apertar enter na porta, não poderá utilizar a porta mais
//            JOptionPane.showMessageDialog(null, "\n \n \n Você já escolheu esta opção, Não poderá escolher esta mesma opção novamente \n \n \n ");
//            enter = 0;
//            
//        }
        
//-------------Escolha Porta 03 ------------
     if (t2p3con == 0){//comparador que verifica se o jogador já utilizou aquela opção
            //se o comparador da porta for 0, ele não utilizou e pode mostrar o botão e computar pontos   
        if ((Coord_P_x>=860 && Coord_P_x<=1027)&& (enter==1)){ 
        new BotaoMesaTres().show();
        enter=0;
        pontost2p1+=5; //atribuição de pontos sempre deve ser += para acrescentar em vez de substituir  
        t2p3con += 1;
        }
        
     } 
//     else if((t2p3con > 0) && (enter == 1)){//se o comparador for > 0 quando ele apertar enter na porta, não poderá utilizar a porta mais
//            JOptionPane.showMessageDialog(null, "\n \n \n Você já escolheu esta opção, Não poderá escolher esta mesma opção novamente \n \n \n ");
//            enter = 0;
//            
//        }
        
        
        
       }  //fim da classe andar
     
     
                 
     

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
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P1\\personagem_esquerda.gif"); 
        imagempersonagem = imagem_pasta.getImage();
    }
    if (botao_escolhido == KeyEvent.VK_RIGHT){//Se for igual a seta para diraita
        Coord_M_x = 1; // Se o usuario for para direita a posição que ele esta vai aumentar.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P1\\personagem_direita.gif"); 
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
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P1\\esquerda.png"); 
        imagempersonagem = imagem_pasta.getImage();        
    }
    if (botao_escolhido == KeyEvent.VK_RIGHT){//Se for igual a seta para diraita
        Coord_M_x = 0; // Se o usuario for para direita a posição que ele esta vai aumentar.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P1\\direito.png"); 
        imagempersonagem = imagem_pasta.getImage();        
       
    }
     if (aperte_enter == KeyEvent.VK_ENTER){
         enter = 0;      
    }      
    
    
    }
    
    public static int getInstancia(){
        return pontost2p1;
    }
    
}



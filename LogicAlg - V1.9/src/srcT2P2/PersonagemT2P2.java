package srcT2P2;

import java.awt.Image;// Como vamos trabalhar com imagens, será necessario importa a classe que trabalha com esta função.
import java.awt.event.KeyEvent; //Importa classe responsavel de obter dados do teclado.
import javax.swing.ImageIcon;// Impostado para conseguir pegar as imagens.
import javax.swing.JFrame;
import srcMapa.ConfJanela;
import srcMapa.Som;
import srcT2P1.JanelasT2P1;
import srcTemplo02.JanelasTemplo02;

public class PersonagemT2P2 extends JFrame{
    private int Coord_P_x,Coord_P_y; // Coordenadas do Personagem= Coord_P, coluna=x, linha=y
    private int Coord_M_x,Coord_M_y; // Coordenadas para movimentar o personagem= Coord_M, coluna=x, linha=y
    private Image imagempersonagem; // Criar a imagem do personagem da classe Image
    private int enter=0;
    private int escada;
    private static int t2p1con = 0;
    private static int t2p2con = 0;
    private static int pontost2p2 = 0;
    
    public PersonagemT2P2() { // Terá que criar um cnstrutor para que a imagem apareça e o local onde ela vai ficar na tela. 
        //Foi criada uma pasta com as imagem que vai ser colocadas no jogo.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P2\\direito.png");// Para pegar a imagem que esta na pasta, será criado um objeto do tipo o ImageIcon.
        imagempersonagem = imagem_pasta.getImage();// A imagempersonagem vai receber a imagem que esta na pasta. 
        this.Coord_P_x=534;//Local do personagem na tela: "coluna".
        this.Coord_P_y=553;//Local do personagem na tela: "linha".
    }
    
  public void andar(){ //Criar um metodo para que o personagegm ande na tela.
      
      //System.out.println("X" + Coord_P_x);
      //System.out.println("Y" + Coord_P_y);

      
       Coord_P_x += Coord_M_x; //A Coordenada do personagem vai somar com a Coordenada de movimentos na tela.
       Coord_P_y += Coord_M_y; //A Coordenada do personagem vai somar com a Coordenada de movimentos na tela. 
       
        //-------------SAIDA------------
<<<<<<< HEAD
        if ((Coord_P_y <= 553) &&(Coord_P_x>=486 && Coord_P_x<=564) &&(enter==1)){ //CHEGOU NA PARTE DE BAIXO DA ESCADA
        new JanelasTemplo02();
        dispose();
=======
        if ((Coord_P_y <= 750) &&(Coord_P_x>=706 && Coord_P_x<=782) &&(enter==1)){ //CHEGOU NA PARTE DE BAIXO DA ESCADA
        JanelasTemplo02.getInstancia().setVisible(true);
        JanelasT2P1.getInstancia().dispose();
>>>>>>> 1677b1e294d1feb801ab373aa50c04188136bc4e
        enter=0;
        }
        
       
 
       
       //PAREDE PARTE DE BAIXO
                   
      if ((Coord_P_x<=433)&& (Coord_P_y==553)){ // Para não ultrapassar a parede esquerda do primeiro andar;
       Coord_P_x=433+1;  
       }
       
       if ((Coord_P_x>=1238)&& (Coord_P_y==553)){ // Para não ultrapassar a parede esquerda do primeiro andar;
       Coord_P_x=1238-1;  
       }
       
     if (Coord_P_y>553){ // Para não ultrapassar o chao 569
      Coord_P_y=553;  
      }
       
//-------------ESCADA BAIXO ------------
       if ((Coord_P_y <= 553) &&(Coord_P_x>=809 && Coord_P_x<=863)){ //CHEGOU NA PARTE DE BAIXO DA ESCADA
     //   escada = 1; 
      escada = 1; 
     }
       if ((Coord_P_y <= 326) &&(Coord_P_x<=809 || Coord_P_x>=863)){ //CHEGOU NO TOPO DA ESCADA
       escada = 0; 
       }
//        
    if((Coord_P_y < 326) &&(Coord_P_x >= 809 && Coord_P_x <= 863)){ //CHEGOU NO TOPO DA ESCADA PODE IR PRA BAIXO
        escada = 1;  
        }
        if((Coord_P_y < 326) &&(Coord_P_x >= 809 && Coord_P_x <= 863)){//SE TENTAR SUBIR MAIS DOQ A ESCADA
       Coord_P_y = 326; 
        }
        
    if (((Coord_P_y < 553) && (Coord_P_y > 326)) && ((Coord_P_x < 809) || (Coord_P_x > 863))){ //SAIU DA ESCADA
       Coord_P_y = 553; 
       }
     
       
       //PAREDE PARTE DE MEDIO
      if ((Coord_P_x<=597)&& (Coord_P_y==326)){ // Para não ultrapassar a parede esquerda do primeiro andar;
       Coord_P_x=597+1;  
       }
      
     if ((Coord_P_x>=1236)&& (Coord_P_y==326)){ // Para não ultrapassar a parede direita do primeiro andar;
      Coord_P_x=1236-1;  
       }
       
//        //-------------ESCADA MEDIO ------------
        if ((Coord_P_y <= 326) &&(Coord_P_x>=1212 && Coord_P_x<=1236)){ //CHEGOU NA PARTE DE BAIXO DA ESCADA
        escada = 1; 
        } //habilita o personagem de poder subir a escada do meio, quando estiver entre as duas cordenadas de x.
        
   if (((Coord_P_y < 553) && (Coord_P_y > 326)) && ((Coord_P_x>=1212 && Coord_P_x<=1236))){ //CHEGOU NA PARTE DE cima DA ESCADA !!!!!!!!!!!!! BUG
        Coord_P_y = 553; 
       escada = 0; 
        }//impede que o personagem suba mais do que o necessário na escada.

       if((Coord_P_y < 102) &&(Coord_P_x >= 1212 && Coord_P_x <= 1236)){//SE TENTAR SUBIR MAIS DOQ A ESCADA
        Coord_P_y = 102; 
        }
        
       if (((Coord_P_y < 102) && (Coord_P_y > 326)) && ((Coord_P_x < 1212) || (Coord_P_x > 1236))){ //SAIU DA ESCADA
        Coord_P_y = 326; 
       }//faz com que o personagem caia no chão se ir para o lado da escada
//      

        if (((Coord_P_y < 326) && (Coord_P_y > 102)) && ((Coord_P_x < 1212) || (Coord_P_x > 1236))){ //SAIU DA ESCADA
        Coord_P_y = 326; 
        }

       if ((Coord_P_x<=964)&& (Coord_P_y==102)){ // Para não ultrapassar a parede DIREITA do primeiro andar;
       Coord_P_x=964+1;  
       }
//       
      if ((Coord_P_x>=1238)&& (Coord_P_y==102)){ // Para não ultrapassar a parede esquerda do primeiro andar;
       Coord_P_x=1238-1;  
       }
       
       
       

      //-------------OPÇÃO A ------------
     if (t2p1con == 0){
      if(( Coord_P_x>=965 && Coord_P_x<=990 && (Coord_P_y==102))){ // Para não ultrapassar a parede esquerda do primeiro andar;
       if(enter == 1){
         new OpA().show();
        enter=0;
        pontost2p2-=10; //atribuição de pontos sempre deve ser += para acrescentar em vez de substituir  
        t2p1con += 1;
        }
       }
     }
       //-------------OPÇÃO B ------------
      if (t2p2con == 0){
       
       if ((Coord_P_x>=1063)&& (Coord_P_x<=1124 ) && (Coord_P_y==102)){ // Para não ultrapassar a parede esquerda do primeiro andar;
            if(enter == 1){
       new OpB().show();
        enter=0;
        pontost2p2+=30; //atribuição de pontos sempre deve ser += para acrescentar em vez de substituir  
        t2p2con += 1;
                }
            }
        }
    
  }  //fim da função andar             
              
     

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
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P2\\personagem_esquerda.gif"); 
        imagempersonagem = imagem_pasta.getImage();
    }
    if (botao_escolhido == KeyEvent.VK_RIGHT){//Se for igual a seta para diraita
        Coord_M_x = 1; // Se o usuario for para direita a posição que ele esta vai aumentar.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P2\\personagem_direita.gif"); 
        imagempersonagem = imagem_pasta.getImage();    
    }  
    
     /////////////////////////////////////////////////////////////////////////////
    if ((botao_escolhido == KeyEvent.VK_UP) && (escada == 1)){//Se for igual a seta para cima.
        Coord_M_y = -1; // Se o usuario for para cima, a posição que ele esta vai diminuir.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P2\\personagem_costas.gif"); 
        imagempersonagem = imagem_pasta.getImage();  
        escada =0;
    }
    if ((botao_escolhido == KeyEvent.VK_DOWN) && (escada == 1)){//Se for igual a seta para baixo.
        Coord_M_y = 1; // Se o usuario for para baixo, a posição que ele esta vai aumentar.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P2\\personagem_costas.gif"); 
        imagempersonagem = imagem_pasta.getImage();   
        escada =0;
    }    
      /////////////////////////////////////////////////////////////////////////////
    if (aperte_enter == KeyEvent.VK_ENTER){//Criado para que a caixa com as opções que ficam no tapete apareçam
        enter = 1; // Se aperta enter ele recebe 1       
    }     
    }    

    public void keyReleased(KeyEvent botao){//Receber dados ao sooltar a tecla do teclado. Ao soltar a Coordenada de movimento vai receber um valor nulo.
    
     int botao_escolhido = botao.getKeyCode();//Será comporado o botão que o usuario vai clicar com o metodo KeyCode, que consegue saber qual foi a tecla.
     int aperte_enter = botao.getKeyCode();
   
    if (botao_escolhido == KeyEvent.VK_LEFT){//Se for igual a seta para esquerda.
        Coord_M_x = 0;// Se o usuario for para esquerda a posição que ele esta vai diminuir.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P2\\esquerda.png"); 
        imagempersonagem = imagem_pasta.getImage();        
    }
    if (botao_escolhido == KeyEvent.VK_RIGHT){//Se for igual a seta para diraita
        Coord_M_x = 0; // Se o usuario for para direita a posição que ele esta vai aumentar.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P2\\direito.png"); 
        imagempersonagem = imagem_pasta.getImage();        
       
    }
    
    /////////////////////////////////////////////////////////////////////////////
     if ((botao_escolhido == KeyEvent.VK_UP) && (escada == 1)){ //Se for igual a seta para cima.
        Coord_M_y = 0; // Se o usuario for para cima, a posição que ele esta vai diminuir.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P2\\costas.png"); 
        imagempersonagem = imagem_pasta.getImage();         
    }
    if ((botao_escolhido == KeyEvent.VK_DOWN) && (escada == 1)){//Se for igual a seta para baixo.
        Coord_M_y = 0; // Se o usuario for para baixo, a posição que ele esta vai aumentar.
        ImageIcon imagem_pasta = new ImageIcon("src\\ImagemT2P2\\costas.png"); 
        imagempersonagem = imagem_pasta.getImage();         
    }    
    /////////////////////////////////////////////////////////////////////////////
     if (aperte_enter == KeyEvent.VK_ENTER){
         
         enter = 0;      
    }      
    
    
    } 
    
    public static int getInstancia(){
        return pontost2p2;
    }
}

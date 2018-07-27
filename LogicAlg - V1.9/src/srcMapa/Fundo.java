package srcMapa;

//FUNDOO
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import srcPontos.FilaLogicAlg;
import srcPontos2.Pontinhos;
import srcT1P1.JanelasT1P1;
import srcTemplo01.JanelasTemplo01;
import srcTemplo02.JanelasTemplo02;



public class Fundo extends JFrame{

private int x;//CORDENADA 
private int y;//CORDENADA 
private int dx;//CORDENADA 
private int dy;//CORDENADA 
private Image imagem;//IAMGEM DO FUNDO
private int enter=0, ordem=0;
private JButton ok;  
private JLabel conteudo, telaconteudo;
private CriarJanela janela;
private FilaLogicAlg fila;
private int casaum=0, casadois=0, casatres=0, casaquatro=0;
private static JFrame teste;

public Fundo() {
    
   

ImageIcon referencia = new ImageIcon("src\\ImagemMapa\\fase.png"); // CRIANDO A IMAGEM DO FUNDO PEGANDO A IAMGEM DA - src\\Imagens\\fase.png
imagem = referencia.getImage();// "IMAGEM" VAI RECEBER A IMAGEM QUE ESTA NA PASTA

this.x=(-398); // O FUNDO VAI COMEÇAR NA POSIÇÃO X = -398 //posição do personagem em relação ao mapa em horizontal(-398) T23157
this.y=0;// O FUNDO VAI COMEÇAR NA POSIÇÃO Y = 0
x=getX();

  

}

public void mexer(){//PARA SE MOVIMENTAR
        teste = new JFrame();

        fila = new FilaLogicAlg();
        //System.out.println("FUNDO = " + x);
        
    x +=dx;// A POSIÇÃO X DO PERSONAGEM VAI RECEBER X + DX ( DX É DEFINIDO PELO keyPressed )
    y +=dy;// A POSIÇÃO Y DO PERSONAGEM VAI RECEBER Y + Dy ( DY É DEFINIDO PELO keyPressed )
    
    if(x>-335){//PARA QUE A IMAGEM DO FUNDO NÃO SE MOVIMENTE QUANDO O USUARIO CHEGAR NO INICIO DA FASE
    x=-335;//PARA QUE A IMAGEM DO FUNDO NÃO SE MOVIMENTE QUANDO O USUARIO CHEGAR NO INICIO DA FASE
    }//PARA QUE A IMAGEM DO FUNDO NÃO SE MOVIMENTE QUANDO O USUARIO CHEGAR NO INICIO DA FASE
    
    //if(x>-11349){//PARA QUE A IMAGEM DO FUNDO NÃO SE MOVIMENTE QUANDO O USUARIO CHEGAR NO FIM DA FASE
   // x=-11349;//PARA QUE A IMAGEM DO FUNDO NÃO SE MOVIMENTE QUANDO O USUARIO CHEGAR NO FIM DA FASE
   // }//PARA QUE A IMAGEM DO FUNDO NÃO SE MOVIMENTE QUANDO O USUARIO CHEGAR NO FIM DA FASE
   
    if ((y>=y)&&(y<=y)&&(x>=0-5331) && (x<=0-9777)&& (enter==1)){ 
       // Som.play("MUSIC_FIM");
         enter=0;
     }  
    
    if ((y>=y)&&(y<=y)&&(x>=0-398) && (x<=0-5330)&& (enter==1)){ 
        // Som.play("BGM_MAPA");
         enter=0;
     } 
    

    if(x >= 0-1375 && x <= 0-1262  && enter ==1){// TEMPLO 01 //-1592 | -1705
   // new Templo01().show(); 
    new JanelasTemplo01();
    ConfJanela.getInstancia().setVisible(false);
    casaum+=1;
    ordem=1;
    enter=0;
    }

    if(x <= 0-3103 && x>= 0-3218 && enter ==1){// TEMPLO 02 //-3976 |  -4082
    new JanelasTemplo02();
    ConfJanela.getInstancia().setVisible(false);
    casadois+=1;
    ordem=2;
    enter=0;
    }

    //if(x <= 0-3406 && x>= 0-3482 && enter ==1){// casa 03 
    //new CasaTres().show();
    //ConfJanela.getInstancia().setVisible(false);
    //casatres+=1;
    //ordem=3;
    //enter=0;
   // }
    
   /*
 +++++++++++++++++++++++++++++++++++++++

T2: -3103 x -3218

FIM: -4244 x -4332

STRANGER: -5331 x -9777

CASTELO: -10816 x -11252

FIM: -11349

 +++++++++++++++++++++++++++++++++++++++    
    
    */
    
    

    if(x <= 0-4536 && x>= 0-4614 && enter ==1){// casa 04 
    //new CasaQuatro().show();
    ConfJanela.getInstancia().setVisible(false);;
    casaquatro+=1;
    ordem=4;
    enter=0;
    }
    
    if(x <= 0-5500 && x>= 0-5579 && enter ==1){// casa 05
   // new CasaCinco().show();
    ConfJanela.getInstancia().setVisible(false);
    casaquatro+=1;
    ordem=4;
    enter=0;
    }
    
    if(x <= 0-6512 && x>= 0-6580 && enter ==1){// casa 06
    //new CasaSeis().show();
    ConfJanela.getInstancia().setVisible(false);
    casaquatro+=1;
    ordem=4;
    enter=0;
    }

    
    if(x <= 0-7417 && x>= 0-7483 && enter ==1){// casa 07
    //new CasaSete().show(); 
    ConfJanela.getInstancia().setVisible(false);
    casaquatro+=1;
    ordem=4;
    enter=0;
    }


    //----------------------Saber Quantas vezes o usuario repetiu o exercicio
    

    if(x <= 0-4934 && x>= 0-5083 && enter ==1){// casa 04 
  //  janela(); 
    enter=0;
    
    
        conteudo  = new JLabel(); 
        telaconteudo = new JLabel(); 
        janela = new CriarJanela();
        
        ok = new JButton("OK"); 



        janela.setTitle("Resultado Final"); // Este método setTitle vai permiti que seja criado um titulo para a tela.
        janela.add(telaconteudo);
        telaconteudo.setLayout( new FlowLayout());

        
        
        conteudo = new JLabel("Casa 1 foi acessada "+casaum+" vezes.");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela  

        if(casaum<1){
        conteudo = new JLabel("Mesmo que tenha conhecimento sobre o assunto, é sempre bom praticar :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }
        if(casaum==1){
        conteudo = new JLabel("Gostou, aguardamos sua presenta nas proximas atualizações :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }        
        if(casaum>1){
        conteudo = new JLabel(":) Pelo visto você gostou desta casa, é sempre bom praticar :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }        
        
        
        conteudo = new JLabel("<html><br><html>");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela            
        
        conteudo = new JLabel("Casa 2 foi acessada "+casadois+" vezes.");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela  
        if(casadois<1){
        conteudo = new JLabel("Mesmo que tenha conhecimento sobre o assunto, é sempre bom praticar :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }
        if(casadois==1){
        conteudo = new JLabel("Gostou, aguardamos sua presenta nas proximas atualizações :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }        
        if(casadois>1){
        conteudo = new JLabel(":) Pelo visto você gostou desta casa, é sempre bom praticar :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }          
        
        conteudo = new JLabel("<html><br><html>");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela       
        
        conteudo = new JLabel("Casa 3 foi acessada "+casatres+" vezes.");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela  
        if(casatres<1){
        conteudo = new JLabel("Mesmo que tenha conhecimento sobre o assunto, é sempre bom praticar :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }
        if(casatres==1){
        conteudo = new JLabel("Gostou, aguardamos sua presenta nas proximas atualizações :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }        
        if(casatres>1){
        conteudo = new JLabel(":) Pelo visto você gostou desta casa, é sempre bom praticar :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }          

        
        conteudo = new JLabel("<html><br><html>");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela  
        
        conteudo = new JLabel("Casa 4 foi acessada "+casaquatro+" vezes.");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela  
        if(casaquatro<1){
        conteudo = new JLabel("Mesmo que tenha conhecimento sobre o assunto, é sempre bom praticar :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }
        if(casaquatro==1){
        conteudo = new JLabel("Gostou, aguardamos sua presenta nas proximas atualizações :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }        
        if(casaquatro>1){
        conteudo = new JLabel(":) Pelo visto você gostou desta casa, é sempre bom praticar :)");//Informações que serão colocados na janela
        telaconteudo.add(conteudo);//Adicionando o conteudo na janela 
        }  

        
    }  


}
  
    
    
    

public int getX() {//PARA PEGAR A POSIÇÃO X DO FUNDO
    return x;
}

public int getY() {//PARA PEGAR A POSIÇÃO Y DO FUNDO
    return y;
}

public Image getImagem() {//PARA PEGAR A IMAGEM DO FUNDO
    return imagem;
}

public void keyPressed(KeyEvent tecla){ //PARA RECEBER DADOS DA TECLA DO USUARIO - AO APERTAR

    int aperte_enter = tecla.getKeyCode();

    int codigo = tecla.getKeyCode(); //CODIGO É O NOME DA VARIAVEL DA TECLA QUE O USUARIO DIGITAR

    if(codigo == KeyEvent.VK_LEFT){//SE FOR PRA ESQUERDA

    dx= +1;
    }

    if(codigo == KeyEvent.VK_RIGHT){//SE FOR PRA DIREITA
    dx= -1;
    }

    if (aperte_enter == KeyEvent.VK_ENTER){//Criado para que a caixa com as opções que ficam no tapete apareçam
    enter = 1; // Se aperta enter ele recebe 1       
    } 

}

public void keyReleased(KeyEvent tecla){//PARA RECEBER DADOS DA TECLA DO PERSONAGEM - AO SOLTAR

    int aperte_enter = tecla.getKeyCode();

    int codigo = tecla.getKeyCode();//CODIGO É O NOME DA VARIAVEL DA TECLA QUE O USUARIO DIGITAR

    if(codigo == KeyEvent.VK_LEFT){//SE FOR PRA ESQUERDA
    dx= 0;

    }

    if(codigo == KeyEvent.VK_RIGHT){//SE FOR PRA DIREITA
    dx= 0;
    }

    if (aperte_enter == KeyEvent.VK_ENTER){//Criado para que a caixa com as opções que ficam no tapete apareçam
    enter = 0; // Se aperta enter ele recebe 1       
    }  

    }


}

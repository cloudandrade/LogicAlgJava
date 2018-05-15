package LogicAlg; // PACOTE ONDE TEM A CLASSE PRINCIPAL

//teste para mostrar as funcionalidades do github

import javax.swing.JFrame;
import srcMapa.Menu;


public class LogicAlg {//CRINANDO A CLASSE

    
    private static JFrame iniciotela;
    
    public static void main(String[] args) { //METODO PRINCIPAL
        
    new Menu(); //instanciando a classe meu frame para poder usar os metodos dela.
    
    iniciotela = Menu.getInstancia();
    iniciotela.show();
  //iniciotela.setExtendedState(JFrame.MAXIMIZED_BOTH);//deixa maximizada a janela 
    }
    
}


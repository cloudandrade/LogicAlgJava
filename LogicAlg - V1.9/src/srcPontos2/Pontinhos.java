/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcPontos2;

/**
 *
 * @author Pichau
 */

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.time.Clock;
import javax.swing.ImageIcon;

public class Pontinhos {
    
    
    private int x;//CORDENADA 
    private int y;//CORDENADA 
    private int dx;//CORDENADA 
    private int dy;//CORDENADA 
    private Image imagem;//IMAGEM DO PERSONAGEM

    public Pontinhos() {
        
        ImageIcon referencia = new ImageIcon("src\\ImagemMapa\\MAPA_TELA_03.png"); // CRIANDO O PERSONAGEM E PEGANDO A IAMGEM DA - src\\Imagens\\Boneco.png
        imagem = referencia.getImage();// "IMAGEM" VAI RECEBER A IMAGEM QUE ESTA NA PASTA
        
        this.x=0; // O PERSONAGEM VAI COMEÇAR NA POSIÇÃO X =100//posição do personagem horizontelmente
        this.y=0; // O PERSONAGEM VAI COMEÇAR NA POSIÇÃO Y =475//posição do personagem verticalmente
    }//posições referentes ao mapa principal
      
    
    public int getX() {//PARA PEGAR A POSIÇÃO X DO PERSONAGEM
        return x;
    }

    public int getY() {//PARA PEGAR A POSIÇÃO Y DO PERSONAGEM
        return y;
    }

    public Image getImagem() {//PARA PEGAR A IMAGEM DO PERSONAGEM
        return imagem;
    }
    
    
    
    
}

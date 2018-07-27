
package jogador;

import com.sun.net.httpserver.Authenticator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Jogador {
    
    private String nome;
    private int pontos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    public String Salvar(){
        
        try {
            FileWriter fw = new FileWriter("PlacarGeral.txt", true );
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Nome: " +this.nome + "\t\t");
            pw.print("Pontuação: " +this.pontos + "\t\t");
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Opa! Sinto Muito! nossos programadores me disseram que parece que não foi possivel cadastrar sua pontuação!");
        }
        
        
        return null;
    }
    
}

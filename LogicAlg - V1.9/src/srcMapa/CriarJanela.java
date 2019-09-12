
package srcMapa;

import javax.swing.JFrame;

public class CriarJanela extends JFrame {

    public CriarJanela() {
        
    setTitle("");// TITULO DA JANELA
    setSize(1366,768);//TAMANHO DA JANELA
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//FECHAR PROGRAMA QUANDO APERTAR NO "X"
    setLocationRelativeTo(null);//A JANELA ABRIR NO CENTRO NA TELA
    setResizable(false);//NÃO ALTERAR O TAMANHO DA JANELA 
    setVisible(true);//APARECER A TELA   
    }
    
    
}

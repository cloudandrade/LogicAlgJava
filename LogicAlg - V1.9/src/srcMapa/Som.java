
package srcMapa;

import jplay.Sound;
import jplay.URL;
/*comentario de teste msm - keven*/

public class Som {
    
    private static Sound musica;
    public static void play(String audio){
       stop();
       musica = new Sound(URL.audio(audio + ".wav"));
       Som.musica.play();
       Som.musica.setRepeat(true);
    }
    
    public static void stop(){
        if(Som.musica != null){
            musica.stop();
        }
    }
    
}

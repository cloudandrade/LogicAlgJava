package srcMapa;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class MusicaMapa {
    
    public void som(String nomeDoAudio){
        URL url = Fase.class.getResource(nomeDoAudio+".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }
    
}

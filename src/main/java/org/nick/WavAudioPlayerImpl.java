package org.nick;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class WavAudioPlayerImpl implements AudioPlayer {

    public void play(URL url) {
        if (url == null) {
            url = this.getClass().getClassLoader().getResource("test.wav");
        }
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

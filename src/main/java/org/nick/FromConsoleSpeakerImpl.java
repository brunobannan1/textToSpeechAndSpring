package org.nick;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FromConsoleSpeakerImpl implements Speaker {

    private String text;
    private AudioPlayer audioPlayer;

    public FromConsoleSpeakerImpl(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void speak() {
        audioPlayer.play();
    }

    public String getString() throws IOException {
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        return s;
    }
}
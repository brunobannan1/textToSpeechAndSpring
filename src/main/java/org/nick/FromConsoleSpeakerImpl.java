package org.nick;

public class FromConsoleSpeakerImpl implements Speaker {

    private String text;
    private AudioPlayer audioPlayer;

    public FromConsoleSpeakerImpl(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void speak() {
        audioPlayer.play();
    }
}
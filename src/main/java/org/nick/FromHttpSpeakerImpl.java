package org.nick;

public class FromHttpSpeakerImpl implements Speaker {

    private AudioPlayer audioPlayer;

    public FromHttpSpeakerImpl(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void speak() {
        audioPlayer.play();
    }
}
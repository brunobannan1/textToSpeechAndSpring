package org.nick;

public class ContextChoisableSpeaker {
    private Speaker speaker;

    public ContextChoisableSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    void speak(){
        speaker.speak();
    }
}
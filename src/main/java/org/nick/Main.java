package org.nick;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("org.nick\\context.xml");
        ContextChoisableSpeaker speaker = context.getBean(ContextChoisableSpeaker.class);
        speaker.speak();
    }
}
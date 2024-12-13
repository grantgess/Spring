package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(MusicPlayer.TypeOfSong.CLASSICAL);
        player.playMusic(MusicPlayer.TypeOfSong.ROCK);
        context.close();
    }


}

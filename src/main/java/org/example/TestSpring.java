package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(MusicPlayer.TypeOfSong.CLASSICAL);

        Music music1 = context.getBean("classicalMusic", ClassicalMusic.class);
        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(music1 == music2);
        context.close();
    }


}

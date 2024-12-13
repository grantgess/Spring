package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    @Autowired
    @Qualifier("classicalMusic")
    private Music music1;
    @Autowired
    @Qualifier("rockMusic")
    private Music music2;

    public void playMusic(TypeOfSong type) {
        Random r = new Random();
        if (type==TypeOfSong.ROCK) {
            System.out.println("Playing: " + music2.getSong(r.nextInt(3)));
        } else {
            System.out.println("Playing: " + music1.getSong(r.nextInt(3)));
        }
    }
    enum TypeOfSong {
        CLASSICAL, ROCK;
    }
}

package org.example;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    private String songName = "rockMusic1";
    @Override
    public String getSong() {
        return songName;
    }
}

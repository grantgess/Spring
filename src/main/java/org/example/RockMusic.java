package org.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    private String[] musicList = new String[]{"rockMusic1","rockMusic2","rockMusic3"};
    @Override
    public String getSong(int index) {
        return musicList[index];
    }
}

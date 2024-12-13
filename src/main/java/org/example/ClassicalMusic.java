package org.example;

import org.springframework.stereotype.Component;

@Component()
public class ClassicalMusic implements Music {
    private String[] musicList = new String[]{"classicalMusic1", "classicalMusic2", "classicalMusic3"};
    @Override
    public String getSong(int index) {
        return musicList[index];
    }
}

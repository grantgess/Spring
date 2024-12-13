package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {
    private String songName = "classicalMusic1";
    @Override
    public String getSong() {
        return songName;
    }

}

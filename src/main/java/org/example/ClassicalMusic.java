package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {
    private String[] musicList = new String[]{"classicalMusic1", "classicalMusic2", "classicalMusic3"};
    @Override
    public String getSong(int index) {
        return musicList[index];
    }
    public void doMyInit() {
        System.out.println("Initialization");
    }
    private void doMyDestroy() {
        System.out.println("Destroying");
    }
}

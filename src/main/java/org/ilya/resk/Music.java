package org.ilya.resk;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public interface Music {

    @PostConstruct
    default void doMyInit(){
        System.out.println("Init! " + this);
    }
    @PreDestroy
    default void doMyDestroy(){
        System.out.println("Destroy " + this);
    }

    List<String> getSong();
}

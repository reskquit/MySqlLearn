package org.ilya.resk;

import java.util.List;

public interface Music {

    default void doMyInit(){
        System.out.println("Init! " + this);
    }

    default void doMyDestroy(){
        System.out.println("Destroy " + this);
    }

    List<String> getSong();
}

package org.ilya.resk;

public interface Music {

    default void doMyInit(){
        System.out.println("Init! " + this);
    }

    default void doMyDestroy(){
        System.out.println("Destroy " + this);
    }

    String getSong();
}

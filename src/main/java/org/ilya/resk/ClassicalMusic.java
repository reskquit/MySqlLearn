package org.ilya.resk;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getInstance(){
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Rapsody";
    }
}
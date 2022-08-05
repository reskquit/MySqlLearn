package org.ilya.resk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    public enum Type{
        CLASSICAL,
        ROCK,
        JAZZ;
    }
    private Music music1;
    private Music music2;
    private Music music3;
    @Autowired
    public MusicPlayer(@Qualifier("RockMusic") Music music1,
                       @Qualifier("ClassicalMusic") Music music2,
                       @Qualifier("JazzMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(Type t){
        Random r =new Random();
        String answer;
        switch (t){
            case JAZZ:
                answer = music3.getSong().get( r.nextInt(music3.getSong().size()));
                break;
            case ROCK:
                answer = music1.getSong().get( r.nextInt(music1.getSong().size()));
                break;
            case CLASSICAL:
                answer = music2.getSong().get( r.nextInt(music2.getSong().size()));
                break;
            default:
                answer = "error";
        }
        return answer;
    }
}

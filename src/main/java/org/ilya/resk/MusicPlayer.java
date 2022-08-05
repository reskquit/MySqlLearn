package org.ilya.resk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private JazzMusic jazzMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic m1, JazzMusic m2){
        this.classicalMusic= m1;
        this.jazzMusic = m2;
    }

    public String playMusic(){
        /*
        System.out.println(this.classicalMusic.getSong());
        System.out.println(this.jazzMusic.getSong());

         */
        return this.classicalMusic.getSong() +" " + this.jazzMusic.getSong() ;
    }
}

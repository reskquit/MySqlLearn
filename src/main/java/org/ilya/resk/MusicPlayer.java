package org.ilya.resk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    @Autowired
    public MusicPlayer(@Qualifier("RockMusic") Music music1,
                       @Qualifier("ClassicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(){
        return this.music1.getSong() + this.music2.getSong();
    }
}

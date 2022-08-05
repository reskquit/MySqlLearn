package org.ilya.resk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Override
    public String toString() {
        return "Computer " + id + " "+musicPlayer.playMusic();
    }
    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

}

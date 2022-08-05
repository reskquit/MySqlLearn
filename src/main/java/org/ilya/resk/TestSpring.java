package org.ilya.resk;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestSpring {
    public static void main(String... a){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        //mp.playMusic();
        Computer c = context.getBean("computer", Computer.class);
        System.out.println(c.toString());
        /*
        Music musicbean1 = context.getBean("JazzMusic", Music.class);
        Music musicbean2 = context.getBean("RockMusic", Music.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(musicbean1);
        MusicPlayer musicPlayer2 = new MusicPlayer(musicbean2);
        musicPlayer1.playMusic();
        musicPlayer2.playMusic();


         */
        context.close();
    }
}

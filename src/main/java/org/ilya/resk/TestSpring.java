package org.ilya.resk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String... a){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music musicbean1 = context.getBean("JazzMusic", Music.class);
        Music musicbean2 = context.getBean("RockMusic", Music.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(musicbean1);
        MusicPlayer musicPlayer2 = new MusicPlayer(musicbean2);
        musicPlayer1.playMusic();
        musicPlayer2.playMusic();

        //Music tb = context.getBean("musicBean", Music.class);


        //MusicPlayer musicPlayer = new MusicPlayer(tb);


        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //musicPlayer.playMusic();

        //System.out.println(musicPlayer.getName() + musicPlayer.getVolume());
        //System.out.println(tb.getString());
        context.close();
    }
}

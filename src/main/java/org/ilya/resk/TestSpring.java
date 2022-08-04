package org.ilya.resk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String... a){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music tb = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(tb);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName() + musicPlayer.getVolume());
        //System.out.println(tb.getString());
        context.close();
    }
}

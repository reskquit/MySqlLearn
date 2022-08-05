package org.ilya.resk;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("RockMusic")
public class RockMusic implements Music {
    private List<String> tracks = Arrays.asList("Rock 1", "Rock 2", "Rock 3");
    @Override
    public List<String> getSong() {
        return tracks;
    }
}

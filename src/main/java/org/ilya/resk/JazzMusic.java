package org.ilya.resk;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("JazzMusic")
public class JazzMusic implements Music{
    private List<String> tracks = Arrays.asList("Jazz 1", "Jazz 2", "Jazz 3");
    @Override
    public List<String> getSong() {
        return tracks;
    }
}

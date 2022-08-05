package org.ilya.resk;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component("ClassicalMusic")
public class ClassicalMusic implements Music{
    private List<String> tracks = Arrays.asList("Classical 1", "Classical 2", "Classical 3");
    @Override
    public List<String> getSong() {
        return tracks;
    }
}

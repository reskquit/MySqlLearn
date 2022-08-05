package org.ilya.resk;

import org.springframework.stereotype.Component;

@Component("ClassicalMusic")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Rapsody";
    }
}

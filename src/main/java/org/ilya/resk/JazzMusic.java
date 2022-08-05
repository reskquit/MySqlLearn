package org.ilya.resk;

import org.springframework.stereotype.Component;

@Component("JazzMusic")
public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "Jazz play";
    }
}

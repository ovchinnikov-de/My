package org.example;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animals{
    @Override
    public String getSound() {
        return "Гав-гав";
    }
}

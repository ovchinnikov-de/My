package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animals{
    @Override
    public String getSound() {
        return "Мяу Мяу";
    }
}

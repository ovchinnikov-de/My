package org.example;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
    @Value("${player.name1}")
    private String name1;
    @Value("${player.volume1}")
    private int volume1;
    @Value("${player.name2}")
    private String name2;
    @Value("${player.volume2}")
    private int volume2;

    public String getName1() {
        return name1;
    }

    public int getVolume1() {
        return volume1;
    }

    public String getName2() {
        return name2;
    }
    public int getVolume2() {
        return volume2;
    }

    private Animals animals1;
    private Animals animals2;

@Autowired
    public Player(@Qualifier("dog") Animals animals1,@Qualifier("cat") Animals animals2) {
        this.animals1 = animals1;
        this.animals2 = animals2;
    }

    public void playerAnimal(){
        System.out.println("Собака лает "+ animals1.getSound());
        System.out.println("Кот мяукает "+ animals2.getSound());
    }
}

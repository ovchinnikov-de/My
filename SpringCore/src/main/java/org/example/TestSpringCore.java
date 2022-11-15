package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringCore {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Player animals = context.getBean("player", Player.class);
        animals.playerAnimal();
        System.out.println("Имя собаки "+animals.getName1() +" громкость "+animals.getVolume1());
        System.out.println("Имя кошки "+animals.getName2() +" громкость "+animals.getVolume2());

    }
}

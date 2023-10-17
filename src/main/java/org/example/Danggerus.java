package org.example;

import java.util.Objects;


    public abstract class Danggerus extends Animal {
    private String type;
    private  String opasno;



    // Конструктор класса
    public Danggerus(String name, String type, String opasno, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        this.type = type;
        this.opasno = opasno;
    }

    public String getType() {
        return type;
    }

    public String getOpasno(){
        return opasno;
    }

    public void dangerus() {
        System.out.println(this.type + " " + this.getName() + " опасны: " + opasno);

    }
}
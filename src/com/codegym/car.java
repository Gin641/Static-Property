package com.codegym;

public class car {
    private String name;
    private String engine;
    public static int numberofcar;
    public car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberofcar++;
    }
}

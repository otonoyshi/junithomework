package ru.netology;

import java.util.Calendar;

public class main {
    public static void main (String [] args){
        App app = new App();
        System.out.println(app.createFile("ds", "sd"));
        System.out.println(app.add(1,2));
    }
}

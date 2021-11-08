package com.company;

public class Main {

    public static void main(String[] args) {
        Boss Boss = new Boss();
        Boss.setHealth(1001);
        Boss.setDamage(70);
        Boss.setMegapower("Огниво !!!");
        System.out.println("Megaladon " + Boss.getHealth() + " \nUron " + Boss.getDamage() + "\nMegapower " + Boss.getMegapower());

    }
}

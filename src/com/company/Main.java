package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1001);
        boss.setDamage(70);
        boss.setMegapower("Огниво !!!");
        System.out.println("Megaladon " + boss.getHealth() + " \nUron " + boss.getDamage() + "\nMegapower " + boss.getMegapower());

    }
}

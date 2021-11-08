package com.company;

public class Hero {
    private int health;
    private int damage;
    private String megapower;


    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getMegapower() {
        return megapower;
    }


    public Hero(int health, int damage, String megapower) {
        this.health = health;
        this.damage = damage;
        this.megapower = megapower;
    }
}

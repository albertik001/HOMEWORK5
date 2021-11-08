package com.company;

public class Hero {
    private int health;
    private int damage;
    private String megapower;
    private String names;


    public Hero( String names, int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.names = names;
    }

    public Hero( String names, int health) {
        this.health = health;
        this.names = names;
    }
    public Hero(String names, int health, int damage, String megapower) {
        this.names = names;
        this.health = health;
        this.damage = damage;
        this.megapower = megapower;
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


    public String getNames() {
        return names;
    }


}

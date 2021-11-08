package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1001);
        boss.setDamage(70);
        boss.setMegapower("Огниво !!!");
        System.out.println("Megaladon |" + boss.getHealth() + " \nUron |" + boss.getDamage() + "\nMegapower |" + boss.getMegapower());
        createheroes();
    }

    public static Hero[] createheroes() {
        System.out.println("-----------------------------------");
        System.out.println("Comand Heroes:");
        Hero alhimic = new Hero("Alhimic -- ", 200, 20, "Magic!");
        Hero antimag = new Hero("Antimag -- ", 150, 25, "Teleport!");
        Hero pudg = new Hero("Pudg -- ", 350, 30, "Kruk!");
        Hero axe = new Hero("Axe -- ", 300, 35, "XTWO Damage!");
        Hero[] teamspirit = {alhimic, antimag, pudg, axe};
        for (Hero hero : teamspirit) {
            System.out.println(hero.getNames() + " HP:" + hero.getHealth() + " | URON:" + hero.getDamage() + " | MegaPower:" + hero.getMegapower());

        }
        return teamspirit;
    }
}

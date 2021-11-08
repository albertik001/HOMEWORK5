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
        for (int i = 0; i < teamspirit.length; i++) {
            System.out.println(teamspirit[i].getNames() + " HP:" + teamspirit[i].getHealth() + " | URON:" + teamspirit[i].getDamage() + " | MegaPower:" + teamspirit[i].getMegapower());

        }
        return teamspirit;
    }
}

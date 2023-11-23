package com.workintech.monstergame;

public class Troll extends Monster implements Bleedable,Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }

    @Override
    public double attack() {
        System.out.println(getName() + " monster has been attacked and it's bleed: "+bleed() + ", it's poison "
        + poison()+". total damage is...");
        return getDamage() + bleed() + poison();
    }
}

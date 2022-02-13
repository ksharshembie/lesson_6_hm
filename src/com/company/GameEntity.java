package com.company;

public class GameEntity {
    private String name;
    private int health;
    private int damage;

    public GameEntity() {

    }
    public GameEntity(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    public GameEntity(String name, int health) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String printInfo(){
        return "\n\t Name \t: \t" + this.getName()
                + "\n\tHealth \t: \t" + this.getHealth()
                + "\n\tDamage \t: \t" + this.getDamage();
    }
}

package com.company;

public class Skeleton extends Boss {
    private int arrowCount;

    public Skeleton() {
        super();
    }

    public Skeleton(String name, int health, int damage, int arrowCount) {
        super(name, health, damage);
        this.arrowCount = arrowCount;
    }

    public Skeleton(String name, int health, int damage, int arrowCount, String weaponType, String weaponName) {
        super(name, health, damage, weaponType, weaponName);
        this.arrowCount = arrowCount;
    }

    public Skeleton(String name, int health, int damage) {
        super(name, health, damage);
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public String printInfo() {
        return super.printInfo() + "\n\tArrows\t: \t" + this.arrowCount;
    }
}

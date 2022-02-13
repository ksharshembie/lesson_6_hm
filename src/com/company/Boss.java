package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Boss() {
        super();
    }

    public Boss(String name, int health, int damage, String weaponType, String weaponName) {
        super(name, health, damage);
        this.weapon.setWeaponType(weaponType);
        this.weapon.setWeaponName(weaponName);
    }

    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }
    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return super.printInfo() + "\n\tWeapon\t: \t" + this.weapon.getWeaponName() + " (" + this.weapon.getWeaponType() + ')';
    }

}
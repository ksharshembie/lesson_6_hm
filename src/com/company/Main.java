package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss("Surtur",1000, 100, "Sword", "Twilight Sword");
        System.out.println("Boss Info: " + boss.printInfo());
        Boss boss2 = new Boss("Thanos",500,50);
        Weapon stone = new Weapon("Magic","Infinity Stone");
        System.out.println("Boss Info: " + boss2.printInfo());
        System.out.println("New Weapon " + stone.getWeaponName() + " assigned to " + boss2.getName());
        boss2.setWeapon(stone);
        System.out.println("Boss Info: " + boss2.printInfo());
        Boss boss3 = new Boss("Altron", 400, 40, stone);
        System.out.println("Boss Info: " + boss3.printInfo());
        Skeleton skel1 = new Skeleton("Artur",50, 5, 10000);
        System.out.println("Skeleton Info: " + skel1.printInfo());
        Skeleton skel2 = new Skeleton("Gendelf",100,10, 0,"Magic","Magic Staff");
        System.out.println("Skeleton Info: " + skel2.printInfo());

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Thang";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println(player.name + " Remaing health: " + player.healthRemaining());
//
//        damage = 90;
//        player.loseHealth(damage);
//        System.out.println(player.name + " Remaing health: " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Thang", 200, "Sword");
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaing health: " + player.getHealth());
//
//        damage = 90;
//        player.loseHealth(damage);
//        System.out.println(" Remaing health: " + player.getHealth());

        Printer p = new Printer(50, true);
        System.out.println(p.getPagesPrinted());
        int pagesPrinted = p.printPages(4);
        System.out.println(pagesPrinted);
        System.out.println(p.getPagesPrinted());
        pagesPrinted = p.printPages(1);
        System.out.println(pagesPrinted);
        System.out.println(p.getPagesPrinted());
    }

}

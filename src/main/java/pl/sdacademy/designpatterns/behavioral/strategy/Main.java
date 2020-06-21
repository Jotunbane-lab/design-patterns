package pl.sdacademy.designpatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Edward", new PunchStrategy());
        warrior.hit();

        warrior.setHitStrategy(new SwordSwingStrategy());
        warrior.hit();

    }
}

package pl.sdacademy.designpatterns.creational.singleton;



public class Main {
    public static void main(String[] args) {
        //eager
        UniverseV1 universeV1 = UniverseV1.INSTANCE;
        UniverseV2 universeV2 = UniverseV2.getInstance();

        UniverseV3 universeV3 = UniverseV3.getInstance();

        System.out.println(universeV3==UniverseV3.getInstance());
    }
}

package sk.kasv.macaj.light;

import sk.kasv.macaj.light.Lamp;

public class Main {
    public static void main(String[] args) {
        Light light1 = new Light(); // vytvorenie noveho objektu
        Light light2 = new Light();

        //light1.turnOn(); // zavolanie metody
        //System.out.println(light1.info());
        light1.setBrand("philips");
        light1.setPower(9.5); // nastavi power na 9.5
        //System.out.println("brand: " + light1.getBrand()); // string brand sa priradi cez plus a zavola sa metoda get brand
        //System.out.println("power: " + light1.getPower());
        //System.out.println("price: " + light1.calcPrice(24));
        light2.setPower(6);
        //System.out.println("price2: " + light2.calcPrice(24));

        Lamp lamp= new Lamp();
        lamp.addLight1(light1); // priradi ziarovky do lammpy
        //lamp.addLight2(light2);
        lamp.turnOn();
        System.out.println(light1.info());
        System.out.println(light2.info());
        lamp.turnOff();
        System.out.println(light1.info());
        System.out.println(light2.info());
        light1.setLumen(1);
        light2.setLumen(12);

        System.out.println(lamp.getTotalLumen());

    }
}

package sk.kasv.macaj.light;

public class Lamp { // trieda s velkym zaciatocnym
    private String brand;
    private Light light1;
    private Light light2;

    public Lamp()
    {
        light1 = null;
        light2 = null;
    } //construktor

    public void addLight1(Light light)
    {
        if(light1 == null)
            this.light1 = light;
        else
            System.out.println("slot is taken");

    }
    public void addLight2(Light light)
    {
        if(light2 == null)
            this.light2 = light;
        else
            System.out.println("slot is taken");
    }
    public void removeLight1()
    {
        light1 = null;
    }
    public void removeLight()
    {
        light2 = null;
    }

    public void turnOn(){
        if(light1 != null)
            light1.turnOn();

        if(light2 != null)
            light2.turnOn();
    }
    public void turnOff() {
        if (light1 != null)
            light1.turnOff();

        if (light2 != null)
            light2.turnOff();
    }

        public double getTotalPower(){
            double power = 0;
            if (light1 != null) {
                power = power + light1.getPower();
            }
            if (light2 != null) {
                power = power + light2.getPower();
            }
            return  power;
        }
        public int getTotalLumen(){
            int lumen = 0;
            if (light1 != null) {
                lumen = lumen + light1.getLumen();
            }
            if (light2 != null) {
                lumen = lumen + light2.getLumen();
            }
            return lumen;
        }

}

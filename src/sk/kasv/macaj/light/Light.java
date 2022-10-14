package sk.kasv.macaj.light;

public class Light {
    private String brand; // premenne maju byt podstatne mena
    // zaklad oop je ze su premenne chranene
    private double power; // prikon
    private int lumen;
    private boolean led;
    private boolean state = false;
    private final double priceKwh = 0.19; // final znamena konstanta nie premenna

    public Light(){} // metoda konstruktor musi byt v kazdej novej metode

    public void turnOn() { state = true;}
    public void turnOff() {
        state = false;
    }
    public void blink(){    System.out.println("Light binked");}
    public String info(){
        return "Current state: " + state;
    }
    public void setBrand(String name){ //seter zoberie name a ulozi do brand
        this.brand = name; // this sa berie v aktualnej triede name moze byt z mimo
    }
    public void setPower(double power)
    {
        if (power<0)
            power = 0;
        if (power > 10000)
            System.out.println("prilis velka hodnota");

        this.power = power;
    }
    public String getBrand() //geter vracia hodnotu brand nemoze byt void lebo void nevracia
    {
        return this.brand; // this nemusi byt lebo je len jedna premenna s nazvom brand ale je lepsie dat
    }

    public Double getPower()
    {
        return this.power;
    }

    public Double calcPrice(int hour) //metoda na vypocet ceny v kwh vracia celkovu cenu
    {
        return power * hour * priceKwh/1000; //vykon * dlzka svietenia * cena za kwh (preto /1000)
    }

    public void setLumen(int lumen)
    {
        this.lumen = lumen;
    }
    public int getLumen()
    {
        return this.lumen;
    }


}



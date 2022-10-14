package sk.kasv.macaj.example;

import java.sql.SQLOutput;

import static sk.kasv.macaj.example.Currency.*;

public class Example {

    private final double EURTOUSD = 0.97;
    private final double EURTOTLR = 17.92;
    private final double EURTOCZK = 24.65; // id 1
    private final double EURTOHUF = 415.90; // id 2
    private final double EURTOUAH = 35.87; // id 3
    private final double EURTOCMY = 6.95; // id 4

    public static void main(String[] args) {
        //System.out.println("hello there");
        Example obj = new Example(); // novy objekt na spustanie metod
        //obj.loan();
        //obj.consuption();
        //obj.sqare();
        //obj.triangle();

        //System.out.println("max is: " +obj.max(3,2,1));
        //System.out.println("average is: " +obj.average(3,2,1,4));
        //System.out.println(obj.bmi(182, 80));
        //System.out.println(obj.season(1));

        //System.out.println("exchange is " + obj.convertEurToUsd(12));
        //double cny = obj.convertFromEUR(450, EUR);
        //System.out.println("450 EUR is " + cny);
        //System.out.println(obj.checkDate(29, 2, 2017));
        //System.out.println(obj.returnPositive(1,2,-5,-5));
        //System.out.println(obj.countNum(26));
        //System.out.println(obj.countPairNumber(1,2,3,4,5));
        //System.out.println(obj.getSameDigits(123));
        //System.out.println(obj.getSameDigits(212));
        //System.out.println(obj.sumPositiveNumbers(-5,1,-5));
        //System.out.println(obj.isSchoolMark(6));
        //System.out.println(obj.min(1.2,3,1.2));
        //System.out.println(obj.convertKmHtoMs(3.6));
        //System.out.println(obj.getDay(5));
        obj.biggest57();
        obj.multiple5();

    }

    public void loan() {
        int year = 5;
        double interest = 7.5;
        int ammount = 15000;
        double payment = 0;
        int month;

        month = year * 12;
        //payment = ammount / month ;
        payment = ammount * Math.pow(1 + interest / 100, year) / (12 * year);

        System.out.println("monthly payment: " + payment);
    }

    public void consuption() {
        double consuption = 8.3;
        int distance = 900;
        double gasPrice = 1.64;
        double price = 0;

        price = (distance / 100) * consuption * gasPrice;
        System.out.println("price is: " + price);
    }

    public void sqare() {
        double a = 2;
        if (a > 0) {
            double area = a * a; // obsah
            double perimeter = 4 * a; // obvod

            System.out.println("o is " + perimeter);
            System.out.println("area " + area);
        }
    }

    public void triangle() {
        double a = 3, b = 4, c = 5, perimeter, area;
        if (isExisting(a, b, c)) // overeie ci existuje. zavola sa metoda isExisting a ak vrati true vykona sa vypocet
        {
            perimeter = a + b + c;
            double s = (a + b + c) / 2; // pomocny vypocet pre heronov vzorec
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // heronov vzorec na vypocet obsahu trojuholnika
            System.out.println("area is: " + area);
            if (isRectangular(a, b, c)) System.out.println(" is rectangular");
            else System.out.println(" isnt rectangular");
        } else
            System.out.println("triangle does not exists ");
    }
    public boolean isExisting(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) return false; // ak plati podmienka vrati false
        // trojuholnikova nerovnost
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return true;
        }
        return false;
    }
    public boolean isRectangular(double a, double b, double c) {
        if ((a * a) == (b * b) + (c * c) || (b * b) == (a * a) + (c * c) || (c * c) == (b * b) + (a * a))
            return true;

        else return false;
    }

    public int max(int a, int b, int c) // vrati max hodnotu z 3 cisel
    {
        // dajme tomu a = 1, b = 2 , c = 3
        int temp = 0; // pomocna premenna do ktorej sa bude zapisovat vacsie cislo
        if (a >= b) temp = a; // a=1 takze je mensie ako b=2 neplati podmienka
        else temp = b; // vykona sa else ktory priradi b do premennej temp
        if (c >= temp) return c; //c=3 a temp=2 podmienka plati metoda vrati hodnotu ktora je v c
        else return temp;
    }

    public int min(int a, int b, int c) {
        int temp = 0;
        if (a < b) temp = a;
        else b = temp;
        if (c < temp) return c;
        else return temp;
    }
    public double average(double a, double b, double c, double d) {
        return (a + b + c + d / 4); // aritmeticky priemer 4 cisel
    }

    public boolean pair(int x) // metoda na zistenie parnosti ak je parna return true
    {
        return x % 2 == 0; // % je modulo operator ktory vrati zvysok po deleni a ak sa zvysok rovna 0 je parne
    }
    public String bmi(double h, int m) //metoda na vypocet bmi, a vypisania v akom bmi stave si
    {
        double bmi = 0;
        bmi = m / Math.pow(h / 100, 2); // vyska sa deli 100 lebo sa premiena na cm
        if (bmi < 20) {
            return "you are skinny bitch ";
        } else if (bmi < 25) {
            return "you are giga chad ";
        } else if (bmi < 30) {
            return "you need to eat less or you will have 0 bitches";
        } else if (bmi >= 30) {
            return "hey pigi pigi";
        }
        return "coska plano";
    }
    public String season(int month) { // metoda na vypis rocneho obdobia ty zadas cislo mesiaca a ona vypluje ake obdobie to je
        if (month == 12 || month <= 2) return "winter"; // toto || znamena or a je to vynimka lebo zima zacina 12tym mesiacom
        if (month >= 3 && month <= 5) return "spring";
        if (month >= 6 && month <= 8) return "summer";
        if (month >= 9 && month <= 11) return "autumn";
        return "coska plano";
    }

    public int kvadrant(int x, int y) {
        if (x == 0 || y == 0) return 0;
        if (x > 0) {
            if (y > 0)
                return 0;
            else return 4;
        } else {
            if (y > 0)
                return 2;
            else return 3;
        }
    }
    public double convertEurToUsd(double value) {
        return value * EURTOUSD;
    }
    public double convertEurToTlr(double value) {
        return value * EURTOTLR;
    }
    public double convertFromEUR(double value, Currency currency) {
        if (currency == CZK) return value * EURTOCZK;
        if (currency == HUF) return value * EURTOHUF;
        if (currency == UAH) return value * EURTOUAH;
        if (currency == CMY) return value * EURTOCMY;

        return 0;
    }
    public String String(int month) {

        switch (month) {
            case 1:
                return "january";

            case 2:
                return "february";

            case 3:
                return "march";

            default:
                return " ";
        }
    }
    public boolean checkDate(int d, int m, int y) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d <= 31 && d >= 0)
                return true;
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d <= 30 && d >= 0)
                return true;
        }
        if (m == 2) {
            if (y % 4 == 0) {
                if (d <= 29 && d >= 0)
                    return true;
            }
            if (d <= 28 && d >= 0)
                return true;
        }
        return false;
    }
    public int returnPositive(int a, int b, int c, int d)
    {
        int counter = 0;
        if (a > 0) counter++;
        if (b > 0) counter++;
        if (c > 0) counter++;
        if (d > 0) counter++;
         return counter;
    }
    public int countNum(int number)
    {
        int digit, sum  = 0;

        while(number > 0)
        {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public int countPairNumber(int a, int b, int c, int d, int e){
   /*
   vrati pocet parnych cisel
   0 ... patri medzi parne
    */
        int counter =0;
        if (a %2 == 0)
        {
            counter++;
        }
        if (b %2 == 0)
        {
            counter++;
        }
        if (c %2 == 0)
        {
            counter++;
        }
        if (d %2 == 0)
        {
            counter++;
        }
        if (e %2 == 0)
        {
            counter++;
        }
            return counter;
    }

    public int getSameDigits(int value){
    /* metoda prijme jedno trojciferne cislo
    a vrati pocet zhodnych cifier:
    123 - return 0
    554 - return 2
    727 - return 2
    444 - return 3
     */
        int n1 = 0,n2= 0,n3 =0;
        n1 = value % 10;
        value /= 10;
        n2 = value % 10;
        value /= 10;
        n3 = value % 10;
        if (n1 == n2  && n2 == n3  ) return  3;
        if (n1== n2 ) return 2;
        if (n2== n3 ) return 2;
        if (n3== n1 ) return 2;
        return 0 ;
    }

    public int sumPositiveNumbers(int a, int b, int c){
    /*
     metody vrati sucet kladnych cislic
     zaporne cislice ignorujeme
     2  5  6 return 13
     -1 -5 4 return 4
     7 -8 3 return 10
     */
        int result = 0;
        if (a > 0 && b > 0 && c > 0) return result = a+b+c;

        if (a > 0 && b > 0) return result = a + b;
        if (b > 0 && c > 0) return result = b + c;
        if (a > 0 && c > 0) return result = a + c;

        if (a > 0) return a;
        if (b > 0) return b;
        if (c > 0) return c;

        return result;
    }
    public boolean isSchoolMark(int value){
    /*
    vrati true, ak zadane cislo je skolska znamka,
    t.z. cislo 1 2 3 4 alebo 5
    kazde ine cislo vrati false
     */
        return value >= 1 && value <= 5;

    }

    public double min (double x, double y, double z){
    /*
    metoda vrati najmensie spomedzi 3 cislic
     */
        double min = 0;
        if (x == y) return x;
        if (x <= y ) min +=x;
        else
            y += min;

        if (min <= z ) return min;
        else
            return z;
    }

    public double convertKmHtoMs(double kmh){
    /*
    metoda prepocita rychlost zadanu v km/hodinu
    na m/s
    ak nevies vzorec, najdi na internete
     */
        return kmh/3.6;
    }

    public String getDay(int day) {
    /*
    funkcia vrati slovom nazov dna
    1 - pondelok
    2 - utorok
    ...
    7 - nedela
    kazde ine cislo vrati prazdny retazec, teda ""
     */
        switch (day) {
            case 1:
                return "monday";

            case 2:
                return "tuesday";

            case 3:
                return "wednesday";

            case 4:
                return "saturday";

            case 5:
                return "friday";

            case 6:
                return "saturday";

            case 7:
                return "sunday";

            default:
                return " ";
        }

    }
    public void biggest57() //najvacsie stvorciferne cislo delitelne 57
    {
        int number = 9999;
        while (number %57 != 0)
        {
            number--;
        }
        System.out.println(number);
    }
    public void multiple5()
    {
        int number = 0;
        while (number < 95)
        {
            number +=5;
            System.out.println(number);
        }
    }
}
package sk.kasv.macaj.example.Loop;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
    While  obj = new While();


        //obj.printNum3();
        //obj.printNumber7Not2();
        //obj.triplecifer();
        //obj.pali();
        //obj.interest();
        obj.pokladnicka();

    }
    public void printNum3() {
        //vypis nasaobkov cisla 3 <10,99>
        int number = 12;
        while(number <= 99)
        {
            System.out.print(number);
            number +=3;
            if (number < 100 ) System.out.print(", ");


        }

    }
    public void printNumber7Not2() {
        // vypis cisel do sto ktore su delitelne 7 ale niesu delitelne 2
        //int number = 1;
       /* while (number <= 100)
        {
            number++;
            if (number %7 == 0 && number %2 != 0)
                System.out.print(number + " ");
        }
    }
    */
        int number = 7;
        while( number < 100)
        {
            System.out.print(number +" ");
            number += 14;
        }
    }
    public void triplecifer() {
        // trojciferny sucet sa musi rovnat 20
        int number =1 ;
        int n1,n2,n3;
        int help;

        while(number <=999)
        {
            help = number;
            n1 = help %10;
            help /= 10;
            n2 = help %10;
            help /= 10;
            n3 = help %10;
            help /= 10;

            if(n1 + n2 + n3 == 20){
                System.out.println(number);
            }
            number++;
        }
    }
    public void pali() {
        // palindromy 4 ciferneho cisla
        int number =1 ;
        int n1,n2,n3,n4;
        int help, counter = 0;

        while(number <=9999)
        {
            help = number;
            n1 = help %10;
            help /= 10;
            n2 = help %10;
            help /= 10;
            n3 = help %10;
            help /= 10;
            n4 = help %10;
            help /= 10;

            if(n1 == n2 && n2 == n3 && n3 == n4){
                System.out.println(number);
                counter ++;
            }
            number++;

        }
        System.out.print(" there is " + (counter) + " palindromes ");
        
    }
    public void interest() {
        double money = 100000;
        double interest = 0.07;
        int counter = 0;
        double help;
        while (counter <15)
        {
            help  = money * interest * 0.8 ;
            money += help;
            counter ++;
        }
        System.out.printf("you have "+ money);
    }

    // System.in praca so scenerom
    //syntax Scanner sc = Scanner(System.in)
    public void circle(){
        Scanner sc =  new Scanner(System.in);
        double r = sc.nextInt();
        double o = 0;
        double S = 0;
        o = 2 * Math.PI * Math.pow(r,2);
        S = Math.PI * r *r;

        System.out.printf("o = " + o);
        System.out.printf("S = " + S);
    }
    public void pokladnicka(){
        int dayEnd = 20;
        int dayStart = 1;
        int money = 0;
        int help = 0;

        while (dayStart <= dayEnd){
            money += help;
            money++;
            help++;
            dayStart++;
        }
        System.out.println(money);
    }

}


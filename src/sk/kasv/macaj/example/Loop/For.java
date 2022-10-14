package sk.kasv.macaj.example.Loop;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class For {
    Scanner sc =  new Scanner(System.in);
    Random rand = new Random();
    public static void main(String[] args) {
        For obj = new For();


        //obj.cycleFor();
        //obj.doubleDigits();
        //obj.printAtoB();
        //obj.isDevidable();
        //obj.pow();
        //obj.fib();
        //obj.printNum();
        //obj.chceck3Digits();
        //obj.chceckHowManyDigits();
        //obj.print11();
        //obj.sum7();
        //obj.count3No9();
        //obj.digitSum(222);
        //obj.alphabet();
        //obj.task();
        //obj.guessNum();
        //obj.star();
        obj.test();
    }

    public void cycleFor() {
        for(int i=0; i < 15;i++){
            System.out.println("ahoj");
        }
    }
    public void doubleDigits(){
        for(int i = 99; i > 10; i--){
            if (i %2 ==0) System.out.println(i);
        }
    }
    public void printAtoB(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b){
            for(int i = a; a <=b; i++){
                System.out.println(i);
            }
        }
        else{
            for (int i = a; i >=b; i--)
                System.out.println(i);
        }
    }
    public void isDevidable(){
        int m = 5;
        int counter = 0;
        for (int i = 1;i <= m; i++) {
            if (m % i == 0) counter++;

        }
        System.out.println(counter);
    }
    public void pow(){

        for(int i = 0; i < 20; i++) {
            System.out.println(Math.pow(2,i));

        }
    }
    public void fib(){
        int n1=1,n2=1,n3,i,count=18;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    public void printNum(){
        for (int i = 65; i <= 500; i++)
            System.out.print((char)i +" " );
    }
    public void chceck3Digits(){


        System.out.println("type 3 digits number");

        for (;;){
            int number = sc.nextInt();
            if(number < 100 || number > 999) {
                System.out.println("wrong number ");
            }
            else {
                System.out.printf("good ");
                break;}

        }
    }
    public void chceckHowManyDigits(){
        int number = sc.nextInt();
        int digits = 0;

        while (number > 0 ) {
            if(number == 0) {
                System.out.println("1");
                break;
            }
            number /= 10;
            digits++;
        }
        System.out.print(digits);
    }
    public void print11(){
        // vytoda vypise vsetky 3-ciferne cisla delitelne cislom 11 vzostupne
        // 110, 121, 132, .......
        int number = 110;
        while(number <= 999){
            if(number % 11 == 0)
                System.out.println(number);
            number ++;
        }
    }
    public void sum7(){
        // metoda vypise sucet vsetkych cisel mensich ako 100, ktore su
        // delitelne cislom 7
        // 7+14+21+....... =
        int number = 7;
        int help = 0;
        while (number <= 100){
            if (number % 7 == 0) {
                help = number;
                help += number;
            }
            number ++;

        }
        System.out.println(help);
    }
    public void count3No9(){
        // metoda vypise jedno cislo, a to pocet stvorcifernych cisel
        // ktore su delitelne 3 ale nie su delitelne cislom 9
        // vypisat len pocet, kolko ich je
        // 3, 6, 12, 15, 21 , ........ 9996
        int number = 1000;
        int help = 0;
        while (number <= 9999){
            if(number % 3 == 0 && number %9 != 0)
                help++;
                //System.out.println(number);

            number ++;
        }
        System.out.println(help);
    }
    public void digitSum(int num){
        // metoda prijme jedno cele cislo a vypise ciferny sucet
        // cislo moze mat lubovolny pocet cifier
        // pr. 798 : 7+8+9 = 24,    2145123 = 2+1+4+5+1+2+3 = 18
        //11
        // napoveda: while

        int save = 0;
        int help = 0;

        while (true){
            save = num %10;
            num /=10;
            help += save;
            if ( num == 0)
                break;
        }
        System.out.println(help);
    }
    public void alphabet(){
        // metoda vypise pomocou vcyklu for pismena malej abecedy zostupne,
        // z y x ....... d c b a
        // pozrite si ASCII tabulku
        for (int i =122; i >= 97; i--)
            System.out.print((char)i + " ");
    }
    public void task() {
        // metoda opyta od uzivatela 3 cele cisla: int start, int count, int step
        // pomocou cyklu for alebo while vypise na obrazovku tolko cisel, kolko je count,
        // zacneme od cisla start a budeme zvysovat o hodnotu krok
        // pr1: start = 45, count =5, step = 11 : Vypis: 45, 56, 67, 78, 89
        System.out.print("type starting number: ");
        int start = sc.nextInt();
        System.out.print("type count: ");
        int  count = sc.nextInt();
        System.out.print("type step: ");
        int step = sc.nextInt();
        System.out.print("result is : ");
        while (count > 0){
            System.out.print(start + " ");
            start += step;
            count --;
        }
    }
    public void guessNum() {
        int num;
        int guess = 0;
        int numberOfguess = 5;
        System.out.println("zadaj cislo: ");
        num = rand.nextInt(100) + 1;
        System.out.println(num);

        while (num != guess) {
            if (numberOfguess == 0)
                break;
            guess = sc.nextInt();
            if (guess > num)
                System.out.println("less");

            if (guess < num)
                System.out.println("more");
            numberOfguess--;
            System.out.println("you have: " + numberOfguess + " guesses");
        }
        if (num == guess)
            System.out.println("good job");
        else
            System.out.println("you lost");
    }
    public void star(){
        System.out.print("zadaj pocet riadkov: ");
        int a = sc.nextInt();
        System.out.print("zadaj pocet stlpcov: ");
        int b = sc.nextInt();
        System.out.println();
        for(int i = 0; i < b; i++){
                if (i == 0 || i == b-1){
                    for (int j = 0; j < a; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                else {
                    System.out.print("*");
                    for (int k = 0; k < a-2; k++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println();
                }
        }
    }
    public void test() {
        int points = 0;
        int a;
        int b;
        int result;

        for (;;) {
            a = rand.nextInt(20) + 1;
            b = rand.nextInt(20) + 1;
            result = 0;
            System.out.print(a + "*" + b + "= ");
            result = sc.nextInt();
            if (result == a * b)
                System.out.println("corr");
            System.out.println("do you want next question? ");

            char question = sc.next().charAt(0);
            if (question == 'y') {
                if (result == a * b) {

                    points++;
                }
            }
            if (question == 'n')  {
                break;
            }
            else {
                break;
            }
        }
        System.out.println("you have " + points + " points");
    }
}


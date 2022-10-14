package sk.kasv.macaj.example.array;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;


public class Array {



    public static void main(String[] args) {
        Array obj = new Array();
        Random rand = new Random();
        Scanner sc =  new Scanner(System.in);
        int[]p = new int [17];
        p[0] = 12;
        p[1] = 3;
        p[2] = 9;
        p[3] = 4;
        p[4] = 9;
        int help = 0;


        for (int i = 0; i < 5; i++){

        }
        for (int i= 5; i < 9; i++){
            p[i] = p[i-2] + p[i-1];

        }
        for (int j = 10; j < 15; j++){
            p[j] = rand.nextInt(65)+5;

        }

        for (int j = 15; j < 17; j++){
            p[j] = sc.nextInt();

        }
        for (int i = 0; i < 17; i++)
            System.out.println(p[i]);
        for (int j =0; j < p.length; j++)
            help += p[j];

        double avg = (double)help/p.length;
        System.out.println("Average is: " + avg);




    }

}

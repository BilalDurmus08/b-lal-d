package Udemy;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        System.out.println("***********App to find amstrong number***********");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPlease give number: ");
        int number = scan.nextInt();
        double numberPercentage ;
        int product=0;
        int i = 0;
        if (number<=0){
            System.out.println("Please give us positive number");
            System.exit(0);
        }
        else if (0<number && number<10){
            i=1;
        }
        else if (10<=number && number<100){
            i=2;
        }
        else if (100<=number && number<1000){
            i=3;
        }
        else if (1000<=number && number<10000){
            i=4;
        } else if (10000<=number && number<100000) {
            i=5;
        }
        else {
            System.out.println("Please give us more smaller number");
            System.exit(0);
        }
        while(number<=10){
            numberPercentage = number%10;
            product = product + (int) (Math.pow(numberPercentage,i));
            number = number / 10;
        }

        if (product == number){
            System.out.println(number+": This number is amstrong");
        }
        else {
            System.out.println(number+": This number is not amstrong");
        }
    }
}

package Dice;
import java.util.*;
class Dice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This program is to generate a random number on a dice.");
        System.out.println("Enter true to roll the dice.");
        boolean val=sc.nextBoolean();
        int max=6,min=1;
        while(val) {
            int random=(int)(Math.random() * (max - min + 1) + min);
            System.out.println("The number on the dice is: "+random);
            System.out.println("Enter true to roll the dice.");
            val=sc.nextBoolean();
        }
    }
}
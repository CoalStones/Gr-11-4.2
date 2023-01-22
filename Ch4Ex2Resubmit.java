package ch4ex2;

import java.util.Scanner;

public class Ch4Ex2Resubmit {

    public static void main(String[] args) {
        double d,cost;
        System.out.print("Welcome to Create a Pizza!\nCoded by Cole\n\nPlease enter the diameter of your pizza\n");
        Scanner input = new Scanner(System.in);
        
        d=input.nextDouble();
        cost=0.75+1+0.05*d*d;
        System.out.format("The cost of your pizza is %.2f",cost,"$\n");
    }
    
}

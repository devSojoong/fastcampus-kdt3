package me.java.practice;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        double total = 0;
        //int product = 0;
        double vat = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("노트북 제품 값 : ");
        double productCost = scanner.nextDouble();

        //Scanner scanner1 = new Scanner(System.in);
        System.out.print("지불한 돈 : ");
        double bill = scanner.nextDouble();

        total = productCost + (productCost * 0.1);

        double change = 0;
        change = bill - total;

        System.out.println("잔돈은 : " + change);
    }
}

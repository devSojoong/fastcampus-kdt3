package me.java.practice;

import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);

        Scanner sc2 = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc2.nextInt();

        if(num1 > num2){
            System.out.println("최솟값 : " + num1 + ", 최댓값 : " + num2);
        }
        else if(num1 < num2){
            System.out.println("최솟값 : " + num2 + ", 최댓값 : " + num1);
        }
        else if(num1 == num2){
            System.out.println("똑같다.");
        }

    }
}

package me.java.datatype;

public class Main {
    public static void main(String[] args) {
        // 자료형 (data type)
        // 원시형 (primitive type) : stack 공간
        // int (4byte) : -2^31 ~ 2^31 -1  / long : int 사용 시 부족할 때 사용.
        // float(4byte) :
        // double(4byte)
        // char(2byte)
        // 1byte = 8bit
        // =================================
        // 참조형 (reference type) : Heap 공간
        // String 은 클래스

        byte b = (byte)100000;  //type casting (명시적 형변환)
        int i = (int)1000.000; //type casting (명시적 형변환)
        long l = 10;    // 자동 형변환
        double d = 3.14;
        float f = 3.14F;

        //쓰레기값 예시.
        byte var1 = 125;    // -128 ~ 127
        int var2 = 125;

        for (int j = 0; j < 5; j ++) {
            var1++; // var1 = var1 + 1
            var2++; // var2 = var2 + 1
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
            // 문자열 + 문자열 = 문자열의 결합 "a" + "b" = "ab"
            // 문자열 + 정수 = 문자열의 결합 "a" + 130 = "a130"
            // "a" + "130" = "a130" -> 정수를 문자열처럼 promotion 시켜서 결합.
        }
    }
}

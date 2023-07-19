package com.bootcoding.recursion;

public class PrintEvenOrOdd
{
    public static void main(String[] args) {
        int first=1;
        int last=10;
        evenOddMethod(10);

    }
    private static void evenOddMethod(int n){
        // Termination Condition or Base Condition
        if(n == 0){
            return;
        }

        if(n % 2 == 0){
            System.out.println(n);
        }
        int count = 0;
//        System.out.println("Count= " + count + "  i = " + i);
        evenOddMethod(n-1);

        if(n % 2 != 0){
            System.out.println(n);
        }
    }
}

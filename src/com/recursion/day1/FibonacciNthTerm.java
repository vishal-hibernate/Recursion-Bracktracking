package com.recursion.day1;

public class FibonacciNthTerm {

    public static void main(String[] args) {
        System.out.println("Nth Fibonacci term is : "+getNthTermInFibonacci(6));
    }

    public static int getNthTermInFibonacci(int n) {
        if(n==0 || n==1) {
            return n;
        }

        return getNthTermInFibonacci(n-1)+getNthTermInFibonacci(n-2);
    }
}

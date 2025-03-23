package org.example;

public class TriangleNumberCalculator {
    
    //which returns the nth triangular number
    int value(int n){
        if(n==1){ 
            return 1;
        }
    return value(n - 1) + n;
    } 

    //which adds the nth and mth triangular numbers
    int add(int n, int m){
        return value(n) + value(m);
    } 

    //which subtracts the nth and mth triangular numbers
    int subtract(int n, int m){
        return value(n) - value(m);
    } 

}

package models;

import java.time.LocalDateTime;

public class Calculator {

    private int lastSum;

    public int getLastSum(){
        return lastSum;
    }
    public void setLastSum(int num){
        lastSum = num;
        lastChanged = LocalDateTime.now();
    }


    private LocalDateTime lastChanged;
    public LocalDateTime getLastChanged() {
        return lastChanged;
    }





    public int Sum (int num1 , int num2){
        int sum = num1+num2;
        System.out.println("Součet: " +num1+ " + " + num2 + " = " + sum);
        setLastSum(sum);
        return sum;
    }



}

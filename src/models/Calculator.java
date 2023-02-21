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

    public double Sum(double num1, double num2){
        System.out.println("Součet: " +num1+ " + " + num2 + " = " + (num1+num2));
        return num1+num2;
    }

    public double Sum(Number num1, Number num2){
        double number1 = num1.getNum();
        double number2 = num2.getNum();
        System.out.println("Součet: " +number1+ " + " + number2 + " = " + (number1+number2));
        return number1+number2;
    }
//více metod co dělají to samé, jen v jiných proměnných - přetěžování

    public double Sum(OneNumber num1, OneNumber num2){
        double number1 = num1.getOneNumber();
        double number2 = num2.getOneNumber();
        System.out.println("Součet: " +number1+ " + " + number2 + " = " + (number1+number2));
        return number1+number2;
    }

}

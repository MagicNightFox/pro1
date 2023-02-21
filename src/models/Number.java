package models;

import java.time.LocalDateTime;

public class Number {

    private double num;
    private LocalDateTime createdAt;

    public Number(double num){
        this.num = num;
        createdAt = LocalDateTime.now();
    }
// =zapouzdření

    public double getNum(){
        return num;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public static void vypisPocetHvezdicek(int x){
        if (x==0) return;
        String hvezdicky ="";
        for (int i = 0;i<x;i++){
            hvezdicky +="*";
        }
        System.out.println(hvezdicky);
        vypisPocetHvezdicek(x-1);

    }

}

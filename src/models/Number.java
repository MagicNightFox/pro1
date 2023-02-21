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

}

package models;

public class Zlomek implements OneNumber{

    private int citatel;
    private int jmenovatel;

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

public int NejvetsiSpolecnyDelitel (int a, int b){
    if(b==0) return a;
    return NejvetsiSpolecnyDelitel(b,a%b);
}


    @Override
    public String toString() {
        return citatel + "/" + jmenovatel;
    }

    @Override
    public boolean equals(Object obj) {
        Zlomek zlomek1=(Zlomek)obj;
       /* if(zlomek1.jmenovatel == this.jmenovatel && zlomek1.citatel == this.citatel){
            return true;
        }
        return false;*/

        if(this.citatel != zlomek1.getCitatel()){
            return false;
        }
        if(this.jmenovatel != zlomek1.getJmenovatel()){
            return false;
        }
        return true;
    }


    @Override
    public double getOneNumber() {
        return citatel/jmenovatel;
    }
}

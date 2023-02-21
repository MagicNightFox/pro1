package models;

public class Zlomek {

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




    @Override
    public String toString() {
        return citatel + "/" + jmenovatel;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

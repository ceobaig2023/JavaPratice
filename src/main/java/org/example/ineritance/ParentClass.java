package org.example.ineritance;

public class ParentClass {
    private int housenumber;
    public int addharNo;
    protected int pin;

    /*public ParentClass(int housenumber, int addharNo, int pin) {
        this.housenumber = housenumber;
        this.addharNo = addharNo;
        this.pin = pin;
    }*/

    public int getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(int housenumber) {
        this.housenumber = housenumber;
    }
}

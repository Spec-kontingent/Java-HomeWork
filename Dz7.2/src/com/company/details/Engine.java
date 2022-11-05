package com.company.details;

public class Engine {
    private int mosh;
    private String firm;
    public Engine(){}
    public Engine(int mosh,String firm){
        this.mosh=mosh;
        this.firm=firm;
    }
    public String toString(){return mosh+", "+firm;}

    public int getMosh() {
        return mosh;
    }

    public void setMosh(int mosh) {
        this.mosh = mosh;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
}

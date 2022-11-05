package com.company.professions;

public class Driver {
    private String fio;
    private int stag;
    public Driver(){}
    public Driver (String fio,int stag){
        this.fio=fio;
        this.stag=stag;
    }
    public String toString(){return fio+", "+stag;}

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getStag() {
        return stag;
    }

    public void setStag(int stag) {
        this.stag = stag;
    }
}

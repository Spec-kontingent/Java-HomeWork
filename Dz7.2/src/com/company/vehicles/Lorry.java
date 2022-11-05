package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int gryz;
    public Lorry(){}
    public Lorry(int gryz, String marka, String klass, int ves, Driver driver, Engine motor) {
        super(marka,klass,ves,driver,motor);
        this.gryz=gryz;
    }

    public int getGryz() {
        return gryz;
    }

    public void setGryz(int gryz) {
        this.gryz = gryz;
    }
}

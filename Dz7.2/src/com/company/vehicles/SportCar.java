package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int sped;
    public SportCar(){}
    public SportCar(int sped, String marka, String  klass, int ves, Driver driver, Engine motor) {
        super(marka,klass,ves,driver,motor);
        this.sped=sped;
    }

    public int getSped() {
        return sped;
    }

    public void setSped(int sped) {
        this.sped = sped;
    }
}

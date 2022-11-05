package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String marka;
    private String  klass;
    private int ves;
    private Driver driver;
    private Engine motor;
    public Car(){}
    public  Car(String marka,String klass, int ves, Driver driver,Engine motor){
        this.marka=marka;
        this.klass=klass;
        this.ves=ves;
        this.driver=driver;
        this.motor=motor;
    }

    public void start(){System.out.println("Поехали!");}
    public void stop(){System.out.println("Останавливаемся.");}
    public void turnRight(){System.out.println("Поворот направо.");}
    public void turnLeft(){System.out.println("Поворот налево.");}
    public String toString(){return marka+", "+klass+", "+ves+", "+driver.toString()+", "+motor.toString();}

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

}

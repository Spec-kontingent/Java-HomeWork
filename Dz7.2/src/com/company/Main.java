package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.SportCar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Driver driver=new Driver("Иванов Иван Иванович",15);
        Engine eng=new Engine(10,"Пежо");
        Car car = new SportCar(110,"Пежо", "S",210,driver,eng);
        System.out.println(car.toString());
        car.start();
        car.turnLeft();
        car.stop();


    }
}
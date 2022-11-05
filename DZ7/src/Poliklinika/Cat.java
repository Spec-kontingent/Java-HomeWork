package Poliklinika;

public class Cat extends Animals {

    Cat(){};
    Cat(String name, int age) {
        super(name,age);
    }
    @Override
    public void makeNoise(){
        System.out.printf("Котик %s говорит Мяв", getName());
    }
}

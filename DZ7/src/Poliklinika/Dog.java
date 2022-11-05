package Poliklinika;

public class Dog extends Animals{
    Dog(){};
    Dog(String name, int age) {
        super(name,age);
    }
    @Override
    public void makeNoise(){
        System.out.printf("Собачка %s говорит Гав", getName());
    }

}

package Poliklinika;

public class Rat extends Animals{
    Rat(){};
    Rat(String name, int age) {
        super(name,age);
    }
    @Override
    public void makeNoise(){
        System.out.printf("Крыса %s говорит 'Я все расскажу'", getName());
    }

}

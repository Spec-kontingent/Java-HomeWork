package Poliklinika;

public abstract class Animals {

    private String name;
    private int age;

    Animals(){}
    Animals(String name,int age){
        this.name=name;
        this.age=age;
    }

    abstract void makeNoise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

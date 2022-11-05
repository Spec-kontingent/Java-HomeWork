public class Phone {
    private long number;
    private String model;
    private int weight;
    // weight? Вес телефона? из ДЗ непонятно, что значит переменная и зачем вообще нужна

    public Phone(){}
    public Phone(long number,String model,int weight){
        this(number,model);
        this.weight=weight;
    }
    public Phone(long number,String model){
        this.number=number;
        this.model=model;

    }
    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }
    public void receiveCall(String name,long number){
        System.out.println("На номер "+number+" звонит "+name);
    }

    public static void sendMessage(long ... number) {
         for (long n:number) {
             System.out.print(n+", ");
        }
    }




    public long getNumber () {
        return number;
    }
    public void setNumber(long number) {
        this.number=number;
    }
    public String getModel () {
        return model;
    }
    public void setModel(String model) {
        this.model=model;
    }
    public int getWeight () {
        return weight;
    }
    public void setWeight (int weight) {
        this.weight=weight;
    }
}

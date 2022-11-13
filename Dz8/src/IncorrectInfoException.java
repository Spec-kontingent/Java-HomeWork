public class IncorrectInfoException extends Exception{
    private String fio;
    private int age;

    public IncorrectInfoException(String mes, int age){
        super(mes);
        this.age=age;
    }
    public IncorrectInfoException(String mes, String fio){
        super(mes);
        this.fio=fio;
    }

    public String getFio (){return fio;}
    public int getAge(){return age;}

}

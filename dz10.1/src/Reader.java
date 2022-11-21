import java.io.Serializable;
import java.util.LinkedList;

public class  Reader implements Serializable {
    private static final long serialVersionUID = 1L;
    private String surname;
    private String name;
    private String otchestvo;
    private int bilet;
    private String facultet;
    private String born;
    private long telefon;
    public LinkedList <Book> spisok= new LinkedList<Book>();
    public Reader (){}



    public String fio (){
        char[] n = this.name.toCharArray();
        char[] ot = this.otchestvo.toCharArray();
        return surname+" "+n [0]+". "+ot[0]+". ";

    }
   public void takeBook (String name,String authorName) {

        if (spisok.size()<10) {
            if(spisok.add(new Book(name,authorName)))
                System.out.print(fio()+" взял(а) книгу "+ spisok.get(spisok.size()-1).getName());
        else  {System.out.println("Такая книга уже взята читателем.");}
        }
        else {
            System.out.println("Взято максимальное количество книг.");
        }
    }
    public void returnBook (Book book) {
        boolean isFull=true;
        for(Book b: spisok){
        if(b.getName().equals(book.getName())){
            spisok.remove(b);
            isFull=false;
            System.out.println(fio() + " вернул(а) книгу  " + book.getName());
        }}
        if(isFull){
        System.out.println(fio() +  " не хранит книгу " + book.getName());
        }
    }
    public void printStatus (){
        if (spisok.size()>0) {
            System.out.print("\n"+fio() + "взял(а) " + spisok.size() + " книг(у/и): ");
            for (Book i:spisok) {
                System.out.print(i.getName() + ", ");
                }
         }
        else {System.out.println(fio()+" не брал(а) книг.");}

    }


    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public int getBilet() {
        return bilet;
    }

    public void setBilet(int bilet) {
        this.bilet = bilet;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }


}

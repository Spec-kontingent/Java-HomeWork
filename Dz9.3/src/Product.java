public class Product {
    private String name;
    private int kol;
    Product(){}
    Product (String name,int kol){
        this.name=name;
        this.kol=kol;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }
}

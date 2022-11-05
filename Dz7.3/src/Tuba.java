public class Tuba implements Instrument{
    private int diametr;
    public Tuba(){}
    public Tuba(int diametr){
        this.diametr=diametr;
    }

    @Override
    public void play (){
        System.out.println("Играет туба диаметром "+diametr+" см. в "+KEY);
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }
}
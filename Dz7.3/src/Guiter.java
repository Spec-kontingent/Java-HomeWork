public class Guiter implements Instrument{
    private int stryn;
    public Guiter(){}
    public Guiter(int stryn){
        this.stryn=stryn;
    }

    @Override
    public void play (){
        System.out.println("Играет гитара с "+stryn+" струнами в "+KEY);
    }

    public int getStryn() {
        return stryn;
    }

    public void setStryn(int stryn) {
        this.stryn = stryn;
    }
}

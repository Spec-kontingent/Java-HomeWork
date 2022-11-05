public class Drum implements Instrument{
    private int razmer;
    public Drum(){}
    public Drum(int razmer){
        this.razmer=razmer;
    }

    @Override
    public void play (){
        System.out.println("Играет барабан размером "+razmer+" см. в "+KEY);
    }

    public int getRazmer() {
        return razmer;
    }

    public void setRazmer(int razmer) {
        this.razmer = razmer;
    }
}


public class Main {
    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[3];
        instruments[0]=new Guiter(12);
        instruments[1]=new Drum(48);
        instruments[2]=new Tuba(28);

        for (Instrument i:instruments){
            i.play();
        }
    }
}
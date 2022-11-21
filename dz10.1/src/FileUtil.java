import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;

public class FileUtil {
    FileUtil(){};

    public static boolean saveReadersList(ArrayList<Reader> readers) {
        boolean is = true;
        try (FileOutputStream writer= new FileOutputStream("C:\\Users\\Ann\\Desktop\\Java\\HomeWork\\file.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream (writer);
            oos.writeObject(readers);

        } catch (Exception ex) {
            is= false;
            ex.printStackTrace();
        }
        if (is){return true;}
        else {return false;}

    }
    public static ArrayList<Reader> restoreReadersList() {
        ArrayList <Reader> fail = new ArrayList<Reader>();
            try (FileInputStream file = new FileInputStream("C:\\Users\\Ann\\Desktop\\Java\\HomeWork\\file.txt")) {
                ObjectInputStream oos = new ObjectInputStream (file);
                fail = (ArrayList<Reader>) oos.readObject();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return fail;
        }



}

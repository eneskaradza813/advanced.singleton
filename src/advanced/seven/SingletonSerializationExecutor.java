package advanced.seven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerializationExecutor {

    public static void main(String[] args) throws Exception {
        SingletonExecutor singletonExecutor = new SingletonExecutor();
        SingletonExecutor.ObjectPrinter printer = singletonExecutor.new ObjectPrinter();
        
        SingletonLazy nasFadil = SingletonLazy.getInstance();
        printer.print("Nas Fadil", nasFadil);
        SingletonLazy drugiFadil = SingletonLazy.getInstance();
        printer.print("Nas Fadil 2..", drugiFadil);
        
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("fadil.ser"));
        output.writeObject(nasFadil);
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("fadil.ser"));
        SingletonLazy deserijalizovanFadil = (SingletonLazy)input.readObject();
        printer.print("deserijalizovan Fadil : ", deserijalizovanFadil);
    }
}

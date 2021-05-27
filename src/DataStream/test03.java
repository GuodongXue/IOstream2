package DataStream;

import java.io.*;

public class test03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Max_Win_Pro\\Desktop\\demo.txt")));
        //Object o = ois.readObject();
        Teacher t = (Teacher) (ois.readObject());
        System.out.println(t);
        ois.close();
    }
}

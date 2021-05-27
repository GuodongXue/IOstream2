package DataStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class test02 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("C:\\Users\\Max_Win_Pro\\Desktop\\demo.txt")));
        System.out.println(dis.readInt());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
    }
}

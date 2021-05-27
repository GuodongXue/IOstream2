package DataStream;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("C:\\Users\\Max_Win_Pro\\Desktop\\demo.txt")));
        dos.writeInt(23);
        dos.writeBoolean(false);
        dos.writeDouble(9.7);
        dos.writeUTF("abcnihao");
        dos.close();
    }
}

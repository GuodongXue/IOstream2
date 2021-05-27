package DataStream;

import java.io.*;

public class TestOutputObject {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Max_Win_Pro\\Desktop\\demo.txt")));
        //Student s = new Student(18, 160.5, "lili");
        Teacher t = new Teacher("sxty", "122333s");
        t.age = 10;
        oos.writeObject(t);
        oos.close();
    }
}

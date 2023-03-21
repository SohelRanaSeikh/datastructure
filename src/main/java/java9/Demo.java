package java9;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("C:\\Users\\sohseikh\\Desktop\\test.txt")) {
            //file=new FileReader("C:\\Users\\sohseikh\\Desktop\\test.txt");
            System.out.println("try Test");
        } catch (FileNotFoundException e) {
            System.out.println("catch Test");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("catch Test2");
            e.printStackTrace();
        }
    }
}

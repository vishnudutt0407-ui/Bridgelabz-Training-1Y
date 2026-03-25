package src;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class exception {
    //    public static void main(String[] args){
//        int age = 15;
//        if (age < 18){
//            throw new ArithmeticException("not eligible");
//
//        }
//        System.out.println("eligible");
//    }
    static void checkfile() throws IOException{
        FileReader file = new FileReader("test.txt");


    }

    public static void main(String[] args) {
        try {
            checkfile();
        }
        catch(IOException a) {
            System.out.println("file not found");
        }


    }

}

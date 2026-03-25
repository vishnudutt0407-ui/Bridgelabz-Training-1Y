package src;

import java.time.Duration;

public class Testexample extends Thread {
    public void run(){
        for (int i=1; i<=5; i++) {
            System.out.println("Number:" + i);
            try {
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println("Error occured in task 1...");
            }
        }
    }
    public static void main(String[] args){
        Testexample t1 =new Testexample();
        Testexample2 t2 = new  Testexample2();
        t1.start();
        t2.start();
    }

}

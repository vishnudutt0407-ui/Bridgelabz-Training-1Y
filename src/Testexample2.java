package src;

public class Testexample2 {
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println("Task 2:" + i);
            try
            {
                Thread.sleep(2000);

            }
            catch(Exception e){
                System.out.println("Error occured in task 2...");
            }
        }
    }
}

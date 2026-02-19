package src.methods.Level2;
import java.util.Scanner;
public class StudentVoteChecker{
    public boolean canStudentVote(int age){
        if(age<0)return false;
        else if(age>=18)return true;
        else return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]ages=new int[10];
        StudentVoteChecker obj=new StudentVoteChecker();
        for(int i=0;i<10;i++){
            System.out.print("Enter age of student "+(i+1)+": ");
            ages[i]=sc.nextInt();
            if(obj.canStudentVote(ages[i]))System.out.println("Student "+(i+1)+" can vote");
            else System.out.println("Student "+(i+1)+" cannot vote");
        }
    }
}

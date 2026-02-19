package src.methods.Level3;
import java.util.Scanner;
public class StudentMarks{
    public static int[][] generateMarks(int n){
        int[][]marks=new int[n][3];
        for(int i=0;i<n;i++){
            marks[i][0]=(int)(Math.random()*91)+10;
            marks[i][1]=(int)(Math.random()*91)+10;
            marks[i][2]=(int)(Math.random()*91)+10;
        }
        return marks;
    }
    public static double[][] calculateTotals(int[][]marks){
        int n=marks.length;
        double[][]res=new double[n][3];
        for(int i=0;i<n;i++){
            double total=marks[i][0]+marks[i][1]+marks[i][2];
            double avg=Math.round((total/3)*100.0)/100.0;
            double perc=Math.round((total/300*100)*100.0)/100.0;
            res[i][0]=total; res[i][1]=avg; res[i][2]=perc;
        }
        return res;
    }
    public static void displayScorecard(int[][]marks,double[][]res){
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for(int i=0;i<marks.length;i++){
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n",i+1,marks[i][0],marks[i][1],marks[i][2],res[i][0],res[i][1],res[i][2]);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[][]marks=generateMarks(n);
        double[][]res=calculateTotals(marks);
        displayScorecard(marks,res);
    }
}

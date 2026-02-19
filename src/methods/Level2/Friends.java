package src.methods.Level2;
import java.util.Scanner;
public class Friends{
    public static String findYoungest(int[]ages,String[]names){
        int minAge=ages[0];
        int index=0;
        for(int i=1;i<ages.length;i++){
            if(ages[i]<minAge){
                minAge=ages[i];
                index=i;
            }
        }
        return names[index];
    }
    public static String findTallest(double[]heights,String[]names){
        double maxHeight=heights[0];
        int index=0;
        for(int i=1;i<heights.length;i++){
            if(heights[i]>maxHeight){
                maxHeight=heights[i];
                index=i;
            }
        }
        return names[index];
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[]names={"Amar","Akbar","Anthony"};
        int[]ages=new int[3];
        double[]heights=new double[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter age of "+names[i]+": ");
            ages[i]=sc.nextInt();
            System.out.print("Enter height of "+names[i]+" in meters: ");
            heights[i]=sc.nextDouble();
        }
        System.out.println("Youngest friend is "+findYoungest(ages,names));
        System.out.println("Tallest friend is "+findTallest(heights,names));
    }
}

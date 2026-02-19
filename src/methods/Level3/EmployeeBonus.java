package src.methods.Level3;
import java.util.Scanner;
public class EmployeeBonus{
    public static int[][] generateEmployees(int n){
        int[][]arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=(int)(Math.random()*90000)+10000;
            arr[i][1]=(int)(Math.random()*10)+1;
        }
        return arr;
    }
    public static double[][] calculateBonus(int[][]arr){
        int n=arr.length;
        double[][]newArr=new double[n][2];
        for(int i=0;i<n;i++){
            double bonus=arr[i][1]>5?arr[i][0]*0.05:arr[i][0]*0.02;
            newArr[i][0]=arr[i][0]+bonus;
            newArr[i][1]=bonus;
        }
        return newArr;
    }
    public static void displayReport(int[][]oldArr,double[][]newArr){
        double sumOld=0,sumNew=0,sumBonus=0;
        System.out.println("Emp\tOldSalary\tYears\tBonus\tNewSalary");
        for(int i=0;i<oldArr.length;i++){
            sumOld+=oldArr[i][0];
            sumBonus+=newArr[i][1];
            sumNew+=newArr[i][0];
            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f\n",i+1,oldArr[i][0],oldArr[i][1],newArr[i][1],newArr[i][0]);
        }
        System.out.printf("Total\t%.2f\t\t\t%.2f\t%.2f\n",sumOld,sumBonus,sumNew);
    }
    public static void main(String[]args){
        int[][]employees=generateEmployees(10);
        double[][]bonusArr=calculateBonus(employees);
        displayReport(employees,bonusArr);
    }
}

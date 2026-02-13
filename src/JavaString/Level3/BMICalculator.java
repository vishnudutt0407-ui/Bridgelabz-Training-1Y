package JavaString.Level3;
import java.util.Scanner;
class BMICalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] hw=new double[10][2];
        for(int i=0;i<10;i++){
            System.out.println("Person "+(i+1)+" weight (kg):");
            hw[i][0]=sc.nextDouble();
            System.out.println("Person "+(i+1)+" height (cm):");
            hw[i][1]=sc.nextDouble();
        }
        String[][] result=computeBMI(hw);
        display(result);
    }
    static String[][] computeBMI(double[][] hw){
        String[][] r=new String[10][4];
        for(int i=0;i<10;i++){
            double h=hw[i][1]/100.0;
            double w=hw[i][0];
            double bmi=Math.round((w/(h*h))*100.0)/100.0;
            String status="";
            if(bmi<18.5) status="Underweight";
            else if(bmi<25) status="Normal";
            else if(bmi<30) status="Overweight";
            else status="Obese";
            r[i][0]=String.valueOf(hw[i][1]);
            r[i][1]=String.valueOf(hw[i][0]);
            r[i][2]=String.valueOf(bmi);
            r[i][3]=status;
        }
        return r;
    }
    static void display(String[][] r){
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for(int i=0;i<r.length;i++)
            System.out.println(r[i][0]+"\t\t"+r[i][1]+"\t\t"+r[i][2]+"\t"+r[i][3]);
    }
}

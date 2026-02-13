package JavaString.Level2;
import java.util.Scanner;
class GradeCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        int[][] marks=generateMarks(n);
        double[][] stats=calculateStats(marks);
        String[] grades=calculateGrades(stats);
        displayScorecard(marks,stats,grades);
    }
    static int[][] generateMarks(int n){
        int[][] m=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                m[i][j]=10+(int)(Math.random()*91);
        return m;
    }
    static double[][] calculateStats(int[][] m){
        double[][] s=new double[m.length][3];
        for(int i=0;i<m.length;i++){
            int total=0;for(int j=0;j<3;j++) total+=m[i][j];
            double avg=total/3.0;
            double per=Math.round((avg)*100.0)/100.0;
            s[i][0]=total;s[i][1]=Math.round(avg*100.0)/100.0;s[i][2]=per;
        }
        return s;
    }
    static String[] calculateGrades(double[][] s){
        String[] g=new String[s.length];
        for(int i=0;i<s.length;i++){
            double p=s[i][2];
            if(p>=90) g[i]="A+";
            else if(p>=80) g[i]="A";
            else if(p>=70) g[i]="B";
            else if(p>=60) g[i]="C";
            else if(p>=50) g[i]="D";
            else g[i]="F";
        }
        return g;
    }
    static void displayScorecard(int[][] m,double[][] s,String[] g){
        System.out.println("Physics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for(int i=0;i<m.length;i++)
            System.out.println(m[i][0]+"\t"+m[i][1]+"\t"+m[i][2]+"\t"+(int)s[i][0]+"\t"+s[i][1]+"\t"+s[i][2]+"\t\t"+g[i]);
    }
}

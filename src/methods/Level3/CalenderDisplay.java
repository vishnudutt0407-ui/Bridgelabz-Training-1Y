package src.methods.Level3;
import java.util.Scanner;
public class CalenderDisplay{
    public static String getMonthName(int month){
        String[]months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[month-1];
    }
    public static boolean isLeapYear(int year){
        return (year%4==0 && year%100!=0) || (year%400==0);
    }
    public static int getDaysInMonth(int month,int year){
        int[]days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2 && isLeapYear(year))return 29;
        return days[month-1];
    }
    public static int getFirstDay(int month,int year){
        int y=year;
        int m=month;
        if(m<3){m+=12;y--;}
        int k=y%100;
        int j=y/100;
        int f=1+13*(m+1)/5+k+k/4+j/4+5*j;
        return f%7;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month=sc.nextInt();
        System.out.print("Enter year: ");
        int year=sc.nextInt();
        String monthName=getMonthName(month);
        int days=getDaysInMonth(month,year);
        int firstDay=getFirstDay(month,year);
        System.out.println("   "+monthName+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<firstDay;i++)System.out.print("    ");
        for(int day=1,i=firstDay;day<=days;day++,i++){
            System.out.printf("%3d ",day);
            if(i%7==6)System.out.println();
        }
        System.out.println();
    }
}

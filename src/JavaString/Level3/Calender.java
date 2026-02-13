package JavaString.Level3;
import java.util.Scanner;
class Calendar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month (1-12):");
        int month=sc.nextInt();
        System.out.println("Enter year:");
        int year=sc.nextInt();
        String monthName=getMonthName(month);
        int days=getDays(month,year);
        int start=getStartDay(month,year);
        System.out.println("   "+monthName+" "+year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for(int i=0;i<start;i++) System.out.print("   ");
        for(int i=1;i<=days;i++){
            System.out.printf("%3d",i);
            if((i+start)%7==0) System.out.println();
        }
        System.out.println();
    }
    static String getMonthName(int m){
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[m-1];
    }
    static int getDays(int m,int y){
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && isLeapYear(y)) return 29;
        return days[m-1];
    }
    static boolean isLeapYear(int y){
        return (y%4==0 && y%100!=0) || (y%400==0);
    }
    static int getStartDay(int m,int y){
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        return (1+x+31*m0/12)%7;
    }
}

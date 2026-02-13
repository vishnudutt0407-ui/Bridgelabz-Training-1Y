package JavaString.Level1;
import java.util.Scanner;
class ArrayIndexDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=Integer.parseInt(sc.nextLine());
        String[] names=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter name "+(i+1)+":");
            names[i]=sc.nextLine();
        }
        System.out.println("Generating ArrayIndexOutOfBoundsException:");
        generateException(names);
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);
    }
    static void generateException(String[] arr){
        System.out.println(arr[arr.length]);
    }
    static void handleException(String[] arr){
        try{
            System.out.println(arr[arr.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid index access");
        }catch(Exception e){
            System.out.println("Caught RuntimeException: "+e.getMessage());
        }
    }
}

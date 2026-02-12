import java.util.Arrays;
public class arraysexample{
public static void main(String[] args){
int arr[]={10,20,30,40,50};
System.out.println(arr);
System.out.println(Arrays.toString(arr));
int index = Arrays.binarySearch(arr, 30);
System.out.println("Index of 30:  " + index);
int[] arr2={10,20,30,40,50};
boolean isEqual = Arrays.equals(arr, arr2);
System.out.println("Both arrays are equal: " + isEqual);
}
}
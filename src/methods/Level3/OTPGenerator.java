package src.methods.Level3;
import java.util.Scanner;
public class OTPGenerator{
    public static int generateOTP(){
        return (int)(Math.random()*900000)+100000;
    }
    public static boolean areUnique(int[]otps){
        for(int i=0;i<otps.length;i++){
            for(int j=i+1;j<otps.length;j++){
                if(otps[i]==otps[j])return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int[]otpArray=new int[10];
        for(int i=0;i<10;i++)otpArray[i]=generateOTP();
        for(int otp:otpArray)System.out.print(otp+" ");
        System.out.println();
        if(areUnique(otpArray))System.out.println("All OTPs are unique");
        else System.out.println("Some OTPs are repeated");
    }
}

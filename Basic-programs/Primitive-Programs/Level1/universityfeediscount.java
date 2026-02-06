public class universityfeediscount{
public static void main(String[] args){
double fee = 125000;
double discountPercentage = 10;
double discountAmount = (fee * discountPercentage )/100;
double finalFee = fee - discountAmount;
System.out.println("the discount amount is INR " + discountAmount + "and the final fees is " + finalFee);
}
}
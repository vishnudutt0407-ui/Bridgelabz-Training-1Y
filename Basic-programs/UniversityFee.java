public class UniversityFee{
public static void main(String[] args){
int fee=125000;
int discountPercent=10;
int discount=fee*discountPercent/100;
int discountedFee=fee-discount;
System.out.println("The discount amount in INR"+discount+
"The discounted fee in INR"+discountedFee);
}
}
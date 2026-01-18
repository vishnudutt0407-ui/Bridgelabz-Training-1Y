public class VolumeOfEarth{
public static void main(String[] args){
double radiusKm=6378;
double pi=3.14159;
double volumekm=(4.0/3.0)*pi*radiusKm*radiusKm*radiusKm;
double radiusMiles=radiusKm/1.6;
double volumeMiles=(4.0/3.0)*pi*radiusMiles*radiusMiles*radiusMiles;
System.out.println("volume of earth in cubic Km " +volumekm+
"volume of earth in cubic miles" +volumeMiles);
}
}
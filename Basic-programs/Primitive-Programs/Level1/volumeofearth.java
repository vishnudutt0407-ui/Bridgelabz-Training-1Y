public class volumeofearth{
public static void main(String[] args){
double radiusKM = 6378;
double pi = Math.PI;
double volumeKM = (4.0/3.0) * pi * radiusKM * radiusKM * radiusKM;
double radiusMiles = radiusKM * 0.621371;
double volumeMiles = (4.0/3.0) *pi * radiusMiles * radiusMiles * radiusMiles;
System.out.println("the volume of earth in cubic km is " + volumeKM );
System.out.println( " and the volume of earth in cubic miles is " + volumeMiles);
}
}
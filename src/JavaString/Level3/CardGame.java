package JavaString.Level3;
import java.util.Scanner;
class CardGame{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String[] suits={"Hearts","Diamonds","Clubs","Spades"},ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck=new String[52];int idx=0;
        for(String a:ranks) for(String b:suits) deck[idx++]=a+" of "+b;
        for(int i=0;i<deck.length;i++){int r=i+(int)(Math.random()*(deck.length-i));String t=deck[i];deck[i]=deck[r];deck[r]=t;}
        System.out.println("Players:");int p=s.nextInt();System.out.println("Cards each:");int n=s.nextInt();
        for(int i=0;i<p;i++){System.out.println("Player "+(i+1)+":");for(int j=0;j<n;j++) System.out.println(deck[i*n+j]);System.out.println();}
    }}

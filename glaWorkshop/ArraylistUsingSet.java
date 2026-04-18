package com.glaWorkshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArraylistUsingSet {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(8);
        al.add(4);
        al.add(6);
        al.add(8);
        al.add(5);
        al.add(4);
        System.out.println("origunal array" +al);
        Set<Integer> set =new HashSet<>(al);
        ArrayList<Integer> newlist = new ArrayList<>(set);
        System.out.println("dupplicate elements" +newlist );


    }
}

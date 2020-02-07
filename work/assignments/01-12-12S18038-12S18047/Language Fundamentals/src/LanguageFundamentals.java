/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  12S18038 - Naomi Simatupang
 * @author  12S18047 - Ulion Pardede
 */

import java.util.ArrayList;

public class LanguageFundamentals {
    /*program empty point */
    public static void main(String[] _args) {
        System.out.println("hello,world!");
        int gear = 1;
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        
        System.out.println(gear + "," +  "," + capitalC + "," + b);
        
        gear++;
        result = !result;
        capitalC += 4;
        
        System.out.println(gear + "," +  "," + capitalC + "," + b);
        
        //26 in hexadecimal and binary//
        int hexVal = 0x1a;
        int binVal = 0b11010;
        
        System.out.println(hexVal + "," + binVal);
        
        
        //intantiating and manipulating objects
        String name = "Wiro Sableng";
        short gearobject = 1;
        boolean resultobj = true;
        
        System.out.println(name + "," + gearobject + "," + resultobj);
       
        name = name.toUpperCase();
        gearobject++;
        resultobj = (result == false) || !resultobj;
        //array, collections, and loop
    /* kode 5 sebelum di modifikasi  
         int [][] numbers = new int [10][10];
        
        for (int i = 0; i < numbers.length; ++i) {
           for (int j = 0; j < numbers[1].length; ++j) {
               numbers[i][j] = i + j;
           } 
        }
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0 ; j < numbers[i].length; ++j) {
                System.out.print(numbers [i][j] + "");
            }
        }
      */  
  ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
  int jlh_angka = 10;
  for(int x = 0; x < jlh_angka; ++x ){
    numbers.add(new ArrayList<Integer>());
    for(int y = 0; y < jlh_angka ; ++y){
        numbers.get(x).add(x+y);
        }    
    }
   for(int x = 0; x < jlh_angka; ++x ){
    for(int y = 0; y < jlh_angka ; ++y){
      System.out.print(numbers.get(x).get(y) + " ");
    }
            System.out.println();
        }
    }
}
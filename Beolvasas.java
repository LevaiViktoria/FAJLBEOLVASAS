/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beolvasas;

import java.io.File;
import java.io.*;

public class Beolvasas {

     String vNEv;
    String kNev;
    public static void main(String[] args) {
        RandomAccessFile raf;
       
        
        try
        {
            raf = new RandomAccessFile("C://2020 SULI//Java//Fajlbeolvasas//tanulok.txt","r");
        sor = raf.readLine();
            System.out.println(sor);
            int db = 19;
                for (int i=0; i<db; i++) {
                    raf.readLine();
                    if(i==3){
                        System.out.println(raf.readLine());
                    }        
                }
          
        
           String sor;
           int db= Integer.parseInt(raf.readLine());
       
              for (int i = 0; i <db; i++) {
                  sor=raf.readLine();
                  Beolvasas asd=new Beolvasas();
                  System.out.println(asd.neve(sor));
              } 
           
            
          String[] nevek = null; 
          int db = 0;
          for(sor = raf.readLine(); sor != null; sor = raf.readLine())
          {
          db++;
          }
          nevek = new String[db];
          raf.seek(0);
          db = 0;
    
          for( sor = raf.readLine(); sor != null; sor = raf.readLine() )
          {  
          nevek[db] = sor;
            db++;
           
          }
          for (int i = 0; i < db; i++) {
               System.out.println(nevek[i]);
          }
          raf.close();  
          System.out.println("Fájl beolvasva!");
        }
        catch( IOException e )
        {
            System.out.println("HIBA");
        }     
    }
     public String neve(String row){
                String [] mezo=row.split(" ");
                this.vNEv=mezo[0];
                this.kNev=mezo[1];
                String neve="Vezetéknév: "+vNEv+" Keresztnév: "+kNev;  
                return neve;
          }
    //Szerkezet
    
    public class Adatok{
        int hour;
        int min;
        int sec;
        int sec2;
        char kar;
       
        public Adatok(){

          this.hour=Integer.parseInt(mezo[0]);
            this.min=Integer.parseInt(mezo[1]);
            this.sec=Integer.parseInt(mezo[2]);
            this.sec2=Integer.parseInt(mezo[3]);
            this.kar=mezo[4].charAt(0);
}
     

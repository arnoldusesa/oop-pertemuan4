/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1dimensi;

import java.util.Scanner;

/**
 *
 * @author Naldyesa
 */
public class Array1dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String [] NMA = new String [5];
       
       NMA[0]="Naldy";
       NMA[1]="Aldy";
       NMA[2]="Ady";
       NMA[3]="Eli";
       NMA[4]="Aldo";
       
       Scanner inp = new Scanner(System.in);
       System.out.println("~~~~Input Data ke Array~~~~");
       for(int id=0; id<5; id++ ){
          System.out.printf("Data Nama Pengunjung ke-%d: ", id+1);
           NMA[id] = inp.nextLine();
       }
       System.out.println("~~~~Output Data ke Array~~~~");
        for(int id=0; id<5; id++ ){
          System.out.println("Data Nama Pengunjung ke-"+ (+id+1)+": "+NMA[id]);     
       }
        
              System.out.println("~~~~Output2 Data ke Array~~~~");
              int no=1;
              for(String isi : NMA){
                  System.out.println(no+". "+isi);
                  no++;
              
              }
    }
    
}

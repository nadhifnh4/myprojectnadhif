package IniPaket;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int[]kali = new int[100]; 
        printArray(kali);   
     }
     
      public static void printArray(int[] data){
        Scanner sc = new Scanner(System.in);
        int m=0;             //data maksimum dalam array jika input -1
        for(int i=0;i <data.length;i++){
            System.out.print("Masukkan data ke-"+(i+1)+"->   ");
            data[i]=sc.nextInt();
            if (data[i]<0){
                m=i;
                break;
            }
          }
        int min=data[0];
        int max=data[0];
        System.out.println("    ");
        for(int i=0;i<m;i++){
            if(data[i]>max){
                max=data[i];
            }
            else if(data[i]<min){
                min=data[i];
            }
        }
        System.out.println("Nilai max pada array = "+ min);
        System.out.println("Nilai min pada array = "+ max);
     }
}

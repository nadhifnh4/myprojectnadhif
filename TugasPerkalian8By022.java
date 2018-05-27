/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestInput;

/**
 *
 * @author acer
 */
public class TugasPerkalian8By022 {
    public static void main (String[]args){
        int[]time=new int [10];
        
        //metode for
        System.out.println("dengan for");//metode for
        System.out.println("  ");
        for (int i=0;i<10;i++){
            time[i]=8*(i+1);
            System.out.println("8 x " + (i+1) + " = " + time[i]);
        }
        System.out.println("  ");
        System.out.println("dengan while");//metode while
        int a=0;
        while(a<10){
            time[a]=8*(a+1);
            System.out.println("8 x " + (a+1) + " = " + time[a]);
            a++;
        }
         System.out.println("  ");
        System.out.println("dengan do-while"); //metode do-while
        int b=0;
        do {
            time[b]=8*(b+1);
            System.out.println("8 x " + (b+1) + " = " + time[b]);
            b++;
        }while(b<10);
    }
}

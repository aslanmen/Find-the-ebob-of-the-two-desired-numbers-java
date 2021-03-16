/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.the.ebob.of.the.two.desired.numbers;

import java.util.Scanner;

/**
 *
 * @author aasla
 */
public class FindTheEbobOfTheTwoDesiredNumbers {

    public static int ebobbulma(int sayı1,int sayı2){
    int ebob=1;
        for (int i = 1; i <=sayı1 && i<=sayı2; i++) {
            if (sayı1%i==0 && sayı2%i==0) {
                ebob=i;
            }
        }
    return ebob;
    
    }
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("Birinci sayı :");
        int sayıbir=input.nextInt();
        System.out.println("İkinci sayı :");
        int sayıiki=input.nextInt();
        System.out.println("İki sayının ebobu : "+ebobbulma(sayıbir,sayıiki));
    }
    
}

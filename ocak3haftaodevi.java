package Intro.JAVAODEVLER;

import java.util.Scanner;

public class ocak3haftaodevi {
    /*1️-)Koşullu ifadeler (if-else) ne işe yarar? Gerçek hayattan bir örnek verin.
    if else kontrol sağlar. Örneğin bir yere gireceğiz ve kapının açık veya kapalı olduğunu
    kontrol etmemiz gerekir. Eğer kapı açık ise içeri girebiliriz. Kapı kapalı ise içeri giremeyiz.
2️-)Girilen bir sayının tek mi çift mi olduğunu bulan bir Java programı yazın.
3️-)Bir sayının pozitif, negatif veya sıfır olup olmadığını belirleyen bir program yazın.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        // ODD OR EVEN
        if(num % 2 == 0 ){
            System.out.println("Number is even.");
        }else System.out.println("Number is odd.");
        // POSITIVE ,NEGATIVE OR ZERO
        if(num>0){
            System.out.println("Number is positive");
        } else if (num<0) {
            System.out.println("Number is negative");
        }else System.out.println("Number is 0");
    }
}

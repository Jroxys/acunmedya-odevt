package Intro.JAVAODEVLER;

import java.util.Scanner;

public class ocak4haftaodevi {
    /*1️-)Döngüler (for, while) ne işe yarar? Kullanım alanlarını açıklayın.
    belirli bir koşul sağlandığı sürece kodun tekrar çalışmasını sağlar.
2️-)1’den 10’a kadar olan sayıları ekrana yazdıran bir for döngüsü yazın.
3️-)Kullanıcıdan alınan bir sayıya kadar olan sayıların toplamını hesaplayan bir program yazın.
*/
    public static void main(String[] args) {
        //1 TO 10
        for (int i = 1 ; i<=10 ; i++){
            System.out.println(i);
        }
        //ADDING NUMBERS
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int total = 0;
        for(int i = 0 ; i<num ; i++){
            total += i;

        }
        System.out.println("Total is : " + total);
    }
}

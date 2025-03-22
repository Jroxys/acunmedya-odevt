package Intro.JAVAODEVLER;

import java.util.Scanner;

public class subat1haftaodevi {
    /*1️-)Dizi (Array) nedir? Java’da nasıl tanımlanır?
    Dizi bir veri tipindeki bir veyabirden fazla elemanı aynı değişken
    üstünde saklayan veri yapısıdır.
    Javada dizi
    değişken türü[] diziAdı = new değişkentürü[n] şeklinde tanımlanır
2️-)5 elemanlı bir int dizisi oluşturup, kullanıcıdan aldığı değerlerle diziyi dolduran ve ekrana yazdıran bir program yazın.
3️-)Bir dizinin içindeki en büyük sayıyı bulan bir Java programı yazın.
*/
    public static void main(String[] args) {
        //5 element array
        int[] dizi = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers one by one: ");
        for(int i = 0 ; i< dizi.length ; i++){
            dizi[i] = scanner.nextInt();
        }
        for (int j : dizi) {
            System.out.println(j);
        }
        //MAX Number
        int[] maxDizi ={50,40,26,30,80};
        int max = 0;
        for (int i = 0 ; i<maxDizi.length ; i++){
            if(max<dizi[i]){
                max = dizi[i];
            }
        }
        System.out.println(max);
    }
}

package Intro.JAVAODEVLER;

import java.util.Scanner;

public class ocak2haftaodevi {
    /*1️-)Java'da kullanılan temel veri tiplerini ve boyutlarını listeleyin:
  byte → 1 byte
short → 2 byte
int → 4 byte
long → 8 byte
float → 4 byte
double → 8 byte
char → 2 byte
boolean → 1 bit (Genellikle 1 byte olarak saklanır)
String → İçeriğe bağlı, dinamik boyutlu
    2️-)Aşağıdaki kodun çıktısını tahmin edin ve açıklayın:
        int a = 10;
        double b = 3.5;
        System.out.println(a + b); Kodun çıktısı 13 olur. Çünkü kod bir üst basamağa kendini convert edemez.
        Bunu bizim belirtmemiz lazımdı.
3-) Kullanıcıdan iki sayı alıp toplamını ekrana yazdıran bir program yazın.

*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers to add: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("TOTAL: " + a+b);


    }
}

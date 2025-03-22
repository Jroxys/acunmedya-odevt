package Intro.JAVAODEVLER;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ocak1haftaodevi {
    //Java nedir nerelerde kullanılır ?
    /*Java nesne yönelimli yüksek seviyeli bir programlama dilidir. Web geliştirme ,
    Mobil uygulamalar ,
     kurumsal uygulamalar
     , oyunlar*/

    /*JDK JRE JVM NEDİR?
    JDK Java uygulamalarını geliştirmek için gerekli araç setidir.
    JRE Java programlarını çalıştırmak için gerekli olan bileşenleri içerir.
    JVM Java kodunu işletim sisteminin anlayacağı makine koduna çeviren sanal makinedir.
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Your Name: " + name );
    }
}

package _1_SMS_y;

import java.util.Scanner;

/*
Wczytaj treść SMS-a z konsoli w programie (System.in)
i tam też wyświetl rezultat.
Przykład:
wejście: Dzisiaj jest sobota, imieniny kota.
wyjście: DzisiajJestSobota,ImieninyKota.
 */
public class SMS_y_1 {

    public static void main(String[] args) {
        String inSMS; // SMS źródłowy
        String outSMS; // SMS wyjściowy, z usuniętymi znakami
        Scanner read = new Scanner(System.in);
        System.out.print("Treść SMS-a do wysłania: ");
        inSMS = read.nextLine();
        outSMS = "";

        // usunięcie końcowej kropki
        if (inSMS.charAt(inSMS.length()-1)=='.') {
            inSMS=inSMS.substring(0,inSMS.length()-1);
        }

        // podziel długie zdanie SMSa na słowa; słowa zapisane są do tablicy
        String[] slowa = inSMS.split(" ");
        for (String slowo:
             slowa) {
            // jeżeli kolejne spacje, to słowa są puste - stąd continue dla pętli for
            if (slowo.isEmpty()) {
                continue;
            }
            slowo=slowo.substring(0,1).toUpperCase()+slowo.substring(1);
            outSMS+=slowo;
        } //foreach

        System.out.println("\nSkonwertowany SMS do wysłania: "+outSMS);


    } //main
}

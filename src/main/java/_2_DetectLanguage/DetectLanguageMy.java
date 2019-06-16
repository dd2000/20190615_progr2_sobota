package _2_DetectLanguage;
import com.detectlanguage.DetectLanguage;
import com.detectlanguage.Result;
import com.detectlanguage.errors.APIError;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class DetectLanguageMy {
    public static void main(String[] args) throws APIError, FileNotFoundException {

        // osobisty klucz z detectLanguage.com    8aa93822813fb732e6f8fdb332cb192b
        // DetectLanguage.apiKey = "YOURAPIKEY";
        DetectLanguage.apiKey = "8aa93822813fb732e6f8fdb332cb192b";


        // ścieżka do pliku txt, który ma być rozpoznany
        String pathSourcePath = "C:\\JAVA_SDA\\_20190615_sobota_programowanie2\\src\\main\\java\\_2_DetectLanguage\\artykuly\\";
        File folder = new File(pathSourcePath);
        String[] pliki = folder.list();
        for (String plik: pliki){
            System.out.println("\n--------------------------");
            System.out.println(plik+"\n");
            Scanner scanner = new Scanner(pathSourcePath);
            String text=scanner.nextLine();
            List<Result> results = DetectLanguage.detect(text);

            Result result = results.get(0);

            System.out.println("Language: " + result.language);
            System.out.println("Is reliable: " + result.isReliable);
            System.out.println("Confidence: " + result.confidence);
        }; //for
    }
}


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin : ");
        String metin = scanner.nextLine();

        try {
            FileWriter newFile = new FileWriter("src/test.txt",false);
            // Önceden eklenen yazıları .txt dosyasından kaldırmak için   // false
            PrintWriter printWriter = new PrintWriter(newFile);
            printWriter.print(metin);
            printWriter.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader("src/test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String okunanMetin = bufferedReader.readLine();
           while (okunanMetin != null){
               System.out.println(okunanMetin);
               okunanMetin = bufferedReader.readLine();

           }
           fileReader.close();
            bufferedReader.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
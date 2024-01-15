import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            String numbers = bufferedReader.readLine();
            int numberInt = 0;
            while (numbers != null){
                int newNums = Integer.parseInt(numbers);
                numbers = bufferedReader.readLine();
                numberInt += newNums;
            }
            System.out.println(numberInt);
            file.close();
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
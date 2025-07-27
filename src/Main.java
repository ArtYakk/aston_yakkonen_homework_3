import exceptions.MyReadException;
import exceptions.MyWriteException;

import java.io.*;


public class Main {
    public static void main(String[] args) throws MyWriteException, MyReadException {
        try {
            runApp();
        }catch (MyWriteException e){
            System.out.println("Ошибка записи: " + e);
        }catch (MyReadException e){
            System.out.println("Ошибка чтения: " + e);
        }
    }

    private static void runApp() throws MyWriteException, MyReadException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt", false))){
            writer.write("My name is Artem!\n");
            writer.write("Another hello!");
        } catch (IOException e) {
            throw new MyWriteException(e);
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new MyReadException(e);
        }
    }
}

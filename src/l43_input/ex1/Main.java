package l43_input.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Scanner;

import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        String fileName = "resources/MyFile.txt";
        System.out.println("Welcome to the File writer!");

        try (FileWriter fw = new FileWriter(fileName)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello Everybody!\n");
            bw.newLine();
            bw.write("My name is Sergej. \n and I come from Germany");
            bw.flush();
        } catch (IOException e) {
            System.err.print("Writing a File failed! ");
        }

        System.out.println("File has been written\n");

        System.out.println("Try to read the File using Buffered reader:");

        try (FileReader fr = new FileReader(fileName)) {
            BufferedReader br = new BufferedReader(fr);
            do {
                String line = br.readLine();
                if (line.isEmpty()) {
                    break;
                }
                System.out.println(line);
            } while (true);
        } catch (IOException e) {
            System.out.println("Reading a file failed");
        }
    }
}

class ReadingFile {
    public static void main(String[] args) {

        String fileName = "resources/MyFile.txt";
        System.out.println(" Reading a File with Scanner");

        try (
                FileInputStream fis = new FileInputStream(fileName)
        ) {
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext()) {
                // reading line by line
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.print("Reading a file failed");
        }
//-----------------------------------------------------------------------
        System.out.println("\n\nTry to read the File using Buffered reader:");

        try (FileReader fr = new FileReader(fileName)) {
            BufferedReader br = new BufferedReader(fr);
            do {
                String line = br.readLine();
                if (line.isEmpty()) {
                    break;
                }
                System.out.println(line);
            } while (true);
        } catch (IOException e) {
            System.out.println("Reading a file failed");
        }

//-----------------------------------------------------------------------
        System.out.println("\n\nTry to read the File using File reader:");

        try (FileReader fr = new FileReader(fileName)) {

            do {
                int i = fr.read();  //reading a file char by char
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);
            } while (true);
        } catch (IOException e) {
            System.out.println("Reading a file failed");
        }
//--------------------------------------------------------------------
        System.out.println("\n\nReading a file with file input Stream");

        try (
                FileInputStream fis = new FileInputStream(fileName)
        ) {
            do {
                int i = fis.read(); //reading a line char by char
                if (i == -1) // break, if we finish reading a file, no more chars
                    break;

                System.out.print((char) i);
            } while (true);
        } catch (IOException e) {
            System.out.print("Reading a file failed");
        }

    }
}

class WritingFile {
    public static void main(String[] args) {

        String fileName = "resources/MyFile.txt";


        System.out.println("Welcome to the File writer with Buffered writer!");

        try (FileWriter fw = new FileWriter(fileName) ) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello Everybody!\n");
            bw.newLine();
            bw.write("My name is Sergej. \n and I come from Germany");
            bw.flush();
        } catch (IOException e) {
            System.err.print("Writing a File failed! ");
        }
//--------------------------------------------------------------------------------------
        System.out.println("Welcome to the File writer with File writer!");

        try (FileWriter fr = new FileWriter(fileName)) {
            String text = "Hello Everybody!\nMy name is Sergej. \n and I come from Germany";
            byte[] textBytes = text.getBytes();

            char[] textChar = new char[textBytes.length]; // creating Char array
            for (int i = 0; i < textBytes.length; i++) {
                textChar[i] = (char) textBytes[i];
            }
            fr.write(textChar);
        } catch (IOException e) {
            System.out.print("Writing a File failed! ");
        }
//--------------------------------------------------------------------------------------
        System.out.println("Welcome to the File writer with File Output Stream writer!");

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            String text = "Hello Everybody!\nMy name is Sergej. \n and I come from Germany";
            byte[] textBytes = text.getBytes();
            fos.write(textBytes);
        } catch (IOException e) {
            System.out.print("Writing a File failed! ");
        }
    }
}


//
//      Минимум:
//        - записать в файл “Hello world, I’m тут ваше имя” (если его нет, он будет создан)
//        - прочитать этот файл и вывести его содержимое
//-     Максимум:
//        - напишите чтение файла используя Scanner, BufferedReader, FileReader, FileInputStream
//        - напишите чтение файла используя BufferedWriter, FileWriter, FileOutputStream
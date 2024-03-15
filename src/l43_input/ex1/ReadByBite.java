package l43_input.ex1;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadByBite {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("resources/example2.txt"))
        {
            int i;
            do {
                //чтемие по одному байту

                i = fis.read();
                if (i == -1) {
                    break;
                }
                System.out.print( (char) i );


            }while (true);

        } catch (IOException e) {
            System.out.println("Ошибка");
        }


    }
}

package l43_input.ex1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// BufferedWriter используется для буферизированной записи
// текста в файл. Метод write() используется для записи
// текста, а newLine() для добавления новой строки.
public class WriteByWriter {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("resources/example2.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("добавляю в Файл!"); // Записываем строку в файл
            bw.newLine(); // Добавляем новую строку
            bw.write("записываю!");
            bw.flush();
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }

        try (FileReader fr = new FileReader("resources/example2.txt")) {
            BufferedReader br = new BufferedReader(fr);

            do {
                // Чтение построчно
                String line = br.readLine();
                if (line == null) // когда кончились данные
                    break;
                // Вывод прочитанных данных на экран
                System.out.print(line);
            } while (true);
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }


    }
}

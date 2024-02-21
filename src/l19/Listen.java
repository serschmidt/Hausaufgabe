package l19;

import java.lang.reflect.Array.*;
import java.lang.reflect.Array;
import java.util.Arrays;

class MyArrayList {

    public static int INITIAL_SIZE = 10;

    private int[] data;

    private int count = 0;

    public void IntArrayList() {
        //создание массива
        this.data = new int[INITIAL_SIZE];
    }

    private void resize() {
        //data = Arrays.copyOf(data, data.length = data.length * 2);
    }

    private int[] removeByIndex(int arg) {
        for (int i = arg + 1; i < count; i++) {
            int removed = data[arg];
            data[i-1] = data[i];
        }
        data[count - 1] = 0;
        return data;
    }

    public void Add(int value) {
        if (count >= data.length) {

            data = Arrays.copyOf(data, (int) (data.length * 1.5));

            data[count] = value;
            count = count + 1;

        }

    }

}


public class Listen {
    public static void main(String[] args) {


        int[] list = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            list[i] = i;
        }
        //System.out.println(Array.toString(list));

    }
}

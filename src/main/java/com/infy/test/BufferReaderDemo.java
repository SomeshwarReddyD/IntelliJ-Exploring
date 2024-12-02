package com.infy.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BufferReaderDemo {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dasarisomeshwar.r\\Downloads\\Test.txt"));
        try (reader) {
//            int arr[] = {1, 2, 3, 4, 5, 67, 86};
//            int[] array = Arrays.stream(arr).filter(t -> t % 2 == 0).toArray();
//            System.out.println(array);

            ArrayList<String> lines = new ArrayList<>();
            String temp = null;
            List<String> list = reader.lines().filter(BufferReaderDemo::isValid).toList();
            while ((temp = reader.readLine()) != null) {
                if (!temp.isEmpty()) {
                    lines.add(temp);
                }
            }
            System.out.println(lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isValid(String line) {
        return line.startsWith("This");
    }
}

package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class FileAccess {
    public static void writeToFile(String path, String text, boolean append) {
        try {
            FileWriter writer = new FileWriter(path, append);
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String path) {
        String str = null;
        try {
            Scanner scanner = new Scanner(new File(path));
            scanner.useDelimiter("\\Z");
            str = scanner.next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static String readConsoleLine() {
        try {
            return new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String path = "C:\\Projects\\Mirea\\Java\\JavaFirstMirea\\src\\ru\\mirea\\task15\\text.txt";
        String text = readConsoleLine();
        writeToFile(path, text, true);

        String str = readFile(path);
        System.out.println(str);
    }
}

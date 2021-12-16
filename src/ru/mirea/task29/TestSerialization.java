package ru.mirea.task29;

import java.io.*;

public class TestSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CurrencyInfo currencyInfo = new CurrencyInfo();
        serialize(currencyInfo);

        CurrencyInfo deserialized = (CurrencyInfo) deserialize();
        System.out.println(deserialized.currencies.get("Euro"));
    }

    private static void serialize(Serializable object) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("C:/Projects/Mirea/Java/JavaFirstMirea/src/ru/mirea/task29/data.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(object);

        objectOutputStream.close();
    }

    private static Serializable deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:/Projects/Mirea/Java/JavaFirstMirea/src/ru/mirea/task29/data.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        return (Serializable) objectInputStream.readObject();
    }
}

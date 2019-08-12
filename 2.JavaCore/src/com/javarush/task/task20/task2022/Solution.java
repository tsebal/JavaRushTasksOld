package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {
        Solution solution1 = new Solution("C:\\1.txt");
        solution1.writeObject("Hi1");
        solution1.close();
        //SAVE
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\2.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(solution1);
        outputStream.flush();
        outputStream.close();
        //LOAD
        FileInputStream fileInputStream = new FileInputStream("C:\\2.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Solution solution2 = (Solution) inputStream.readObject();
        inputStream.close();
        solution2.writeObject("Hi2");
        solution2.writeObject("Hi3");
        solution2.close();
    }
}

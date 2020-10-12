package ru.sapteh;

import javax.imageio.IIOException;
import java.io.*;
import java.net.InterfaceAddress;

public class Program {
    public static void main(String[] args) {
        Dogs dogs = new Dogs("Koko", 5, 10, "haski");

        try {
            FileOutputStream fos = new FileOutputStream("Dogs.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dogs);
        } catch (IOException e){
            e.getStackTrace();
        }
    }
}

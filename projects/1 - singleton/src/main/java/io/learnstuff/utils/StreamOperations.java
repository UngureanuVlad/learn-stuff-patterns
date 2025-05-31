package io.learnstuff.utils;

import io.learnstuff.implementation.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StreamOperations {

    public static void writeObject(Singleton Singleton) {
        try {
            FileOutputStream fileOut = new FileOutputStream("store.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(Singleton);
            out.close();
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton readObject() {
        Singleton singleton = null;
        try {
            FileInputStream fileIn = new FileInputStream("store.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            singleton = (Singleton) in.readObject();
            in.close();
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return singleton;
    }
}

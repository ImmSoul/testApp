package com.testApp;

import java.io.*;

public class LoadFile {
    private String path;
    private Object obj;

    public LoadFile(String path) {
        this.path = path;
    }

    public Object load() {
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            obj = objectInputStream.readObject();
            objectInputStream.close();
            System.out.println("Загрузка успешно произведена");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

}

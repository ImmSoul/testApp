package com.testApp;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCleaner {
    private String path;

    public FileCleaner(String path) {
        this.path = path;
    }

    public void clear() throws IOException {
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file); FileReader reader = new FileReader(file)) {
            while (reader.ready()) {
                reader.read();
                writer.write("");
            }
            System.out.println("Удаление успешно произведено!!");
        }

    }

}

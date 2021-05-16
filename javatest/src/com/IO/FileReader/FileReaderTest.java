package com.IO.FileReader;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {
    @Test
    public void fileReaderTest() throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //1.
            File fi = new File("javatest/src/com/IO/FileReader/testDataSet.txt");
            File fo = new File("javatest/src/com/IO/FileReader/copy.txt");
            //2.
            fileReader = new FileReader(fi);
//        FileReader freader = new FileReader();
            fileWriter = new FileWriter(fo);

            // 3. 复制
            int len;
            char[] temp = new char[5];
            while ((len = fileReader.read(temp)) != -1) {
                fileWriter.write(temp, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

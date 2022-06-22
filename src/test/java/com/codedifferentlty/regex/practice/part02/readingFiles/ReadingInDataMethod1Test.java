package com.codedifferentlty.regex.practice.part02.readingFiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ReadingInDataMethod1Test {
    @Test
    @DisplayName("Read data Test")
    public void readDataInTest() throws IOException {
        String pathToFile = "./files/Sample1.txt";
        String actual = ReadingInDataMethod01.readDataIn(pathToFile);
        String expected = "Code Differently\n" +
                "Our Students always forget to write their unit test.";
        Assertions.assertEquals(expected, actual);

    }
    @Test
    @DisplayName("Read data failmTest")
    public void readDataInFailTest() throws IOException {
        Assertions.assertThrows(IOException.class,()-> {
            String pathToFile = "./files/Sample5.txt";
            String actual = ReadingInDataMethod01.readDataIn(pathToFile);

        });


    }

    @Test
    @DisplayName("Read and replace test")
    public void readDataInAndReplaceTest() throws IOException {
        String pathToFile = "./files/Sample1.txt";
        String regex = "\\balways";
        String replace = "never";
        String actual = ReadingInDataMethod01.readDataInAndReplace(pathToFile, regex, replace);
        String expected = "Code Differently\n" +
                "Our Students never forget to write their unit test.";
        Assertions.assertEquals(expected, actual);


    }

}

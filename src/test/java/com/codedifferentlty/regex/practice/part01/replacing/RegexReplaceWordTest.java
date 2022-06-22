package com.codedifferentlty.regex.practice.part01.replacing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegexReplaceWordTest {
    @Test
    @DisplayName("Replace Regex test")
    public void replaceFirstPreFixTest() {
        String regex = "\\byes";
        String input = "yessir no no yes yes ";
        String replace = "no";
        String expected = "nosir no no yes yes ";
        String actual = RegexReplaceWord.replaceFirst(regex,replace,input);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Replace Regex test")
    public void replaceFirstSuffixTest() {
        String regex = "yes\\b";
        String input = "tyes no no yes yes ";
        String replace = "no";
        String expected = "tno no no yes yes ";
        String actual = RegexReplaceWord.replaceFirst(regex,replace,input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Replace regex test")
    public void replaceAllPreFixTest() {
        String regex = "\\byes";
        String input = "yessir no no yessir yessir ";
        String replace = "no";
        String expected = "nosir no no nosir nosir ";
        String actual = RegexReplaceWord.replaceAll(regex,replace,input);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Replace regex test")
    public void replaceAllSuffuxTest() {
        String regex = "yes\\b";
        String input = "siryes no no siryes siryes ";
        String replace = "no";
        String expected = "sirno no no sirno sirno ";
        String actual = RegexReplaceWord.replaceAll(regex,replace,input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Replace nth word test")
    public void replaceNthWordTest() {
        String regex = "\\byes";
        String input = " yes yes no yes" ;
        String replace = "no";
        String expected ="yes yes no no";
        String actual = RegexReplaceWord.replaceNthWord(regex,replace,input,3);
        Assertions.assertEquals(expected,actual);

    }

}

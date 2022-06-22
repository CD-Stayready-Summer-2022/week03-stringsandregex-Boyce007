package com.codedifferentlty.regex.practice.part01.countingword;

import com.codedifferentlty.regex.practice.part01.countingwords.RegexWordCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegexWordCounterTest {

    @Test
    @DisplayName("Regex Word Counter test ")
    public void regexCounterTest01() {
        String REGEX = "\\bdog\\b";
        String input = "dog doggo dog doggie";
        Integer expected = 2;
        Integer actual = RegexWordCounter.countWordOccurrences(REGEX, input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Regex word counter Test")
    public void regexCounterTest02() {
        String REGEX = "\\b dog|cat\\b";
        String input = "cat dog dog cattle";
        Integer expected = 3;
        Integer actual = RegexWordCounter.countWordOccurrences(REGEX, input);
        Assertions.assertEquals(expected, actual);
    }

}

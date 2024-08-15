package org.example.javatest.util;

import org.junit.Test;

import static org.example.javatest.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals(WEAK,PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK,PasswordUtil.assessPassword("abcde"));
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUM,PasswordUtil.assessPassword("abcde1234"));
    }

    @Test
    public void strong_when_has_letters_and_numbers_and_symbols(){
        assertEquals(STRONG,PasswordUtil.assessPassword("abcde1234!"));
    }

}
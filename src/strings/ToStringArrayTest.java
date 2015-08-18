package strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ангелин on 18.08.2015.
 */
public class ToStringArrayTest {

    @Test
    public void testGetArrayOfWords() throws Exception {
        ToStringArray test = new ToStringArray();
        String str = "Andrey Sveta Vova";
        String[] s = {"Andrey", "Sveta", "Vova"};
        assertEquals("Должны прийти слова", s, test.getArrayOfWords(str));
        
    }
}
package strings;

import java.util.Scanner;

/**
 * Created by Ангелин on 17.08.2015.
 * Дана строка, содержащая английский текст. Найти количество слов, начинающихся с буквы b.
 */
public class Task199 {
    public int getWordsWithB(String str){
        int res = 0;
        String[] ar = new ToStringArray().getArrayOfWords(str);
        for (String s : ar){
            if (s.charAt(0) == 'b'){
                res++;
            }
        }
        return res;
    }
}

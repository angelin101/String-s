package strings;

/**
 * Created by Ангелин on 18.08.2015.
 * Дана строка символов, среди которых есть двоеточие (:). Определить, сколько символов ему предшествует.
 */
public class Task203 {
    public int getNumberSymbol(String str){
        int res = 0;
        String[] ar = new ToStringArray().getArrayOfWords(str);
        for (String s : ar){
            if (s.indexOf(':') != -1){
                res = s.indexOf(':');
            }
        }
        return res;
    }
}

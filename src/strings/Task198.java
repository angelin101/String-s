package strings;

/**
 * Created by Ангелин on 17.08.2015.
 * Дана строка, заканчивающаяся точкой. Подсчитать, сколько в ней слов.
 */
public class Task198 {
    public int getNumberOfWords(String str){
        String[] ar = new ToStringArray().getArrayOfWords(str);
        return ar.length;
    }
}

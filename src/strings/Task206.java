package strings;

/**
 * Created by Ангелин on 18.08.2015.
 * Дана строка. Определить, сколько раз входит в нее группа букв  abc.
 */

public class Task206 {
    public int getABC(String str){
        int res = 0;
        String ar[] = new ToStringArray().getArrayOfWords(str);
        for (String s : ar){
            if (s.indexOf("abc") != -1){
                res++;
            }
        }
        return res;
    }
}

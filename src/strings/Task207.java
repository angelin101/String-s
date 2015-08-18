package strings;

/**
 * Created by Ангелин on 18.08.2015.
 * Дана строка. Подсчитать количество букв k в последнем ее слове.
 */
public class Task207 {
    public int getK(String str){
        int res = 0;
        String ar[] = new ToStringArray().getArrayOfWords(str);
        String lastWord = ar[ar.length-1];
        for (int i = 0; i < lastWord.length(); i++){
            if (lastWord.charAt(i) == 'k'){
                res++;
            }
        }
        return res;
    }
}

package strings;

/**
 * Created by Ангелин on 17.08.2015.
 * Дана строка, содержащая текст. Найти длины самого короткого и самого длинного слов.
 */
public class Task202 {
    private String[] arrey;
    public void lengthWords(String str) {
        ToStringArray toStringArray = new ToStringArray();
        arrey = (toStringArray.getArrayOfWords(str));
        int min = arrey[0].length();
        String strMin = arrey[0];
        int max = arrey[arrey.length-1].length();
        String strMax = arrey[arrey.length-1];
        for (String s : arrey){
            if (min > s.length()) {
                min = s.length();
                strMin = s;
            }
            if (max < s.length()) {
                max = s.length();
                strMax = s;
            }
        }
        System.out.println("\'"+strMin+"\'"+" самое короткое слово - "+min+" символов");
        System.out.println("\'"+strMax+"\'"+" самое длинное слово - "+max+" символов");
    }
}
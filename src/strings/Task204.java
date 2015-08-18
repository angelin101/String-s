package strings;

/**
 * Created by Ангелин on 18.08.2015.
 * Дана строка, содержащая текст, заканчивающийся точкой. Вывести на экран слова, содержащие три буквы.
 */
public class Task204 {
    public void printWordsOfThreeLetter(String str){
        String[] ar = new ToStringArray().getArrayOfWords(str);
        boolean isHaveLetter = false;
        System.out.println("Слова содержашие три буквы:");
        for (String s : ar){
            if (s.length() == 3){
                isHaveLetter = true;
                System.out.println(" - "+s);
            }
        }
        if (!isHaveLetter){
            System.out.println("ТАКИХ НЕТУ!)");
        }
    }
}

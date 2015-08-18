package strings;

/**
 * Created by Ангелин on 17.08.2015.
 * Дана строка. Подсчитать в ней количество вхождений букв r, k, t.
 */
public class Task200 {
    public void numberOfThreeSymbol(String str, char r, char k, char t){
        int a = 0;
        int b = 0;
        int c = 0;
        char ch;
        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if (ch == r){
                a++;
            }
            else if (ch == k){
                b++;
            }
            else if (ch == t){
                c++;
            }
            else if (ch == '.'){
                break;
            }
        }
        System.out.println("Количество вхождений символов "+r+" - "+a);
        System.out.println("Количество вхождений символов "+k+" - "+b);
        System.out.println("Количество вхождений символов "+t+" - "+c);
    }
}

package strings;

/**
 * Created by Ангелин on 18.08.2015.
 * Дана строка. Преобразовать ее, удалив каждый символ * и повторив каждый символ, отличный от *.
 */
public class Task205 {
    public String getConversionString(String str){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '*'){
                continue;
            }
            else{
                res.append(str.charAt(i));
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}

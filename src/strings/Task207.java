package strings;

/**
 * Created by ������� on 18.08.2015.
 * ���� ������. ���������� ���������� ���� k � ��������� �� �����.
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

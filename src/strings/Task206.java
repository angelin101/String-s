package strings;

/**
 * Created by ������� on 18.08.2015.
 * ���� ������. ����������, ������� ��� ������ � ��� ������ ����  abc.
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

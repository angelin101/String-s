package strings;

/**
 * Created by ������� on 18.08.2015.
 * ���� ������ ��������, ����� ������� ���� ��������� (:). ����������, ������� �������� ��� ������������.
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

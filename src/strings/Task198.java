package strings;

/**
 * Created by ������� on 17.08.2015.
 * ���� ������, ��������������� ������. ����������, ������� � ��� ����.
 */
public class Task198 {
    public int getNumberOfWords(String str){
        String[] ar = new ToStringArray().getArrayOfWords(str);
        return ar.length;
    }
}

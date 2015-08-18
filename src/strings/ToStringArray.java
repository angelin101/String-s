package strings;

/**
 * Created by ������� on 18.08.2015.
 */
public class ToStringArray {

    // ����� ���������� ������ ���� ������������ � ������.
    public String[] getArrayOfWords(String str) {
        char ch;
        int lengthArray = 0;
        int index = 0;

// ����������� ������ �������
        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if (ch == ' ' || ch =='.' || i == str.length()-1) {
                lengthArray++;
            }
        }
// ����������� ������ �������
        String[] arStr = new String[lengthArray];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == ' ' || ch =='.'){
                arStr[j] = str.substring(index, i);
                index = i+1;
                j++;
            }
            else if(i == str.length()-1){
                arStr[j] = str.substring(index, i+1);
            }
        }
        return arStr;
    }
}

import strings.*;


import java.util.Scanner;
/**
 * Created by Ангелин on 17.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int choice, res;
        String str;
        do{
            System.out.println("Выберите нужный пункт задачи:");
            System.out.println("1. Задача №198 - Подсчитать количество слов в строке.");
            System.out.println("2. Задача №199 - Подсчитать количество слов, начинающихся с буквы b.");
            System.out.println("3. Задача №200 - Подсчитать в строке количество вхождений букв r, k, t.");
            System.out.println("4. Задача №201 - Определить, сколько в строке символов  '*' ,  ';' ,  ':' .");
            System.out.println("5. Задача №202 - Найти длины самого короткого и самого длинного слов.");
            System.out.println("6. Задача №203 - Определить, сколько символов предшествует двоеточию (:).");
            System.out.println("7. Задача №204 - Вывести на экран слова, содержащие три буквы.");
            System.out.println("8. Задача №205 - Преобразовать строку, удалив каждый символ * и повторив каждый символ, отличный от *.");
            System.out.println("9. Задача №206 - Определить, сколько раз в строку входит группа букв abc.");
            System.out.println("10. Задача №207 - Подсчитать количество букв k в последнем слове строки.");
            choice = scan.nextInt();

        }while(choice <= 0 || choice > 10);
        switch (choice){
            case 1:
                System.out.println("Задача №198");
                System.out.println("Введите предложение, заканчиваюшуююся точкой:");
                str = scan2.nextLine();
                res = new Task198().getNumberOfWords(str);
                System.out.println("Слов в строке - "+res);
                break;
            case 2:
                System.out.println("Задача №199");
                System.out.println("Введите предложение, содержашее английский текст:");
                str = scan2.nextLine();
                res = new Task199().getWordsWithB(str);
                System.out.println("Слов начинающихся с буквы b. - " + res);
                break;
            case 3:
                System.out.println("Задача №200");
                System.out.println("Введите предложение, содержашее английский текст:");
                str = scan2.nextLine();
                new Task200().numberOfThreeSymbol(str, 'r', 'k', 't');
                break;
            case 4:
                System.out.println("Задача №201");
                System.out.println("Введите предложение, содержашее символы '*' ,  ';' ,  ':' .:");
                str = scan2.nextLine();
                new Task200().numberOfThreeSymbol(str, '*', ';', ':');
                break;
            case 5:
                System.out.println("Задача №202");
                System.out.println("Введите предложение:");
                str = scan2.nextLine();
                new Task202().lengthWords(str);
                break;
            case 6:
                System.out.println("Задача №203");
                System.out.println("Введите строку символов, среди которых есть двоеточие (:):");
                str = scan2.nextLine();
                int result = new Task203().getNumberSymbol(str);
                System.out.println("Двоеточию (:) предшествует - " + result + " символов");
                break;
            case 7:
                System.out.println("Задача №204");
                System.out.println("Введите строку, заканчивающююся точкой.:");
                str = scan2.nextLine();
                new Task204().printWordsOfThreeLetter(str);
                break;
            case 8:
                System.out.println("Задача №205");
                System.out.println("Введите строку:");
                str = scan2.nextLine();
                String s = new Task205().getConversionString(str);
                System.out.println("Преобразованая строка: " + s);
                break;
            case 9:
                System.out.println("Задача №206");
                System.out.println("Введите предложение, содержашее английский текст:");
                str = scan2.nextLine();
                res = new Task206().getABC(str);
                System.out.println("Группа букв \"abc\" входит в строку: " + res+" раз.");
                break;
            case 10:
                System.out.println("Задача №207");
                System.out.println("Введите предложение, содержашее английский текст:");
                str = scan2.nextLine();
                res = new Task207().getK(str);
                System.out.println("Данная строка содержит в последнем слове - " + res+" букв k.");
                break;
        }
    }
}

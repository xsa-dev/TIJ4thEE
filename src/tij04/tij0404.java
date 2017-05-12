package tij04;

/**
 * Created by xsd on 07.05.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0404 {
    public static void main(String[] args) {
        //Напишите программу использующую два вложенных цикла For и оператор остатка (%)
        //Для поиска и вывода простых чисел
        //Простые числа - целые числа не делящиеся нацело ни делящиеся на другие числа кроме себя и 1
        System.out.println("Не сделано");
        int x;

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (i / j == 1) {
                    System.out.println(i / j);
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}

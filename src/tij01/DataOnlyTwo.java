package tij01;

/**
 * Created by xsd on 07.04.2017 with love.
 * :)
 * TIJ0105
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */

public class DataOnlyTwo {
    /**
     * Точка входа в класс и приложение
     * @param i целочисленное поле инициализируеются единицей
     *          @param d поле со значением числа с плавающей точкой инициализируется одной десятой
     *                   @param b поле с булевым значением инициализируется правдой
     *                            @throws Exception исключения не выдаются
     */
    int i = 1;
    double d = 0.1d;
    boolean b = true;

    public static void main (String[] args) {
        /**
         * Точка входа в метод main
         * @param args Массив строковых элементов
         * @throws Exception исключения не выдаются
         */
        DataOnlyTwo data = new DataOnlyTwo();
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
    }
}
/* Output: (100% match)
1
0.1
true
*///:~

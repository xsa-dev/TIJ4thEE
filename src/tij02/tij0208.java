package tij02;

//: tij02/tij0208.java

/**
 * Created by xsd on 08.04.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */

public class tij0208 {
    /**
     * Точка вхождения в приложение
     */
    public static class StaDemo {
        /**
         * Создаем статический класс {@link StaDemo}
         * @param i публичное статическое целочисленное поле
         */
        public static int i = 0;
    }

    /**
     * Основной метод main
     * Показывает что при изменении статических переменных они меняются во всех созданных объектах
     * @param args Массив строковых элементов

     */

    public static void main (String[] args) {

        StaDemo staDemo = new StaDemo();
        StaDemo staDemo1 = new StaDemo();

        staDemo.i = 1;
        System.out.println(staDemo.i);
        System.out.println(staDemo1.i);

        staDemo.i = 5;
        System.out.println(staDemo.i);
        System.out.println(staDemo1.i);
    }
}
/* Output: (100% match)
1
1
5
5
 *///:~

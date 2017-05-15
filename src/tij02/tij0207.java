package tij02;

//: tij02/tij0207.java

/**
 * Created by xsd on 08.04.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */

public class tij0207 {
    /**
     * Точка вхождения в приложение
     */
    static class StaticTest {
        /**
         * Статический клас хранящий значение поля счетчика
         */
        static int i = 47;
    }

    static class incrementable {
        /**
         * Точка входа в класс @see incrementable
         */
        static void increment() {
            /**
             * Точка входа в метод increment
             * Увеличивает значение объекта StaticTest
             */
            StaticTest.i++;
        }
    }

    /**
     * Метод main создаёт новый объект, выполняет метод increment класса incrementable, выводит значение объекта
     *
     * @param args Массив входных парамеров - не используется
     */
    public static void main(String[] args) {

        StaticTest st1 = new StaticTest();
        incrementable.increment();
        System.out.println(st1.i);
    }
}
/* Output: (100% match)
48
 *///:~
package tij02;

//: tij02/tij0206.java

/**
 * Created by xsd on 08.04.2017 with love.
 * :)
 * @autor xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0206 {
    /**
     * Метод для 6 задания первой главы
     * @param s строка
     * @return возврашает длинну строки увеличенную в 2 раза
     */
    static int storage(String s) {
        return s.length()*2;
    }

    /**
     * Метод main обращающийся к методу @see tij0206#storage
     * @param args Массив строковых элементов
     *             @throws Exception исключения не выдаются
     */

    public static void main (String[] args) {
        System.out.println(storage("ok"));
    }
}
/* Output: (50 match)
4
 *///:~

package tij03;

/**
 * Created by xsd on 01.05.2017 with love.
 * :)
 * Программа содержит метод выводящий char в двоичном представлении и примеры использования метода
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0313 {
    /**
     * Метод выводящий char в двоичном представлении
     *
     * @param x входящий параметр типа char
     */
    static void CharBi(char x) {
        char z = x;
        System.out.println(Integer.toBinaryString(x));
    }

    public static void main(String[] args) {
        char c = 'c';
        char x = 'x';
        char z = 'z';
        CharBi(c);
        CharBi(x);
        CharBi(z);
    }

}

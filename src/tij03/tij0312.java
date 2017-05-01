package tij03;

/**
 * Created by xsd on 01.05.2017 with love.
 * :)
 * Начал с чистал состоящего из нулей и едениц.
 * Сдвинул влево на 25 битов
 * Сдвинул беззнаковым оператором вправо по всем двоичным позициям
 * Промежуточные результаты выводятся
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0312 {
    public static void main(String[] args) {
        int x = -1101001001;
        System.out.println(x);
        //left
        x <<= 25;
        System.out.println(Integer.toBinaryString(x));
        //right bezznak
        x >>>= 25;
        System.out.println(Integer.toBinaryString(x));
    }
}

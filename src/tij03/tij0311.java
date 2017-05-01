package tij03;

/**
 * Начал с числа содержащего 1 в двоичной системе используя шестнадцатиричную константу
 * Используя знаковый оператор сдвига вправо, сдвигаю знак до крайней правой позиции и вывожу все промежуточные варианты
 * Информация по констатнтам (полезная информация, тут: http://rjaan.narod.ru/docs/gnucs/assembler/integers.html)
 * Created by xsd on 01.05.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0311 {
    public static void main(String[] args) {
        int x = 0x0F;

        for (int i = 0; i <= 4; i++) {
            System.out.println(Integer.toBinaryString(x));
            x >>>= 1;
        }
    }
}

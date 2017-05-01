package tij03;

/**
 * Created by xsd on 01.05.2017 with love.
 * :)
 * tij0310
 * Программа состоящая из двух констант содержащих нули и единицы, записанных в шеснадцатиричном виде. Обьеденины всеми возможными поразрядными операторами. Для вывода используется Integer.toBinaryString
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0310 {

    public static void main(String[] args) {
        int a = 0x1000; //нулю равен младщий бит
        int b = 0x0001; //нулю равен старший бит

        System.out.println("--Дано:--");
        System.out.println("a: " + Integer.toBinaryString(a));
        System.out.println("b: " + Integer.toBinaryString(b));
        System.out.println("--Решение:--");

        int c = a & b;     //Поразрядный оператор И - & -
        // заносит 1 в выходной бит, если оба выходных бита равны 1, иначе заносит 0
        System.out.println("Поразрядный оператор И от a к b: " + Integer.toBinaryString(c));
        c = a | b; //Поразрядный оператор ИЛИ - | -
        // заносит 1 в выходной бит, если хотя бы один из битов операндов был равен 1, результат равен 0 только в том случае когда оба бита операндов были нулевыми
        System.out.println("Поразрядный оператор ИЛИ от a к b: " + Integer.toBinaryString(c));
        c = a ^ b; //Поразрядный оператор ИСКЛЮЧАЮЩЕ (XOR, ^),
        // имеет результат 1 тогда, когда один или другой из входных битов был единицей, но не оба вместе
        System.out.println("Поразрядный оператор ИСКЛЮЧАЮЩЕ (XOR, ^) от a к b: " + Integer.toBinaryString(c));
        c = ~a; // Поразрядный оператор НЕ (оператор Двоичного Дополнения) является унарным оператором, то есть имеет только один операнд
        // . Поразрядное НЕ производит бит, противоположный исходному - если входящий бит является нулём, то в результате будет еденица, если вхожящий единица, то в результате будет ноль
        System.out.println("Поразрядный оператор НЕ от a: " + Integer.toBinaryString(c));
        c = ~b;
        System.out.println("Поразрядный оператор НЕ от b: " + Integer.toBinaryString(c));

        //комбинированные с присваеванием:
        c &= a;
        System.out.println("Комбинированно с присваиваниваем И для a: " + Integer.toBinaryString(c));
        c &= b;
        System.out.println("Комбинированно с присваиваниваем И для b:" + Integer.toBinaryString(c));
        c |= a;
        System.out.println("Комбинированно с присваиваниваем ИЛИ для a: " + Integer.toBinaryString(c));
        c |= b;
        System.out.println("Комбинированно с присваиваниваем ИЛИ для b: " + Integer.toBinaryString(c));
        c ^= a;
        System.out.println("Комбинированно с присваиваниваем XOR для a: " + Integer.toBinaryString(c));
        c ^= b;
        System.out.println("Комбинированно с присваиваниваем XOR для b: " + Integer.toBinaryString(c));


    }
}

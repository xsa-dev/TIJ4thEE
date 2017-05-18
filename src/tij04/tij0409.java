package tij04;

/**
 * Created by xsd on 16.05.2017 with love.
 * :)
 * Fibonacci
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0409 {

    public static void Fibonacci(int input) {
        int first = input;
        while (true)
            switch (input) {
                case 1:
                    System.out.println(1);
                case 2:
                    System.out.println(2);
                case 3:
                    System.out.println(3);
                    break;
            }
    }

    public static void main(String[] agrs) {
        Fibonacci(3);
    }
}

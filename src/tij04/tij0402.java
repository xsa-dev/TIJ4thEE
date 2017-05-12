package tij04;

import java.util.Random;

/**
 * Created by xsd on 06.05.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0402 {
    public static void main(String[] args) {
        Random random = new Random();
        int x;
        for (int i = 0; i <= 25; i++) {
            x = random.nextInt();

            if (x == random.nextInt()) {
                System.out.println("x=y");
            }
            if (x > random.nextInt()) {
                System.out.println("x>y");
            }
            if (x < random.nextInt()) {
                System.out.println("x<y");
            }
        }
    }
}

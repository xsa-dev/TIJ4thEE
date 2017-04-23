package tij03;

import java.util.Random;

/**
 * Created by xsd on 23.04.2017 with love.
 * :)
 * Программа моделирует бросок монеты
 * Варианты ответов:
 * Face - орёл
 * Zero - решко
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0307 {
    public static void main(String[] args) {
        Random r = new Random();
        int c = r.nextInt(2);
        if (c == 1) {
            System.out.println("Face"); //orel
        } else
            System.out.println("Zero"); //reshko
    }
}

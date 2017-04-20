package tij03;

import java.util.Random;

/**
 * Created by xsd on 20.04.2017 with love.
 * :)
 * Вычисляем скорость от постоянных расстояния и времени
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0304 {
    public static void main(String[] args) {
        Random r = new Random();

        float sp; //speed in m/s
        int ti; //time in seconds
        int di; //distance in meters

        ti = r.nextInt(100);
        di = r.nextInt(100);
        System.out.println("Time (s):" + ti);
        System.out.println("Distance (m): " + di);

        sp = (float) di / ti;

        System.out.println(sp + " m/s");
    }
}

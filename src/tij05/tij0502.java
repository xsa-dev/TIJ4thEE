package tij05;

/**
 * Created by xsd on 14.05.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0502 {
    static String g = "this is string";
    static String k;

    public tij0502(String x) {
        k = x;
    }

    public static void main(String[] args) {
        System.out.println(g);
        new tij0502("ok, boss");
        System.out.println(k);
    }
}

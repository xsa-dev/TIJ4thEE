package tij05;

/**
 * Created by xsd on 01.06.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0511 {
    public void finalize() {
        System.out.println("finalize");
    }

    public static void main(String[] args) {
        tij0511 x = new tij0511();
        x.finalize();
        System.gc();

    }
}

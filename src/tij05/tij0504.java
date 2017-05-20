package tij05;

/**
 * Created by xsd on 19.05.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0504 {
    public String mess = "ok, boss! :D";

    tij0504() {
        System.out.println(mess);
    }

    tij0504(String str) {
        System.out.println(mess + ' ' + str);
    }

    public static void main(String[] args) {
        tij0504 x = new tij0504();
        tij0504 y = new tij0504("ALEKS");
    }
}

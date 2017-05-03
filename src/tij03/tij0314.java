package tij03;

/**
 * Created by xsd on 03.05.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0314 {
    static void eq(String a, String b) {
        //Concatenate
        System.out.println("Concatenate Strings: " + a + " " + b);
        //Equals
        System.out.println("A is eq B?: " + (a == b));
        System.out.println("A is eq B?: " + (a.equals(b)));
        //Not equals
        System.out.println("A not eq B: " + (a != b));
        System.out.println("A not eq B?: " + (!a.equals(b)));
        System.out.println("---xxx---");
    }

    public static void main(String[] args) {
        eq("A", "B");
        eq("ok", "boss");
        eq("this is a", "and this is b");
        eq("a", "a");
        eq("a", "A");
    }
}

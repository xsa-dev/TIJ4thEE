package tij05;

/**
 * Created by xsd on 04.07.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0514 {
    static String staticStringOne = "i am here";
    static String staticStringTwo;

    static {
        staticStringTwo = "i am where";
    }

    public static void printMethod() {
        System.out.println(staticStringOne);
        System.out.println(staticStringTwo);
    }

    public static void main(String[] args) {
        printMethod();
    }

}

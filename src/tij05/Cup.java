package tij05;

/**
 * Created by xsd on 04.07.2017 with love.
 * :)
 * tij0513
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }

}


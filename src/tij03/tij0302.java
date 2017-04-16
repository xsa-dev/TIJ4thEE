package tij03;

/**
 * Created by xsd on 16.04.2017 with love.
 * :)
 *
 * Example of alliasing
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
class Val {
    float attr;
}

public class tij0302 {
    public static void main(String[] args) {
        Val fone = new Val();
        Val ftwo = new Val();
        fone.attr = 5.0f;
        ftwo.attr = 3.1f;
        System.out.println("fone: " + fone.attr + " ftwo: " + ftwo.attr);
        fone = ftwo;
        System.out.println("fone: " + fone.attr + " ftwo: " + ftwo.attr);
        fone.attr = 5.0f;
        System.out.println("fone: " + fone.attr + " ftwo: " + ftwo.attr);
    }
}

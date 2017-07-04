package tij05;

/**
 * Created by xsd on 04.07.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("inside main()");
        Cups.cup1.f(99); //на печать выводиться Cup(1), Cup(2) только один раз! В дальнейшем при создании объектов текст "Cup(1) Cup(2)" не печатается!
        Cups.cup2.f(88);
        Cups cup = new Cups();
        System.out.println(cup.toString());
        System.out.println("inside main() - second");
    }
}

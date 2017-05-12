package tij04;

/**
 * Created by xsd on 12.05.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class tij0406 {
    static int test(int testval, int target, int begin, int end) {
        if ((testval >= begin) && (testval <= end)) {
            if (testval > target) {
                return +1;
            } else if (testval < target) {
                return -1;
            } else
                return 0;
        } else {
            return 777;
        }
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 1, 10));
        System.out.println(test(5, 10, 1, 5));
        System.out.println(test(5, 5, 5, 10));
    }
}

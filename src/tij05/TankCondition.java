package tij05;

import sun.invoke.empty.Empty;

/**
 * Created by xsd on 01.06.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
class Tank {
    boolean checkedOut = false;

    Tank(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut)
            System.out.println("CheckedOut");
    }
}

public class TankCondition {
    public static void main(String[] args) {
        Tank stack = new Tank(true);
        stack.checkIn();
        new Tank(true);
        System.gc();
    }
}

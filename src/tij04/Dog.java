package tij04;

/**
 * Created by User on 20.05.2017.
 */
public class Dog {

    Dog(int x) {
        String out = "";
        for (int i = 0; i <= x; i++) {
            out = out + out;
        }
    }

    Dog(int i, String x) {

    }

    Dog(int i, String x, String y) {

    }


    public String bark (int x) {

    }

    public String bark (int x, String) {
        String out = "";
        for (int i = 0; i <= 4; i++) {
            out = out + out;
        }
        return out;
    }

    public static void main(String[] args) {
        Dog dogy = new Dog(1);
    }
}

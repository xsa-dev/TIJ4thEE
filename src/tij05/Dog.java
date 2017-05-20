package tij05;

/**
 * Created by User on 20.05.2017.
 */
public class Dog {

    Dog(int x) { //Завывание
        String out = "УУУУУуууу!!! ";
        for (int i = 0; i <= x; i++) {
            System.out.print(out);
        }
    }

    Dog(int i, String x) { //Лай
        for (int j = 0; j < i; j++) {
            System.out.println(x + " " + "Woof!");
        }
    }

    Dog(int i, String x, String y) {//Поскуливание
        for (int j = 0; j < i; j++) {
            System.out.println("Пожалуйста... хнык..." + x + ", " + y + " пожалуйста... хнык");
        }
    }

    public String bark (int x, String str) {
        String out = "";
        for (int i = 0; i <= x; i++) {
            out = out + out;
        }
        return out;
    }

    public static void main(String[] args) {
        Dog dogy = new Dog(5, "Hey, you!");
        Dog woDog = new Dog(5);
        Dog hnDog = new Dog(5, "Mister", "Miss");

    }
}

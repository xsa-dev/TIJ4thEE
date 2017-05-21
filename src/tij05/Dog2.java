package tij05;

/**
 * Created by User on 20.05.2017.
 */
public class Dog2 {

    String bark() {return "";};

    Dog2(int x) { //Завывание
        String out = "УУУУУуууу!!! ";
        for (int i = 0; i <= x; i++) {
            System.out.print(out);
        }
    }

    Dog2(int i, String x) { //Лай
        for (int j = 0; j < i; j++) {
            System.out.println(x + " " + "Woof!");
        }
    }

    Dog2(int i, String x, String y) {//Поскуливание
        for (int j = 0; j < i; j++) {
            System.out.println("Пожалуйста... хнык..." + x + ", " + y + " пожалуйста... хнык");
        }
    }

    Dog2(String x, String y, int i) {//Поскуливание2
        for (int j = 0; j < i ; j++) {
            System.out.println("Пожалуйста, гав..." + x + ", " + y + ", гав, пожалуйста..");
        }
    }

    Dog2(String x,int i) { //Лай2
        for (int j = 0; j < i; j++) {
            System.out.println("Гав! " + x + "! ");
        }
    }

    //Завывание
    public static void main(String[] args) {
        Dog2 dogy = new Dog2(5, "Hey, you!");
        Dog2 woDog = new Dog2(5);
        Dog2 hnDog = new Dog2(5, "Mister", "Miss");
        Dog2 hnDog2 = new Dog2("Mister", "Miss", 5);
        Dog2 woDog2 = new Dog2("Алексей", 5);

        woDog2.bark();
    }
}

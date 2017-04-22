package tij03;

/**
 * Created by xsd on 22.04.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
public class Dog {
    public static void main(String[] args) {
        Dog dogone = new Dog();
        Dog dogtwo = new Dog();
        dogone.name = "spot";
        dogtwo.name = "scruffy";
        dogone.says = "Whoof!!!";
        dogtwo.says = "Whrrl!!";

        Dog dogthree = new Dog();

        dogthree.name = dogone.name;

        System.out.println(dogthree == dogone);
        System.out.println(dogthree == dogtwo);
        System.out.println(dogthree.equals(dogone));
        System.out.println(dogthree.equals(dogtwo));

        System.out.println("Собака " + dogone.name + " говорит " + dogone.says);
        System.out.println("Собака " + dogtwo.name + " говорит " + dogtwo.says);
    }

    String name;
    String says;
}

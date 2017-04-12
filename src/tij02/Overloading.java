package tij02;
//: initialization/Overloading.java

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by xsd on 13.04.2017 with love.
 * :)
 * <p>
 * Demonstrate metods overloading with simple methods overloading
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */

class Tree {
    int height;

    Tree() {
        System.out.println("Сажаем росток");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Создание нового дерева высотой" + height + " м.");
    }

    void info() {
        System.out.println("Дерево высотой " + height + " м.");
    }

    void info(String s) {
        System.out.println(s + ": Дерево высотой " + height + " м.");
    }
}

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(1);
            t.info();
            t.info("Перезагруженный метод");
        }
        //перезагруженный конструктор
        new Tree();
    }
}

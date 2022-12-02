package com.dmdev.lessons.lesson10.part2;

/**
 * ЗАменить все грустные смайлы :( в строе на веселые :)
 */
public class Task1 {
    public static void main(String[] args) {
        String value = "adasdasd :( asdasda :(  asdsaddff :( asd:) asda :)";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {//из статического метода мы можем запускать только другие статические методы
        return value.replace(":(", ":)");
        //все  методы класса String возвращают новую строку на основании тех парамеров, которые мы передали,
        // т.к. класс String - неизменяем (immutable)
    }
}

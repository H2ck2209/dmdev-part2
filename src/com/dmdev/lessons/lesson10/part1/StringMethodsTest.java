package com.dmdev.lessons.lesson10.part1;

import java.util.Locale;

/**
 * Часто используемые методы класса String. Deprecated-методы будут поеречеркнутыми - это означает, что в ближайших версиях
 * Java он не будет поддерживаться, поэтому его использование нежелательно.
 */
public class StringMethodsTest {
    public static void main(String[] args) {
        /*
         * Строку можно создать как массив byte с указанием кодировки Charset.
         * Если кодировка не указывается, то подразумевается кодировка по умолчанию: UTF-8.
         */
        byte[] byteArray;
        byteArray = new byte[]{71, 111, 100};
        String god = new String(byteArray);
        System.out.println(god); // God

        /*
         * Строку можно создать как массив символов.
         */
        char[] charArray = new char[]{'I', 'r', 'o', 'n', 'm', 'a', 'n'};
        String tony = new String(charArray);
        System.out.println(tony);

        /*
         * Метод charAt(int) принимает целочисленное значение и возвращает символ, находящийся под порядковым номером
         * равным данному значению.
         */
        System.out.println(tony.charAt(2)); //o

        /*
         * Метод compareTo принимает строку B и сравнивает ее с текущей строкой A, и возвращает int:
         * А > B; int = положительное число;
         * A < B; int = отрицательное число;
         * A = B; int = 0;
         * compareToIgnoreCase делает тоже самое с игнорированием регистра.
         */
        System.out.println(tony.compareTo(god));//2
        System.out.println(god.compareTo(tony)); //-2
        System.out.println(god.compareTo(god));//0

        /*
         * concat(string) используется как аналог конкантенации строк через "+".
         */
        String cat = "Felix";
        System.out.println(cat.concat(" - nice cat"));//Felix - nice cat

        /*
         * contains(charSequence) проверяет наличие подстроки в строке и возвращает true либо false.
         */

        System.out.println(cat.contains("dog"));//false
        System.out.println(cat.contains("lix"));//true

        /*
         * endWith(String) проверяет, заканчивается ли строка указанной подстрокой и возвращает true либо false.
         */
        String niceCat = cat.concat(" - nice cat");
        System.out.println(niceCat.endsWith("cat"));//true

        /*
         * equals(Object) equalsIgnoreCase(String) сравнивают строки с учетом и без учета регистра.
         */

        System.out.println(cat.equals("felix"));//false
        System.out.println(cat.equalsIgnoreCase("felix"));//true

        /*
         * equals(Object) equalsIgnoreCase(String) сравнивают строки с учетом и без учета регистра.
         */
        String str = String.format("Строка c форматированием: %16.2f", 1000.0 / 3.0);//статический метод.
        System.out.println(str);

        /*
         * getBytes() возвращает массив строк byte[]
         */

        System.out.println("getBytes" + cat.getBytes());

        /*
         * indexOf() и lastIndexOf() возвращают первый либо последний порядковый номер символа в строке.
         * Если символа нет, возвращается -1.
         */

        System.out.println("indexOf" + " x = " + cat.indexOf('F'));
        System.out.println(("lastIndexOf" + " i = " + cat.lastIndexOf("i") ));

        /*
         * Методы isEmpty и isBlank проверяют, является ли строка пустой.
         * isEmpty - возвращает true только если строка абсолютно пустая ("") или имеет значение null;
         * isBlank - возвращает true только если в строке есть только пробел(-ы) (и нет других символов),
         * или строка пустая ("") или имеет значение null.
         *
         * прикладное значение: допустим мы хотим чтобы пользователь ввёл свое имя, чтобы поприветствовать его.
         * Пользователь вводит пробел(-ы) вместо имени, тогда получится "Привет, пробел(-ы)".
         * Чтобы не здороваться с пробелом можно проверить введенное имя через isBlank(),
         * и в случае если пользователь ввел только пробел(-ы) попросить заново ввести имя
         */

        String blankTest = " ";
        String emptyTest = " ";
        System.out.println("Is empty = " + niceCat.isEmpty());
        System.out.println("Is blank = " + niceCat.isBlank());
        System.out.println("Is empty = " + emptyTest.isEmpty());
        System.out.println("Is blank = " + blankTest.isBlank());

        /*
         * Метод join() соединяет разные строки в одну через указанный нами делиметр.
         */
        String join;
        join = String.join("+","1", "4", "55", "35");
        System.out.println(join);//1+4+55+35

        /*
         * метод length() возвращает длину строки
         */
        System.out.println(cat.length());// = 5

        /*
         * replace(char, char) заменит один символ или символы на другой нужный нам символ.
         * через параметры CharSequence можно также заменить целую подстроку.
         */

        System.out.println(cat.replace('F', 'H'));// Helix
        System.out.println(niceCat.replace("nice", "fun"));//Felix - fun cat

        /*
         * split() - метод, обратный по действию методу join(). При введении в параметр нашего делиметра
         * метод вернет массив строк.
         */
        String[] catArray = niceCat.split("- "); //{"Felix", "nice cat"}
        for (int i = 0; i < catArray.length; i++) {
            System.out.println(catArray[i]);//
        }

        /*
         *substring() возвращает нам подстроку, начиная с указанного нами порядокового номера символа и до конца строки.
         * Либо мы можем указать 2 номера символов, и тогда подстрока будет заканчиваться
         * указанным нами символом (невключительно).
         */
        System.out.println(tony.substring(0, 4));//Iron

        /*
         * методы toLowerCase и toUpperCase изменят регистр нашей строки
         */
        System.out.println(cat.toUpperCase(Locale.ROOT));//FELIX

        /*
         * метод trim удалит все пробельные символы слева и справа
         */
        String trimTest = "  bulb ";
        System.out.println(trimTest.trim());

        /*
         * метод valueOf превратит в строку любой объект или переменную.
         */
        int anotherTest = 17;
        String anotherTested = String.valueOf(anotherTest);
    }

    /**
     * Setting huy
     * */
    public void setHuy() {

    }
}

package aula2;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> vazio = String::isEmpty;
        System.out.println(vazio.test(""));
        System.out.println(vazio.test("teste"));
    }
}

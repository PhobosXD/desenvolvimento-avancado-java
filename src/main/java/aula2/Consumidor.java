package aula2;

import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<String> teste = System.out::println;
        teste.accept("Hello World!");
    }
}

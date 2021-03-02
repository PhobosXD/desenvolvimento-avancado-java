package aula2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, Integer> funcao = texto -> Integer.valueOf(texto);
        System.out.println(funcao.apply("40"));
    }
}

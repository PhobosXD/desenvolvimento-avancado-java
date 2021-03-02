package aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = Integer::sum;

        System.out.println(executar_ordem(soma, 1, 3));
    }

    public static Integer executar_ordem(final Calculo calculo, final Integer a, final Integer b) {
        return calculo.calcular(a, b);
    }
}

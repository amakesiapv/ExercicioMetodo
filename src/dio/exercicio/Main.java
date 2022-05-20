package dio.exercicio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(10, 3);
        Calculadora.multiplicacao(6, 5);
        Calculadora.divisao(24, 4);

        System.out.println("Exercicio Mensagem");
        Mensagem.qualMensagem(20);
        Mensagem.qualMensagem(14);
        Mensagem.qualMensagem(6);

        System.out.println("Exercicio Quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7f, 8f, 9f);
    }

}

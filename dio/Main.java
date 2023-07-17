package one.dio;

public class Main {
    public static void main(String[] args){

        // Calculadora
        System.out.println("Exercício Calculadora:");
        Calculadora.somar(3, 6);
        Calculadora.subtrair(2, 1);
        Calculadora.multiplicar(2, 3);
        Calculadora.dividir(10, 2);
        System.out.println("-----------------------------");


        // Mensagem
        System.out.println("Exercício Mensagem:");
        Horario.obterMensagem(9);
        Horario.obterMensagem(14);
        Horario.obterMensagem(1);
        Horario.obterMensagem(25);
        System.out.println("-----------------------------");

        // Emprestimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 5);
        System.out.println("-----------------------------");

    }


}

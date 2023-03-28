import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        double num1, num2, resultado;
        int escolha;

        List<OperacaoMatematica> operacoes = new ArrayList<>();
        operacoes.add(new Adicao());
        operacoes.add(new Subtracao());
        operacoes.add(new Multiplicacao());
        operacoes.add(new Divisao());
        operacoes.add(new RaizQuadrada());
        operacoes.add(new Potenciacao());
        operacoes.add(new Logaritmo());

        try{
        System.out.print("Digite o primeiro número: ");
        num1 = dados.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = dados.nextDouble();
        } catch (Exception e) {
            System.out.println("Entrada inválida. Verifique se você digitou números válidos.");
            dados.close();
            return;
        }

        System.out.println("Escolha a operação que deseja realizar:");

        for (int i = 0; i < operacoes.size(); i++) {
            System.out.println((i + 1) + " - " + operacoes.get(i).getNome());
        }

        escolha = dados.nextInt();

        if (escolha < 1 || escolha > operacoes.size()) {
            System.out.println("Opção inválida.");
        } else {
            OperacaoMatematica operacao = operacoes.get(escolha - 1);
            resultado = operacao.calcular(num1, num2);
            System.out.println("O resultado da operação é: " + resultado);
        }

        dados.close();
    }
}
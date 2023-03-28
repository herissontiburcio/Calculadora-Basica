public class Logaritmo implements OperacaoMatematica {
    @Override
    public double calcular(double num1, double num2) {
        if (num1 <= 0 || num2 <= 0) {
            throw new ArithmeticException("Não é possível calcular o logaritmo de um número não-positivo.");
        } else {
            return Math.log(num2) / Math.log(num1);
        }
    }

    @Override
    public String getNome() {
        return "Logaritmo";
    }
}

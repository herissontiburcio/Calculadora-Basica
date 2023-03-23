public class Divisao implements OperacaoMatematica{
    @Override
    public double calcular(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        } else {
            return num1 / num2;
        }
    }

    @Override
    public String getNome() {
        return "Divisao";
    }
}

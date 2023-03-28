public class RaizQuadrada implements OperacaoMatematica {
    @Override
    public double calcular (double num1, double num2) {
        if (num1 < 0) {
            throw new ArithmeticException("Não é possível calcular a raiz quadrada de um número negativo.");
        } else {
            return Math.sqrt(num1);
        }
    }
    @Override
    public String getNome() {
        return "RaizQuadrada";
    }
}

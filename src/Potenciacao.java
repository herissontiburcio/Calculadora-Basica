public class Potenciacao implements OperacaoMatematica {
    @Override
    public double calcular(double num1, double num2) {
        return Math.pow(num1, num2);
    }
    @Override
    public String getNome() {
        return "Potenciacao";
    }
}

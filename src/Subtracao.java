public class Subtracao implements OperacaoMatematica{
    @Override
    public double calcular(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public String getNome() {
        return "Subtracao";
    }
}

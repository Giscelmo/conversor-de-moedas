package br.com.giscelmo.modelo;

public class ConversorMoedas {
    private String baseCode;
    private String targetCode;
    private double valorOriginal;
    private double valueConvert;

    public ConversorMoedas(String baseCode, String targetCode, double valorOriginal, double valueConvert) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.valorOriginal = valorOriginal;
        this.valueConvert = valueConvert;
    }

    @Override
    public String toString() {
        return ("""
                Valor %.2f [%s] corresponde ao valor final de %.2f[%s]""".formatted(valorOriginal, baseCode ,valueConvert, targetCode));
    }
    /*public void exibeInformacoes() {
        System.out.println("""
                Valor %.2f [%s] corresponde ao valor final de %.2f[%s]
                """.formatted(valorOriginal, baseCode ,valueConvert, targetCode));
    }*/
}

package br.com.giscelmo.principal;

import br.com.giscelmo.modelo.ConversorMoedas;
import br.com.giscelmo.service.ConversorMoedasService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        var service = new ConversorMoedasService();
        List<ConversorMoedas> historico = new ArrayList<>();

        boolean iniciar = true;

        while (iniciar) {
            System.out.println("""
                
                Seja bem-vindo(a) ao conversor de Moeda!
                
                1) Dólar           =>> Peso agentino
                2) Peso argentino  =>> Dólar
                3) Dólar           =>> Real brasileiro
                4) Real brasileiro =>> Dólar
                5) Dólar           =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Historico
                8) Sair
                """);

            System.out.println("Escolha uma opção: ");
            int opcao = Integer.parseInt(leitura.nextLine());

            if (opcao == 8) {
                System.out.println("Programa encerrado.");
                iniciar = false;
                continue;
            }

            if (opcao == 7) {
                if(historico.isEmpty()) {
                    System.out.println("Nenhuma conversão realizada.");
                } else {
                    historico.forEach(System.out::println);
                }
                continue;
            }

            String baseCode;
            String targetCode;

            switch (opcao) {
                case 1 -> {
                    baseCode = "USD";
                    targetCode = "ARS";
                }
                case 2 -> {
                    baseCode = "ARS";
                    targetCode = "USD";
                }
                case 3 -> {
                    baseCode = "USD";
                    targetCode = "BRL";
                }
                case 4 -> {
                    baseCode = "BRL";
                    targetCode = "USD";
                }
                case 5 -> {
                    baseCode = "USD";
                    targetCode = "COP";
                }
                case 6 -> {
                    baseCode = "COP";
                    targetCode = "USD";
                }
                default -> {
                    System.out.println("Opção invalida!");
                    continue;
                }
            }

            System.out.println("Digite o valor a ser convertido: ");
            String entrada = leitura.nextLine().replace(",",".");
            double valueConvert = Double.parseDouble(entrada);

            var conversor = service.converter(baseCode, targetCode, valueConvert);
            System.out.println(conversor);

            historico.add(conversor);
        }
    }
}

package br.com.giscelmo.dto;

public record ConversorMoedaDTO(
        String baseCode,
        String targetCode,
        Double conversionRate,
        Double conversionResult
) {
}

package br.com.giscelmo.service;

import br.com.giscelmo.dto.ConversorMoedaDTO;
import br.com.giscelmo.modelo.ConversorMoedas;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;

public class ConversorMoedasService {

    private final Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    public ConversorMoedas converter (String baseCode, String targetCode, Double valueConvert) {
        var endereco = String.format(
                Locale.US,
                "https://v6.exchangerate-api.com/v6/483d4dca88706f726ab9cba6/pair/%s/%s/%.2f",
                baseCode, targetCode, valueConvert
        );

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            ConversorMoedaDTO dto = gson.fromJson(response.body(), ConversorMoedaDTO.class);

            return new ConversorMoedas(
                    dto.baseCode(),
                    dto.targetCode(),
                    valueConvert,
                    dto.conversionResult()
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro ao converter moeda", e);
        }
    }
}

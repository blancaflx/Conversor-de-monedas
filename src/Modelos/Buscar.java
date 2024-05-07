package Modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Buscar {
    public Conversion busqueda(String moneda){
        URI direccion= URI.create("https://v6.exchangerate-api.com/v6/37cbe968e805764e0f96e2c6/latest/"+moneda);
        HttpClient client = HttpClient.newHttpClient(); //somos el cliente
        HttpRequest request = HttpRequest.newBuilder() //que es lo que pedimos al servidor
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package Modelos;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public record Conversion(String base_code, Map<String, Double> conversion_rates) {
    @Override
    public String toString() {
        return "Conversion{" +
                "base_code='" + base_code + '\n' +
                ", conversion_rates=" + conversion_rates +
                '}';
    }

    @Override
    public Map<String, Double> conversion_rates() {
        return conversion_rates;
    }

    @Override
    public String base_code() {
        return base_code;
    }
}

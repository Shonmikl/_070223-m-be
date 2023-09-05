package org.example._2023_08_22.jsonParser;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class JSON {
    public static void main(String[] args) throws Exception {
        try {
            InputStream inputStream = JSON.class.getResourceAsStream("report.json");
            assert inputStream != null;
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }

            JSONObject json = new JSONObject(stringBuilder.toString());

            Map<String, Object> map = json.toMap();

            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }

        } catch (Exception e) {
            System.out.println("Error reading or parsing JSON: " + e.getMessage());
        }
    }
}

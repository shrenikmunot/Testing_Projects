package org.ej.generic;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Config {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Shrek\\eclipse-workspace\\finsys_0\\finsys\\Config.json"; // Path to your JSON file

        try {
            String result = performJSONQuery(filePath, "$.QA.username"); // Example query
            System.out.println("Result: " + result);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static String performJSONQuery(String filePath, String query) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        try (FileReader fileReader = new FileReader(filePath)) {
            Object jsonObject = parser.parse(fileReader);
            String[] keys = query.split("\\.");
            Object currentObject = jsonObject;

            for (int i = 1; i < keys.length; i++) {
                String key = keys[i];
                if (currentObject instanceof JSONObject) {
                    currentObject = ((JSONObject) currentObject).get(key);
                } else if (currentObject instanceof JSONArray) {
                    int index = Integer.parseInt(key);
                    currentObject = ((JSONArray) currentObject).get(index);
                }
            }

            return (currentObject != null) ? currentObject.toString() : null;
        }
    }
}

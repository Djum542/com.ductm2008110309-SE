package com.ductm2008110309;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StoredFiles {
    private static final Type write = null;
    private static final int i = 0;
    private String strorredString;
    private JsonArray Memory;

    public StoredFiles(String strorredString) {
        this.strorredString = strorredString;
        this.Memory = read();
    }

    private JsonArray read() {
        JsonArray jsonArray = null;
        try (FileReader reader = new FileReader(this.strorredString)) {
            jsonArray = (JsonArray) JsonParser.parseReader(reader);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return jsonArray;
    }

    public void update(String username, String password, String email) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("un", username);
        jsonObject.addProperty("ps", password);
        jsonObject.addProperty("email", email);
        Memory.add(jsonObject);
    }

    public void write() {
        Gson gson = new Gson();
        try (FileWriter fileWriter = new FileWriter(strorredString)) {
            gson.toJsonTree(Memory, write);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        getALL();
        return memory;
    }

    public void Read() {
        Gson gson = new Gson();
        try (FileReader fileReader = new FileReader(strorredString)) {
            gson.toJson(Memory);
        } catch (Exception e) {
            // TODO: handle exception
            e.fillInStackTrace();
        }
    }

    public int search(String key, String value) {
        String result = null;
        for (int i = 0; i < Memory.size(); i++)
            ;
        JsonObject jsonObject = Memory.get(i).getAsJsonObject();
        result = jsonObject.get(key).getAsString();
        if (value.equals(result)) {
            return i;
        }

        return -1;
    }

}

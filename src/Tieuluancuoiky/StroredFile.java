package Tieuluancuoiky;

import java.io.FileReader;
import java.io.FileWriter;
import java.security.Key;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StroredFile {
    private static final String gettienich = null;
    private static final String getsophong = null;
    private static final String getgia = null;
    private static final String getDientich = null;
    // khai bao bien
    private String storedfile;
    private JsonArray memory;
    private String getDiachi;

    // Contructor
    public StroredFile(String storedfile, JsonArray memory) {
        this.storedfile = storedfile;
        this.memory = memory;
    }

    // Chuc nang tim kiem
    public int search(String key, String value) {
        int index = -1;
        String diachi = null;
        String sophong = null;
        // Vong lap de tim dia diem
        for (int i = 0; i < memory.size(); i++) {
            JsonObject jsonObject = memory.get(i).getAsJsonObject();
            diachi = jsonObject.get(key).getAsString();
            if (value.equals(diachi)) {
                index = i;
                break;
            }
        }
        // Vong lap de tim so phong
        for (int j = 0; j < memory.size(); j++) {
            JsonObject jsonObject = memory.get(j).getAsJsonObject();
            sophong = jsonObject.get(key).getAsString();
            if (value.equals(sophong)) {
                index = j;
                break;
            }
        }
        return index;
    }

    // Chuc nang doc du lieu
    public JsonArray read() {
        JsonArray jsonArray = null;
        try (FileReader reader = new FileReader(storedfile)) {
            jsonArray = (JsonArray) JsonParser.parseReader(reader);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return jsonArray;
    }

    public Gson write() {
        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter(storedfile)) {
            gson.toJson(memory, writer);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return gson;
    }

    public JsonObject update(String Diachi, String sophong, Boolean tienich, float gia, float Dientich) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("AD", Diachi);
        jsonObject.addProperty("NU", sophong);
        jsonObject.addProperty("UN", tienich);
        jsonObject.addProperty("CO", gia);
        jsonObject.addProperty("S", Dientich);
        memory.add(jsonObject);
        return jsonObject;
    }

    public JsonArray getAll() {
        return this.memory;
    }

    @Override
    public String toString() {
        return "StroredFile [memory=" + memory + ", storedfile=" + storedfile + "]";
    }

    public void update(String sophong) {
    }

}

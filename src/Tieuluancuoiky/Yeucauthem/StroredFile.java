package Tieuluancuoiky.Yeucauthem;

import com.google.gson.JsonArray;

public class StroredFile {
    private String storedfile;
    private JsonArray memory;

    public StroredFile(String storedfile, JsonArray memory) {
        this.storedfile = storedfile;
        this.memory = memory;
    }

    public String search(String key, String value) {
        int index = -1;
        String diachi = null;
    }

    @Override
    public String toString() {
        return "StroredFile [memory=" + memory + ", storedfile=" + storedfile + "]";
    }

}

package Tieuluancuoiky;

import com.google.gson.JsonArray;

public class RoomHotel {
    private double gia;
    private double dientich;
    private String diachi;
    private boolean tienich;
    private String sophong;

    public RoomHotel() {
        this.gia = gia;
        this.dientich = dientich;
        this.diachi = diachi;
        this.tienich = tienich;
        this.sophong = sophong;
    }

    public RoomHotel(int i, int j, String string, String string2, String string3) {
    }

    public static JsonArray getDiachi() {
        return diachi;
    }

    @Override
    public String toString() {
        return "RoomHotel [diachi=" + diachi + ", dientich=" + dientich + ", gia=" + gia + ", sophong=" + sophong
                + ", tienich=" + tienich + "]";
    }

    public void addProperty(RoomHotel roomHotel) {
    }

}

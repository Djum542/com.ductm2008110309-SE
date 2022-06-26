package Tieuluancuoiky;

import com.google.gson.JsonArray;

public class RoomHotel {
    private double gia;
    private double dientich;
    private static String diachi;
    private boolean tienich;
    private String sophong;
    private String yeucauthem;

    public RoomHotel() {
        this.gia = gia;
        this.dientich = dientich;
        this.diachi = diachi;
        this.tienich = tienich;
        this.sophong = sophong;
        this.yeucauthem = yeucauthem;
    }

    public RoomHotel(double gia, double dientich, String diachi, String string, String sophong) {
        this.gia = gia;
        this.dientich = dientich;
        this.diachi = diachi;
        this.tienich = false;
        this.sophong = sophong;
        this.yeucauthem = yeucauthem;
    }

    public void setYeucauthem(String yeucauthem) {
        this.yeucauthem = yeucauthem;
    }

    public String getYeucauthem() {
        return yeucauthem;
    }

    public static String getDiachi() {
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

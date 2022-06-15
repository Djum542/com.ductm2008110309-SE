package Tieuluancuoiky.Datphong;

import Tieuluancuoiky.Yeucauthem.StroredFile;

public class BookroomEntity {

    private static final StroredFile BookroomEntity = null;
    // public static final String getNewRoom = null;
    private String diachi;
    private String sophong;
    private boolean tienich;
    private float gia;
    private String yeucauthem;
    private float dientich;
    private boolean tivi;
    private boolean mini_bar;
    private boolean banlamviec;
    private boolean dieuhoa;

    public BookroomEntity(String diachi, String sophong, Boolean tienich2, float gia, String dientich2) {
        this.diachi = diachi;
        this.sophong = sophong;
        this.tienich = tienich;
        this.gia = gia;
        this.dientich = dientich;
    }

    public BookroomEntity() {
        this.diachi = null;
        this.sophong = null;
        this.tienich = false;
        this.gia = 0;
        this.dientich = 0;
    }

    public boolean setTienich(Boolean tienich) {
        this.tienich = false;
        this.tivi = false;
        this.mini_bar = false;
        this.banlamviec = false;
        this.dieuhoa = false;
        return tienich;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setSophong(String sophong) {
        this.sophong = sophong;
    }

    public String getDiachi() {
        return diachi;
    }

    public float getDientich() {
        return dientich;
    }

    public float getGia() {
        return gia;
    }

    public String getSophong() {
        return sophong;
    }

    public boolean getTienich() {
        return tienich;
    }

    // public boolean checkloggedIn() {
    // return loggin;
    // }

    public void setBookroom() {
        this.diachi = diachi;
        this.sophong = sophong;
        this.dientich = dientich;
        this.gia = gia;
        this.tienich = tienich;
        this.yeucauthem = yeucauthem;
    }

    public static StroredFile getNote() {
        return BookroomEntity;
    }

    public static StroredFile getBookroom() {
        return BookroomEntity;
    }

    public String getYeucauthem() {
        return yeucauthem;
    }

    public void setYeucauthem(String yeucauthem) {
        this.yeucauthem = yeucauthem;
    }

    @Override
    public String toString() {
        return "BookroomEntity [diachi=" + diachi + ", dientich=" + dientich + ", gia=" + gia + ", sophong=" + sophong
                + ", tienich=" + tienich + "]";
    }

    public boolean bookroomValid() {
        return false;
    }

    public static StroredFile getNewRoom() {
        return BookroomEntity;
    }
}

package Tieuluancuoiky.Datphong;

public class BookroomEntity {
    private static final boolean loggin = false;
    private static final StroredFile BookroomEntity = null;
    private String diachi;
    private String sophong;
    private String tienich;
    private float gia;
    private String yeucauthem;
    private float dientich;

    public BookroomEntity(String diachi, String sophong, String tienich, float gia, float dientich) {
        this.diachi = diachi;
        this.sophong = sophong;
        this.tienich = tienich;
        this.gia = gia;
        this.dientich = dientich;
    }

    public BookroomEntity() {
        this.diachi = diachi;
        this.sophong = sophong;
        this.tienich = tienich;
        this.gia = gia;
        this.dientich = dientich;
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

    public String getTienich() {
        return tienich;
    }

    public boolean checkloggedIn() {
        return loggin;
    }

    public void setBookroom() {
        this.diachi = diachi;
        this.sophong = sophong;
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

}

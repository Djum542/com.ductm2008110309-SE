package Tieuluancuoiky.Yeucauthem;

public class BookroomEntity {
    private String diachi;
    private String sophong;
    private String tienich;
    private String gia;
    private String dientich;

    public BookroomEntity(String diachi, String sophong, String tienich, String gia, String dientich) {
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

    public String getDientich() {
        return dientich;
    }

    public String getGia() {
        return gia;
    }

    public String getSophong() {
        return sophong;
    }

    public String getTienich() {
        return tienich;
    }

    @Override
    public String toString() {
        return "BookroomEntity [diachi=" + diachi + ", dientich=" + dientich + ", gia=" + gia + ", sophong=" + sophong
                + ", tienich=" + tienich + "]";
    }

}

package main.java.com.ductm2008110309;

public class Listfilm {
    private String id;
    private String nameFilm;
    private String sector;
    private String filter;
    private Boolean old;

    public Listfilm(String nameFilm, String sector, String filter, boalean old) {
        this.nameFilm = nameFilm;
        this.sector = sector;
        this.filter = filter;
        this.old = old;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public String getFilter() {
        return filter;
    }

    public String getId() {
        return id;
    }

    private String checkFilm() {
        return this.id;
    }

    public static <StoredFiles> StoredFiles getlistFilm() {
        return getlistFilm();
    }
}

public class Film {
    private int filmID;
    private String baslik;
    private String yayinTarihi;
    private int sure;

    // Kurucu Metod
    public Film(int filmID, String baslik, String yayinTarihi, String sure) {
        this.filmID = filmID;
        this.baslik = baslik;
        this.yayinTarihi = yayinTarihi;
        this.sure = Integer.parseInt(sure);
    }

    // Get ve Set Metodları
    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(String yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

}

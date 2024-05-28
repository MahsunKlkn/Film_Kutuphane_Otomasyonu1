public class Oyuncu {
    private int oyuncuID;
    private String adi;
    private String soyadi;
    private String ulke;
    private String cinsiyet;

    // Kurucu Metod
    public Oyuncu(int oyuncuID, String adi, String soyadi, String ulke, String cinsiyet) {
        this.oyuncuID = oyuncuID;
        this.adi = adi;
        this.soyadi = soyadi;
        this.ulke = ulke;
        this.cinsiyet = cinsiyet;
    }

    // Get ve Set Metodları
    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}

public class Yonetmen {
    private int yonetmenID;
    private String adi;
    private String soyadi;

    // Kurucu Metod
    public Yonetmen(int yonetmenID, String adi, String soyadi) {
        this.yonetmenID = yonetmenID;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    // Get ve Set Metodları
    public int getYonetmenID() {
        return yonetmenID;
    }

    public void setYonetmenID(int yonetmenID) {
        this.yonetmenID = yonetmenID;
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
}

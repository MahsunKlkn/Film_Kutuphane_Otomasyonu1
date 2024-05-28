public class Tur {
    private int turID;
    private String adi;
    private String aciklama;

    // Kurucu Metod
    public Tur(int turID, String adi, String aciklama) {
        this.turID = turID;
        this.adi = adi;
        this.aciklama = aciklama;
    }

    // Get ve Set Metodları
    public int getTurID() {
        return turID;
    }

    public void setTurID(int turID) {
        this.turID = turID;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}

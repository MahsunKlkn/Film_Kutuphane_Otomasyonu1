public class Odul {
    private String adi;
    private int yil;

    // Kurucu Metod
    public Odul(String adi, int yil) {
        this.adi = adi;
        this.yil = yil;
    }

    // Get ve Set Metodları
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}

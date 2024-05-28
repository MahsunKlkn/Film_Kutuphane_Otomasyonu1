public class Main {
    public static void main(String[] args) {
        // Film oluşturma
        Film film = (Film) EntityFactory.createEntity("Film", 1, "Inception", "2010-07-16", 148);

        // Oyuncu oluşturma
        Oyuncu oyuncu = (Oyuncu) EntityFactory.createEntity("Oyuncu", 1, "Leonardo", "DiCaprio", "USA", "Erkek");

        // Yönetmen oluşturma
        Yonetmen yonetmen = (Yonetmen) EntityFactory.createEntity("Yonetmen", 1, "Christopher", "Nolan");

        // Tür oluşturma
        Tur tur = (Tur) EntityFactory.createEntity("Tur", 1, "Bilim Kurgu", "Bilim ve teknolojinin ileri düzeyde olduğu filmler");

        // Kullanıcı oluşturma
        Kullanici kullanici = (Kullanici) EntityFactory.createEntity("Kullanici", 1, "kullanici123", "email@example.com", "sifre123");

        // Ödül oluşturma
        Odul odul = (Odul) EntityFactory.createEntity("Odul", "Oscar", 2010);

        // Oluşturulan nesnelerin bilgilerini yazdırma
        System.out.println("Film: " + film.getBaslik());
        System.out.println("Oyuncu: " + oyuncu.getAdi() + " " + oyuncu.getSoyadi());
        System.out.println("Yönetmen: " + yonetmen.getAdi() + " " + yonetmen.getSoyadi());
        System.out.println("Tür: " + tur.getAdi());
        System.out.println("Kullanıcı: " + kullanici.getKullaniciAdi());
        System.out.println("Ödül: " + odul.getAdi() + " - " + odul.getYil());
    }
}

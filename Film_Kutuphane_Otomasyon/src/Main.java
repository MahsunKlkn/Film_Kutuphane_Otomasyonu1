import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, String> kullaniciBilgileri = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean devam = true;

        while (devam) {
            System.out.println("Hoş Geldiniz!");
            System.out.println("1. Giriş Yap");
            System.out.println("2. Kayıt Ol");
            System.out.println("3. Çıkış");

            System.out.print("Seçiminizi yapınız: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    girisYap();
                    break;
                case 2:
                    kullaniciKaydiOlustur();
                    break;
                case 3:
                    devam = false;
                    System.out.println("Çıkış yapıldı.");
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
                    break;
            }
        }

        scanner.close();
    }

    public static void girisYap() {
        System.out.println("Giriş Yap seçildi.");
        System.out.println("Kullanıcı adınızı giriniz:");
        String kullaniciAdi = scanner.next();

        System.out.println("Şifrenizi giriniz:");
        String sifre = scanner.next();

        if (kullaniciBilgileri.containsKey(kullaniciAdi) && kullaniciBilgileri.get(kullaniciAdi).equals(sifre)) {
            System.out.println("Giriş başarılı. Hoş geldiniz, " + kullaniciAdi + "!");

            // Giriş başarılıysa film oluşturma menüsüne geç
            filmOlusturmaMenu();
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı. Lütfen tekrar deneyin.");
        }
    }

    public static void kullaniciKaydiOlustur() {
        System.out.println("Kayıt Ol seçildi.");

        System.out.println("Kullanıcı adını giriniz:");
        String kullaniciAdi = scanner.next();

        if (kullaniciBilgileri.containsKey(kullaniciAdi)) {
            System.out.println("Bu kullanıcı adı zaten kullanımda. Lütfen farklı bir kullanıcı adı seçin.");
            return;
        }

        System.out.println("Şifreyi giriniz:");
        String sifre = scanner.next();

        kullaniciBilgileri.put(kullaniciAdi, sifre);

        System.out.println("Kayıt işlemi başarılı. Giriş yapabilirsiniz.");
    }

    public static void filmOlusturmaMenu() {
        System.out.println("Film Oluşturma Menüsüne Hoş Geldiniz!");
        System.out.println("Film Adı:");
        scanner.nextLine(); // Önceki nextInt()'in ardından kalan boşluğu temizle
        String filmAdi = scanner.nextLine();
        System.out.println("Yayın Tarihi:");
        String yayinTarihi = scanner.nextLine();
        System.out.println("Süre (saat olarak giriniz):");
        String sure = scanner.nextLine(); // Süreyi metin olarak al

        // Film nesnesini oluştur
        EntityFactory1 filmFactory = new FilmFactory();
        Film film = (Film) filmFactory.createEntity(1, filmAdi, yayinTarihi, sure);
        System.out.println("Film oluşturuldu: " + film.getBaslik());
    }
}

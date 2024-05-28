// Fabrika sınıfı
public class EntityFactory {

    public static Object createEntity(String entityType, Object... params) {
        switch (entityType) {
            case "Film":
                return new Film((int)params[0], (String)params[1], (String)params[2], (int)params[3]);
            case "Oyuncu":
                return new Oyuncu((int)params[0], (String)params[1], (String)params[2], (String)params[3], (String)params[4]);
            case "Yonetmen":
                return new Yonetmen((int)params[0], (String)params[1], (String)params[2]);
            case "Tur":
                return new Tur((int)params[0], (String)params[1], (String)params[2]);
            case "Kullanici":
                return new Kullanici((int)params[0], (String)params[1], (String)params[2], (String)params[3]);
            case "Odul":
                return new Odul((String)params[0], (int)params[1]);
            default:
                throw new IllegalArgumentException("Geçersiz nesne türü: " + entityType);
        }
    }
}

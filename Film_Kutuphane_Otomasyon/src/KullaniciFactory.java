class KullaniciFactory extends EntityFactory1 {
    @Override
    public Object createEntity(Object... params) {
        return new Kullanici((int) params[0], (String) params[1], (String) params[2], (String) params[3]);
    }
}
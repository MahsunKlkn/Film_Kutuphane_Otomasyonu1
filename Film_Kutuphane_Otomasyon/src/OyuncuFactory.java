class OyuncuFactory extends EntityFactory1 {
    @Override
    public Object createEntity(Object... params) {
        return new Oyuncu((int) params[0], (String) params[1], (String) params[2], (String) params[3], (String) params[4]);
    }
}




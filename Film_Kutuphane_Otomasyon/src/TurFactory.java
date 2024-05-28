class TurFactory extends EntityFactory1 {
    @Override
    public Object createEntity(Object... params) {
        return new Tur((int) params[0], (String) params[1], (String) params[2]);
    }
}
class OdulFactory extends EntityFactory1 {
    @Override
    public Object createEntity(Object... params) {
        return new Odul((String) params[0], (int) params[1]);
    }
}

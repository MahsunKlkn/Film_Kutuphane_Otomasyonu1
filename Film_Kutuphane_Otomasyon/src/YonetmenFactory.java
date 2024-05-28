class YonetmenFactory extends EntityFactory1 {
    @Override
    public Object createEntity(Object... params) {
        return new Yonetmen((int) params[0], (String) params[1], (String) params[2]);
    }
}
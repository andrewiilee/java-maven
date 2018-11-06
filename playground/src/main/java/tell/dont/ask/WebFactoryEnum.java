package tell.dont.ask;

public enum WebFactoryEnum {

    RESTONE,
    RESTTWO,
    SOAPONE,
    SOAPTWO;

    public WebMessageStrategy getWebMessage() throws ClassNotFoundException {
        switch (this) {
            case RESTONE:
                return getWebMessage(RestOne.class);
            case RESTTWO:
                throw new ClassNotFoundException("Class not found");
            case SOAPONE:
                throw new ClassNotFoundException("Class not found");
            case SOAPTWO:
                return new SoapTwo();
            default:
                throw new ClassNotFoundException("Class not found");
        }
    }

    private WebMessageStrategy getWebMessage(Class<? extends WebMessageStrategy> strategyClazz) throws ClassNotFoundException {
        try {
            return strategyClazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException("Class not found");
    }
}

package tell.dont.ask;

public enum WebOperations {

    RESTONE("tell.dont.ask.RestOne"),
    SOAPTWO("tell.dont.ask.SoapTwo");

    private final String name;

    WebOperations(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

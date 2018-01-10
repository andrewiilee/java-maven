package tell.dont.ask;

public class RestStrategy extends WebMessageStrategy {

    private String restMessageType;

    RestStrategy(String restMessageType) {
        super("Rest");
        this.restMessageType = restMessageType;
    }

    @Override
    String getData() {
        return getFirstPart() + ", type:" + restMessageType;
    }
}

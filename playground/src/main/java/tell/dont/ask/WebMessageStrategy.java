package tell.dont.ask;

abstract class WebMessageStrategy {
    private String webMessageType;

    WebMessageStrategy(String webMessageType){
        this.webMessageType = webMessageType;
    }
    abstract String getData();

    String getFirstPart() {
        return "webMessageType: " + webMessageType;
    }
}

package tell.dont.ask;

abstract class WebMessageStrategy {
    String webMessageType;

    WebMessageStrategy(String webMessageType){
        this.webMessageType = webMessageType;
    }
    abstract String getData();

    String getFirstPart() {
        return "webMessageType: " + webMessageType;
    }
}

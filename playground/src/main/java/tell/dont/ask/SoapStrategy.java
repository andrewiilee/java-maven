package tell.dont.ask;

public class SoapStrategy extends WebMessageStrategy {
    private String soapMessageType;

    SoapStrategy(String soapMessageType ) {
        super("Soap");
        this.soapMessageType = soapMessageType;
    }

    @Override
    String getData() {
        return getFirstPart() + ", type:" + soapMessageType;
    }
}

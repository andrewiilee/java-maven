package tell.dont.ask;

import java.util.function.Supplier;

public enum AdvanceFactoryEnum {

    RESTONE(RestOne::new),
    SOAPTWO(SoapTwo::new);
    private Supplier<WebMessageStrategy> instantiator;

    AdvanceFactoryEnum(Supplier<WebMessageStrategy> instantiator) {
        this.instantiator = instantiator;
    }

    public WebMessageStrategy getInstance() {
        return instantiator.get();
    }
}

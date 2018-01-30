package tell.dont.ask;

import java.util.EnumSet;

public enum ReflectionEnum {

    RESTONE("tell.dont.ask.RestOne"),
    SOAPTWO("tell.dont.ask.SoapTwo");

    private final String className;

    ReflectionEnum(String className) {
        this.className = className;
    }

    public static WebMessageStrategy getWebMessage(String input) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        ReflectionEnum enumType = EnumSet.allOf(ReflectionEnum.class)
                .stream()
                .filter(p -> p.name().equalsIgnoreCase(input))
                .findAny()
                .orElseThrow(() -> new ClassNotFoundException(input + " is not a known class"));

        Class clazz = Class.forName(enumType.className);
        return (WebMessageStrategy) clazz.newInstance();
    }
}

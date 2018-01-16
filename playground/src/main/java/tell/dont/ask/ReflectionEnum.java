package tell.dont.ask;

import java.util.Arrays;

public enum ReflectionEnum {

    RESTONE("tell.dont.ask.RestOne"),
    SOAPTWO("tell.dont.ask.SoapTwo");

    private final String name;

    ReflectionEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static WebMessageStrategy getWebMessage(String input) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return web(Arrays.stream(ReflectionEnum.values())
                .filter(e -> e.name().equalsIgnoreCase(input)).findAny().orElse(null).getName());
    }

    private static WebMessageStrategy web(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName(className);
        return (WebMessageStrategy) clazz.newInstance();
    }
}

package tell.dont.ask;

import java.util.Arrays;

public class TellDontAsk {

    public static void main(String args[]) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String input = "restone";
        System.out.println(getMatch(input));

        WebMessageStrategy web;
        web = web(getMatch(input));
        System.out.println(web.getData());

        web = web(getMatch("soaptwo"));
        System.out.println(web.getData());
    }


    private static String getMatch(String input ) {
        return Arrays.stream(WebOperations.values())
                .filter(e -> e.name().equalsIgnoreCase(input)).findAny().orElse(null).getName();
    }
    private static WebMessageStrategy web(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName(className);
        return (WebMessageStrategy) clazz.newInstance();
    }
}

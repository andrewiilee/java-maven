package tell.dont.ask;

public class ReflectionMain {

    public static void main(String args[]) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        WebMessageStrategy web;
        web = ReflectionEnum.getWebMessage("restone");
        System.out.println(web.getData());

        web = ReflectionEnum.getWebMessage("sOaPtWo");
        System.out.println(web.getData());

        web = ReflectionEnum.getWebMessage("sOaPthReE");
        System.out.println(web.getData());
    }
}

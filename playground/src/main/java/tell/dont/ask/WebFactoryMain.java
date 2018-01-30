package tell.dont.ask;

public class WebFactoryMain {

    public static void main(String args[]) throws ClassNotFoundException {
        WebMessageStrategy web;

        web = WebFactoryEnum.RESTONE.getWebMessage();
        System.out.println(web.getData());

        web = WebFactoryEnum.SOAPTWO.getWebMessage();
        System.out.println(web.getData());

        System.out.println("");
        System.out.println("Advance Factory");
        web = AdvanceFactoryEnum.RESTONE.getInstance();
        System.out.println(web.getData());

        web = AdvanceFactoryEnum.SOAPTWO.getInstance();
        System.out.println(web.getData());
    }
}

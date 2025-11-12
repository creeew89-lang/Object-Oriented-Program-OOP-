package NetworkdefenderOPP;

public class Main {
    public static void main(String []args){
        Router router = new Router("Cisco", "192.168.0.1", 4);
        router.displayRouterInfo();
    }
}

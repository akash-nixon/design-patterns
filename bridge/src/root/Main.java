package root;

public class Main {
    public static void main(String[] args){
        tv obj=new tv();
        test(obj);
        test(new radio());
    }
    public static void test(device device){
        System.out.println("Basic remote");
        basicremote br = new basicremote(device);
        br.power();
        device.status();
        System.out.println("Adv remote");
        advremote ar = new advremote(device);
        ar.power();
        ar.mute();
        device.status();
    }
}

package root;

public class advremote extends basicremote{
    public advremote(device device){
    super.device=device;
    }
    public void mute(){
        System.out.println("Remote:mute");
        int vol=0;
        device.setVol(vol);
    }
}

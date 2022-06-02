package root;

public class basicremote implements remote{
    protected device device;
    public basicremote(){}
    public basicremote(device device){
        this.device=device;
    }

    @Override
    public void volumedown() {
        System.out.println("Remote:Volumedown");
        device.setVol(device.getVol()-1);
    }

    @Override
    public void volumeup() {
        System.out.println("Remote:VolumeUp");
        device.setVol(device.getVol()+1);
    }

    @Override
    public void channelnext() {
        System.out.println("Remote:Channel Next");
        device.setChannel(device.getChannel()+1);
    }
    @Override
    public void channelprev() {
        System.out.println("Remote:Channel Next");
        device.setChannel(device.getChannel()-1);
    }

    @Override
    public void power() {
        System.out.println("Remote:power");
        if(device.isEnabled()==1)
            device.disable();
        else
            device.enable();
    }
}

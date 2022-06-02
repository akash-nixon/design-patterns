package root;

public class tv implements device{


    int pow = 0;
    int vol=50;
    int chan=1;
    @Override
    public int isEnabled(){
        return pow;
    }
    @Override
    public void enable(){
        pow=1;
    }
    @Override
    public void disable(){
        pow=0;
    }
    @Override
    public int getVol(){
        return vol;
    }
    @Override
    public void setVol(int vol){
        this.vol=vol;
    }
    @Override
    public int getChannel(){
        return chan;
    }

    @Override
    public void setChannel(int chan) {
        this.chan=chan;

    }

@Override
    public void status() {
        System.out.println("TV");
        if (pow == 1)
            System.out.println("I'm turned on");
        else
            System.out.println("I'm turned off");
        System.out.println("Current Vol:" + vol);
        System.out.println("Current Channel" + chan);
    }
}
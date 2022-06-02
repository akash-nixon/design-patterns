package root;

public interface device {
    int isEnabled();
    void enable();
    void disable();
    int getVol();
    void setVol(int vol);
    int getChannel();
    void setChannel(int chan);
    void status();
}

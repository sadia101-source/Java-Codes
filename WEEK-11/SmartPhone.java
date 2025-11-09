package week_11;

public class SmartPhone implements SmartDevice{
    @Override
    public void powerOn() {
        System.out.println("SmartPhone is powering on...");
    }

    @Override
    public void connectWiFi() {
        System.out.println("SmartPhone is connecting to WiFi...");
    }
}

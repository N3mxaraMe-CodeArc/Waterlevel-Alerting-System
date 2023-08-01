import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.putAlarm(new Alarm("Alarm 1"));
        controlPanel.putDisplay(new Display());
        controlPanel.putSMSManger(new SMSManager());

        Random rand = new Random();
        while (true) {
            controlPanel.setData(rand.nextInt(101));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            System.out.println("===========================");
        }
    }
}
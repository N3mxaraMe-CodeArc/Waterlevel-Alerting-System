public class Alarm extends Observer {
    String alarmId;

    public Alarm(String alarmId) {
        this.alarmId = alarmId;
    }

    public void update(int waterLevel) {
        System.out.println("Alarm id :" + alarmId + " " + (waterLevel > 50 ? "ON" : "OFF"));
    }
}
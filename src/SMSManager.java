public class SMSManager extends Observer {
    public void update(int waterLevel){
        System.out.println("Sending SMS..........."+waterLevel);
    }
}

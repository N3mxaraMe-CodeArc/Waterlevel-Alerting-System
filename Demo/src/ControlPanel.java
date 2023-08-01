public class ControlPanel {
    private Alarm alarm;
    private Display display;
    private SMSManager smsManager;
    private int waterLevel;
    public void putAlarm(Alarm alarm){
        this.alarm = alarm;
    }
    public void putDisplay(Display display){
        this.display = display;
    }
    public void putSMSManger(SMSManager smsManager){
        this.smsManager = smsManager;
    }
    public void notifyObject(){
        alarm.update(waterLevel);
        display.update(waterLevel);
        smsManager.update(waterLevel);
    }
    public void setData(int waterLevel){
        if(this.waterLevel!=waterLevel){
            this.waterLevel = waterLevel;
            notifyObject();
        }
    }
}

import java.time.LocalDateTime;

public class SmartLogger implements Logger{
    private int count = 0;
    @Override
    public void log(String msg) {
        count++;
        String level = "INFO";
        if(msg.toLowerCase().contains("error"))
            level = "ERROR";
        String time = LocalDateTime.now().toString();
        System.out.println(level + "#" + count + " [" + time + "] " + msg);
    }
}

import java.time.LocalDateTime;
import java.util.Locale;

public class SimpleLogger implements Logger{
    @Override
    public void log(String msg) {
        String time = LocalDateTime.now().toString();
        System.out.println("[" + time + "] " + msg);
    }
}

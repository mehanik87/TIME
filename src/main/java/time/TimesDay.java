package time;

/**
 * Created by Администратор on 10.02.2016.
 */
public enum TimesDay {
    MORNING("message.morning"),
    DAY("message.day"),
    NIGHT("message.night"),
    EVENING("message.evening");
    String code;

    TimesDay(String code) {
        this.code = code;

    }

    @Override
    public String toString(){
        return code;
    }
}

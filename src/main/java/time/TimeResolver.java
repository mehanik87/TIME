package time;

import org.apache.log4j.Logger;

/**
 * Created by Администратор on 10.02.2016.
 */
public class TimeResolver {
    final static Logger LOG = Logger.getLogger(TimeResolver.class);
    public TimesDay getDaysTime(int hours) {
        if (hours >= 0 && hours <= 24){
            if (hours >= 6 & hours < 23) {
                if (hours < 9) {
                    LOG.info("get hours: " + hours);
                    return TimesDay.MORNING;
                } else if (hours < 19) {
                    LOG.info("get hours: " + hours);
                    return TimesDay.DAY;
                } else if (hours < 23) {
                    LOG.info("get hours: " + hours);
                    return TimesDay.EVENING;
                }
            } else {
                LOG.info("get hours: " + hours);
                return TimesDay.NIGHT;
            }
        }
        LOG.error("incorrect hours: " + hours);
        throw new IllegalArgumentException();
    }


}

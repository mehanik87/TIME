package time;

import org.apache.log4j.Logger;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Администратор on 10.02.2016.
 */
public class MessageProvider {
    final static Logger LOG = Logger.getLogger(MessageProvider.class);
    public String getLocalMessage(TimesDay timesDay, Locale locale){
        LOG.info("time of day: " + timesDay.toString() + ", locale: " + locale.toString());
        ResourceBundle bundle = ResourceBundle.getBundle("message", locale);
        return bundle.getString(timesDay.toString());
    }
}

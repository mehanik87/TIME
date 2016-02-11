
/**
 * Created by Администратор on 10.02.2016.
 */
import junit.framework.TestCase;
import org.junit.Test;
import time.MessageProvider;
import time.TimesDay;

import java.util.Locale;

public class MessageProviderTest extends TestCase {

    @Test
    public void  testLang() {
        MessageProvider provider = new MessageProvider();
        assertEquals("Good morning, World!", provider.getLocalMessage(TimesDay.MORNING, new Locale("en_US")));
    }
}

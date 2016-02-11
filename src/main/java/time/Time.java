/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;


import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;


/**
 *
 * @author Администратор
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {

        TimeResolver timeResolver = new TimeResolver();
        MessageProvider messageProvider = new MessageProvider();
        String message = messageProvider.getLocalMessage(timeResolver.getDaysTime(LocalTime.now().getHour()), Locale.getDefault());
        System.out.println(message);

    }
}

    
    


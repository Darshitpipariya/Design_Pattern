package Observer_Pattern.listeners;

import java.io.File;
// sends emails upon receiving notification
public class EmailNotificationListener implements EventListener{
    private String email;

    public EmailNotificationListener(String email){
        this.email=email;
    }

    @Override
    public void update(String eventType,File file){
        System.out.println("Email to "+email+": someone has performed "+eventType+" operation with following file: "+file.getName());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemprocess;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Sazzad
 */
public class OnlineActivity {
    
        public void addExtension() throws IOException, URISyntaxException
        {
            if(Desktop.isDesktopSupported())
            {
                Desktop.getDesktop().browse(new URI("https://chrome.google.com/webstore/detail/time-tracker/mokmnbikneoaenmckfmgjgjimphfojkd?hl=en"));
            }
        }
        
        public static void main(String[] args) throws IOException, URISyntaxException {
        
            OnlineActivity  oa = new OnlineActivity();
            oa.addExtension();
            
    }
        public void download() throws IOException, URISyntaxException
        {
            String command = "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome\" chrome-extension://mokmnbikneoaenmckfmgjgjimphfojkd/options.html";
            Process p = Runtime.getRuntime().exec(command);
//chrome-extension://mokmnbikneoaenmckfmgjgjimphfojkd/options.html
        }
        
         public void blockWebsite() throws IOException, URISyntaxException
        {
             String command = "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome\" chrome-extension://mokmnbikneoaenmckfmgjgjimphfojkd/options.html";
            Process p = Runtime.getRuntime().exec(command);
        }
    
}

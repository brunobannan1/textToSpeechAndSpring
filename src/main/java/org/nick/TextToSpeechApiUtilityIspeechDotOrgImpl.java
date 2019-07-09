package org.nick;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

public class TextToSpeechApiUtilityIspeechDotOrgImpl implements TextToSpeechApiUtility {

    private String voice = "rurussianmale";
    private String format = "wav";
    private String apikey = "hidden";
    private static final int TIMEOUT = 25000;

    public URL getSavedFileName(String text) {
        Properties properties = new Properties();
        URL fileURL = null;
        try {
            properties.load(this.getClass().getResourceAsStream("secure.properties"));
            apikey = properties.getProperty("apikey");
            URL url = new URL("http://api.ispeech.org/api/rest?action=convert&text=" + text + "&apikey=" + apikey + "&format=" + format + "&voice=" + voice);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(TIMEOUT);
            connection.setReadTimeout(TIMEOUT);
            return fileURL;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileURL;
    }
}

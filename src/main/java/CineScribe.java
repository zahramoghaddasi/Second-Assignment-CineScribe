import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
public class CineScribe {
    // TODO:: add your api key here -->
    public static String API_KEY = "YOUR API_KEY";
    public static void main(String[] args){
        // TODO:: complete main function -->
    }
    @SuppressWarnings("deprecation")
    /**
     * Retrieves data for the specified movie.
     *
     * @param title the name of the title for which MovieData should be retrieved
     * @return a string representation of the MovieData, or null if an error occurred
     */
    public static String getCineScribeData(String title) throws IOException {
        URL url = new URL("https://www.omdbapi.com/?t="+title+"&apikey="+API_KEY);
        URLConnection Url = url.openConnection();
        Url.setRequestProperty("Authorization", "Key" + API_KEY);
        BufferedReader reader = new BufferedReader(new InputStreamReader(Url.getInputStream()));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine())!=null) {
            stringBuilder.append(line);
        }
        reader.close();
        return stringBuilder.toString();
    }
    public static int getBoxOffice(String infoJson){
        //TODO --> (This function must return the "Box Office" as an Integer -->
        // NOTICE :: you are not permitted to convert this function to return a String instead of an int !!!
        int result = 0;
        return result;
    }
    public static int getYear(String infoJson){
        //TODO --> (This function must return the "Year" as an Integer)  -->
        int result = 0;
        return result;
    }
    public static String getValue(String infoJson){
        //TODO --> (This function must return the value in the "Ratings" part as 'percentage(%)'
        // where the source is "Rotten Tomatoes")  -->
        String result = "";
        return result;
    }
}
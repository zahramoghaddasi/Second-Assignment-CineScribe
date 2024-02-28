import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.util.ArrayList;
public class Movie {
    public static final String API_KEY = "Your API_KEY";   // TODO:: <-- add your api key about Movie here
    int BoxOffice;
    ArrayList<String> WatchList;
    int Year;
    String Value;

    // Constructor
    public Movie(ArrayList<String> WatchList , int Year , String Value){
        this.WatchList = WatchList;
        this.Year = Year;
        this.Value = Value;
    }

    // getter & setter
    // for instance -->
    public int getBoxOffice() {
        return BoxOffice;
    }
    public void setBoxOffice(int boxOffice) {
        BoxOffice = boxOffice;
    }
    // TODO:: implement another getters and setters based on your constructor -->
    @SuppressWarnings("deprecation")
    /**
     * Retrieves data for the specified movie.
     *
     * @param title the name of the title for which MovieData should be retrieved
     * @return a string representation of the MovieData, or null if an error occurred
     */

    public String getMovieData(String title) throws IOException {
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
        // you can handle an error if the chosen movie is not found --->
        return stringBuilder.toString();
    }
    public int getBoxOfficeViaApi(String MoviesInfoJson){
        //TODO --> (This function must return the "Box Office" as an Integer -->
        // NOTICE :: you are not permitted to convert this function to return a String instead of an int !!!
        int result = 0;
        return result;
    }
    public int getYearViaApi(String MoviesInfoJson){
        //TODO --> (This function must return the "Year" as an Integer)  -->
        int result = 0;
        return result;
    }
    public String getValueViaApi(String MoviesInfoJson){
        //TODO --> (This function must return the value in the "Ratings" part as 'percentage(%)'
        // where the source is "Rotten Tomatoes")  -->
        String result = "";
        return result;
    }
    public String TypeOfMovie(String MovieInfoJson){
        // TODO --> (This function must check the type of the movie) -->
        String result = "";
        return result;
    }
    public void addToWatchList(String movie){
        // TODO --> (This function must add movie to watch List) -->
    }
}
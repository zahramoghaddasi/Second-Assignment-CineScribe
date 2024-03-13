import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.util.ArrayList;
public class Movie {
    public static final String API_KEY = "26f50679";   // TODO --> add your api key about Movie here
    int ImdbVotes;
    ArrayList<String> actorsList;
    String rating;
    String Year;
    String time;
    String released;
    String gener;
    String name;
    String language;
    String Country;
    String type;
    String plot;

    public Movie(ArrayList<String> actorsList, String rating, int ImdbVotes ,String Year,String time ,String released ,String gener  ,String name ,String language ,String Country ,String type,String plot ){
        this.actorsList = actorsList;
        this.ImdbVotes = ImdbVotes;
        this.rating = rating;
        this.Year = Year;
        this.time = time;
        this.released = released;
        this.gener = gener;
        this.name = name;
        this.language = language;
        this.Country = Country;
        this.type = type;
        this.plot = plot;
    }

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
        String error = stringBuilder.toString();
        if(error.substring(error.length() - 27).equals("\"Error\":\"Movie not found!\"}")) {
                return "Please check movie name !!!";
        }
        else
            return error;
    }
    public int getImdbVotesViaApi(String moviesInfoJson){
        //TODO --> (This function must change and return the "ImdbVotes" as an Integer)

        JSONObject imdbvote = new JSONObject(moviesInfoJson);
        int ImdbVotes = Integer.parseInt(imdbvote.getString("imdbVotes").replace("," , ""));
        return ImdbVotes;
    }

    public String getYear(String moviesInfoJson){
        String Year = "";
        try {
            JSONObject dateOfYear = new JSONObject(moviesInfoJson);
            if (dateOfYear.has("Year")) {
                Year = dateOfYear.getString("Year");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "YEAR OF PRODUCTION: " + Year;
    }

    public String getRuntime(String moviesInfoJson){
        String time = "";
        try {
            JSONObject Time = new JSONObject(moviesInfoJson);
            if (Time.has("Year")) {
                time = Time.getString("Year");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "YEAR OF RUNTIME: " + time;
    }
    public String getReleased(String moviesInfoJson){
        String released = "";
        try {
            JSONObject date = new JSONObject(moviesInfoJson);
            if (date.has("Released")) {
                released = date.getString("Released");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "REleased: " + released;
    }
    public String getGener(String moviesInfoJson){
        String gener = "";
        try {
            JSONObject Genere = new JSONObject(moviesInfoJson);
            if (Genere.has("Genre")) {
                gener = Genere.getString("Genre");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Genre: " + gener;
    }
    public String  getWriter(String moviesInfoJson){
        String name = "";
        try {
            JSONObject Writer = new JSONObject(moviesInfoJson);
            if (Writer.has("Writer")) {
                name = Writer.getString("Writer");
            }
        }
             catch (Exception e) {
                e.printStackTrace();
            }
        return "Writer: " + name;
        }

        public String getDirector(String moviesInfoJson){
        String name ="";
        try{
            JSONObject directorobj = new JSONObject(moviesInfoJson);
            if (directorobj.has("Director")) {
                name = directorobj.getString("Director");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "Director: " + name;
        }
        public String getLanguage(String moviesInfoJson){
            String language = "";
            try {
                JSONObject Language = new JSONObject(moviesInfoJson);
                if (Language.has("Language")) {
                    language = Language.getString("Language");
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return "Language: " + language;
        }

        public String getCountry(String moviesInfoJson){
            String Country = "";
            try {
                JSONObject country = new JSONObject(moviesInfoJson);
                if (country.has("Country")) {
                    Country = country.getString("Country");
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return "Country: " + Country;
        }
    public String getType(String moviesInfoJson){
        String type = "";
        try {
            JSONObject Typeobj = new JSONObject(moviesInfoJson);
            if (Typeobj.has("Type")) {
                type = Typeobj.getString("Type");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "Type: " + type;
    }
    public String getPlot(String moviesInfoJson){
        String plot = "";
        try {
            JSONObject plotobj = new JSONObject(moviesInfoJson);
            if (plotobj.has("Plot")) {
                plot = plotobj.getString("Plot");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "Plot: " + plot;
    }

    public String getRatingViaApi(String moviesInfoJson){
        //TODO --> (This function must return the rating in the "Ratings" part
        // where the source is "Internet Movie Database")  -->
        JSONObject jsonArray = new JSONObject(moviesInfoJson);
        JSONArray rate = jsonArray.getJSONArray("Ratings");
        String rating = "";
        for(int i = 0 ; i < rate.length() ; i++){
            JSONObject RAte = rate.getJSONObject(i);
            if(RAte.getString("Source").equals("Internet Movie Database")){
                rating +=  RAte.getString("Value");
            }
        }

        return rating;
    }

    public  String getActorListViaApi(String movieInfoJson){
        //TODO --> (This function must return the "Actors" in actorsList)
        String Actor ="";
        JSONObject actor = new JSONObject(movieInfoJson);
        Actor = actor.getString("Actors");
        return "Actors :" + Actor;

    }
}
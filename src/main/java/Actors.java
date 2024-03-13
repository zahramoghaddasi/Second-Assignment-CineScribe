import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import org.json.JSONObject;
public class Actors {
    public static final String API_KEY = "HwA0+AKJLZhGKrsw3JwnxQ==WHcRZYxbqRdQq8qa";   // TODO --> add your api key about Actors here
    double netWorth;
    Boolean isAlive;
    String date;
    int age;
    String Nationality;
    String GENDER;
    String Date;
    double height;

    public Actors(double netWorth, boolean isAlive , String date , int age , String Nationality , String GENDER , String Date , double height) {
        this.netWorth = netWorth;
        this.isAlive = isAlive;
        this.date = date;
        this.age = age;
        this.Nationality = Nationality;
        this.GENDER = GENDER;
        this.Date = Date;
        this.height = height;

    }

    @SuppressWarnings({"deprecation"})
    public String getActorData(String name) {
        try {
            URL url = new URL("https://api.api-ninjas.com/v1/celebrity?name=" +
                    name.replace(" ", "+") + "&apikey=" + API_KEY);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("X-Api-Key", API_KEY);
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                in.close();
                System.out.println("API Response: " + response.toString());
                return response.toString().substring(1,response.toString().length()-1);
            } else {
                return "Error: " + connection.getResponseCode() + " " + connection.getResponseMessage();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public double getNetWorthViaApi(String actorsInfoJson) {
        double result = 0.0;
        try {
            JSONObject netWorthObj = new JSONObject(actorsInfoJson);
            result = netWorthObj.getDouble("net_worth");
            System.out.println("Net Worth: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String getDateOfBirth(String actorsInfoJson){
        String Date = "";
        try {
            JSONObject dateOfBitth = new JSONObject(actorsInfoJson);
            if (dateOfBitth.has("birthday")) {
                Date = dateOfBitth.getString("birthday");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Date of Birth: " + Date;
    }
    public Double getHeight(String actorsInfoJson){
        double height = 0.0;
        try {
            JSONObject heightobj = new JSONObject(actorsInfoJson);
            height = heightobj.getDouble("height");
            System.out.println("Height Of Person: " + height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return height;
    }
    public String getGender(String actorsInfoJson){
        String GENDER = "";
        try {
            JSONObject genderobj = new JSONObject(actorsInfoJson);
            if (genderobj.has("gender")) {
                GENDER  = genderobj.getString("gender");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Gender: " + GENDER  ;
    }
    public String getNationality(String actorsInfoJson){
        String Nationality = "";
        try {
            JSONObject nationalityobj = new JSONObject(actorsInfoJson);
            if (nationalityobj.has("nationality")) {
                Nationality  = nationalityobj.getString("nationality");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Nationality: " + Nationality  ;
    }
    public int getAge(String actorsInfoJson){
        int age = 0;
        try{
            JSONObject Age = new JSONObject(actorsInfoJson);
            age = Age.getInt("age");
            System.out.println("Age Of Person: " + age);
        }
             catch (Exception e) {
                e.printStackTrace();
            }
        return age;
    }
    public boolean isAlive(String actorsInfoJson) {
        boolean statues = false;
        try {
            JSONObject live = new JSONObject(actorsInfoJson);
            statues = live.getBoolean("is_alive");
            System.out.println("Is Alive: " + statues);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statues;
    }

    public String getDateOfDeathViaApi(String actorsInfoJson) {
        String date = "";
        try {
            JSONObject dateOfDeath = new JSONObject(actorsInfoJson);
            if (dateOfDeath.has("death")) {
                date = dateOfDeath.getString("death");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return date;
    }
}


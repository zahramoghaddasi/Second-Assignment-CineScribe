import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        runMenu();
    }
    public static void runMenu() throws IOException{
        int ex = 0;
        while(ex == 0) {
            System.out.print("Hi Dear, Welcome to My program:)\n" +
                    "My app is for finding the profile of your favorite movie and actor\n" +
                    "1.Sreach Your favorite Movie\n" + "2.Sreach Your favorite Actor");
            Scanner input = new Scanner(System.in);
            int input1 = input.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();

            if (input1 == 1) {
                System.out.print("Name Of Movie: ");
                Scanner MovieName = new Scanner(System.in);
                String NameM = MovieName.nextLine();
                Movie movie = new Movie(new ArrayList<>(), "", 0);
                String check = movie.getMovieData(NameM);
                while (check.equals("Please check movie name !!!")){
                    System.out.println(check);
                    NameM = input.next();
                    check = movie.getMovieData(NameM);
                }
                System.out.println(NameM);
                System.out.println(movie.getGener(movie.getMovieData(NameM)));
                System.out.println(movie.getLanguage(movie.getMovieData(NameM)));
                System.out.println(movie.getCountry(movie.getMovieData(NameM)));
                System.out.println(movie.getDirector(movie.getMovieData(NameM)));
                System.out.println(movie.getYear(movie.getMovieData(NameM)));
                System.out.println(movie.getReleased(movie.getMovieData(NameM)));
                System.out.println(movie.getRuntime(movie.getMovieData(NameM)));
                System.out.println(movie.getImdbVotesViaApi(movie.getMovieData(NameM)));
                System.out.println(movie.getRatingViaApi(movie.getMovieData(NameM)));
                System.out.println(movie.getDirector(movie.getMovieData(NameM)));
                System.out.println(movie.getWriter(movie.getMovieData(NameM)));
                System.out.println(movie.getActorListViaApi(movie.getMovieData(NameM)));
                System.out.println(movie.getPlot(movie.getMovieData(NameM)));
                System.out.println("press any key");
                Scanner Menu = new Scanner(System.in);
                ex +=1 ;
            }

            else if (input1 == 2){
                System.out.print("Name Of Actor : ");
                Scanner ActorName = new Scanner(System.in);
                String NameA = ActorName.nextLine();
                Actors actor = new Actors("",false);
                System.out.println(NameA);
                System.out.println(actor.getGender(actor.getActorData(NameA)));
                System.out.println(actor.getNationality(actor.getActorData(NameA)));
                System.out.println(actor.getAge(actor.getActorData(NameA)));
                System.out.println(actor.getDateOfBirth(actor.getActorData(NameA)));
                System.out.println(actor.getHeight(actor.getActorData(NameA)));
                System.out.println(actor.getNetWorthViaApi(actor.getActorData(NameA)));
                System.out.println(actor.isAlive(actor.getActorData(NameA)));
                System.out.println(actor.getDateOfDeathViaApi(actor.getActorData(NameA)));
                System.out.println("press any key");
                Scanner Menu = new Scanner(System.in);
                ex += 1;
            }
        }
    }
    }

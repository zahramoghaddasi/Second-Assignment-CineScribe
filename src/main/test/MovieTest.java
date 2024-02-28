import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
public class MovieTest {
    static String data1 , data2;

    @BeforeAll
    static void setUp() throws IOException {
        data1 = Movie.getMovieData("maze runner");  // movie
        data2 = Movie.getMovieData("this is us");   // series
    }
    @Test
    void getImdbVotesViaApi1() {
        assertEquals(502247, Movie.getImdbVotesViaApi(data1));
    }
    @Test
    void getImdbVotesViaApi2() {
        assertEquals(156396, Movie.getImdbVotesViaApi(data2));
    }
    @Test
    void getRatingViaApi1() {
        assertEquals("6.8/10", Movie.getRatingViaApi(data1));
    }
    @Test
    void getRatingViaApi2() {
        assertEquals("8.7/10",Movie.getRatingViaApi(data2));
    }
}

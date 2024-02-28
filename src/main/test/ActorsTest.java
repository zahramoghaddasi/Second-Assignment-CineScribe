import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ActorsTest {
    static String data1 , data2;
    @BeforeAll
    static void setUp() {
        data1 = Actors.getActorData("jennifer lawrence");
        data2 =  Actors.getActorData("robin williams");
    }
    @Test
    void getNetWorthViaApi1() {
        assertEquals(160000000,Actors.getNetWorthViaApi(data1));
    }
    @Test
    void IsAlive1() {
        assertEquals(true,Actors.isAlive(data1));
    }
    @Test
    void getNetWorthViaApi2() {
        assertEquals(50000000,Actors.getNetWorthViaApi(data2));
    }
    @Test
    void IsAlive2() {
        assertEquals(false,Actors.isAlive(data2));
    }
    @Test
    void getDateOfDeathViaApi2() {
        assertEquals("2014-08-11", Actors.getDateOfDeathViaApi(data2));
    }
}

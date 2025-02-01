import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.Application;

public class AppTest {
    @Test
    public void TestApp() {
        Application myApp = new Application();

        String result = myApp.getStatus();

        assertEquals("OK", result);
    }
}

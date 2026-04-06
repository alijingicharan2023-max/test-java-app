import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App app = new App();

    @Test
    public void testInvalidEmail() {
        assertEquals("Invalid email format",
                app.registerUser("John", "wrongemail", "123456"));
    }
}
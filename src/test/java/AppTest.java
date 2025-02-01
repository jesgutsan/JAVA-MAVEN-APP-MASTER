public class AppTest {
    @Test
    public void TestApp() {
        Application myApp = new Application();

        String result = myApp.getStatus();

        assertEquals("OK", result);
    }
}

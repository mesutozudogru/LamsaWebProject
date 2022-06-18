package utilities;

/**
 * @author mozudogru
 * @project LamsaWebProject
 */


public class BrowserUtils {

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

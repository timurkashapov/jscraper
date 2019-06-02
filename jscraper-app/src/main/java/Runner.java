import engine.ScraperFacade;
import r.R;

/**
 *
 */
public class Runner {

    private static final ScraperFacade scraperFacade = new ScraperFacade();
    private static final Runner runner = new Runner();

    public static void main(String[] args) {
        System.out.println(getRunner().getScraperFacade().scrape(args[0]));
    }

    private static Runner getRunner() {
        return runner;
    }

    private ScraperFacade getScraperFacade() {
        return scraperFacade;
    }

}

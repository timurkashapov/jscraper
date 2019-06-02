import com.shako.scraper.data.InputData;
import com.shako.scraper.engine.ScraperEngine;
import com.shako.scraper.engine.ScraperFacade;
import org.junit.jupiter.api.Test;
import com.shako.scraper.r.R;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScraperTest {

    @Test
    public void scrapeHtmlTitle() {
        ScraperEngine scraperEngine = new ScraperEngine();
        String htmlTitle = scraperEngine.scrape(R.exapmleUrl);
        assertNotNull(htmlTitle);
        assertTrue(!htmlTitle.isEmpty());
    }

    @Test
    public void search() {
        ScraperFacade scraperFacade = new ScraperFacade();
        InputData inputData = new InputData(R.exapmleUrl);
        assertNotNull(scraperFacade.search(inputData));
    }
}

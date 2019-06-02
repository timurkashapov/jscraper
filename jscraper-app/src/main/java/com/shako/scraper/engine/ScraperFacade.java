package com.shako.scraper.engine;

import com.shako.scraper.data.InputData;
import com.shako.scraper.data.OutputData;

public class ScraperFacade {
    private ScraperEngine scraperEngine;

    {
        scraperEngine = new ScraperEngine();
    }

    public ScraperFacade() {}

    public OutputData search(InputData inputData) {
        return getScraperEngine().search(inputData);
    }

    public String scrape(final String url) {
        return getScraperEngine().scrape(url);
    }

    public ScraperEngine getScraperEngine() {
        return scraperEngine;
    }
}

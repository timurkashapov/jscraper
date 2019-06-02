package engine;

import data.InputData;
import data.OutputData;
import data.format.OutputDataFormat;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ScraperEngine {

    private InputData inData;
    private OutputData outData;
    private OutputDataFormat outputDataFormat;

    public ScraperEngine() {}
    public ScraperEngine(InputData inData) {
        this.inData = inData;
    }

    public OutputData search(InputData inputData) {
        return null;
    }

    public String scrape(final String url) {
        Document document = Jsoup.parse(getStringHtmlByUrl(url));
        return document.title();
    }

    public String getStringHtmlByUrl(final String url) {
        URL objUrl;
        StringBuilder result = new StringBuilder();
        try {
            objUrl = new URL(url);
            URLConnection urlConnection = objUrl.openConnection();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while (( line = bufferedReader.readLine()) != null) {
                result.append(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            return result.toString();
        }
        return result.toString();
    }
}

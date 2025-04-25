// TextBasedSearchEngine.java
import java.io.*;
import java.net.*;

public class TextBasedSearchEngine {
    private String searchEngine;

    public TextBasedSearchEngine(String searchEngine) {
        this.searchEngine = searchEngine;
    }

    public void doSearch(String queryString) {
        try {
            // Open a URL connection
            URL url = new URL(searchEngine);
            URLConnection connection = url.openConnection();
            connection.setDoOutput(true);

            // Write the query string to the search engine
            PrintStream ps = new PrintStream(connection.getOutputStream());
            ps.println(queryString);
            ps.close();

            // Read the result
            DataInputStream input = new DataInputStream(connection.getInputStream());
            String inputLine = null;
            while ((inputLine = input.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        QueryStringFormatter formatter = new QueryStringFormatter("http://search.yahoo.com/search");
        formatter.addQuery("newwindow", "1");
        formatter.addQuery("q", "Xingchen Chu & Rajkumar Buyya");

        // Search it via Yahoo
        TextBasedSearchEngine search = new TextBasedSearchEngine(formatter.getEngine());
        search.doSearch(formatter.getQueryString());
    }
}
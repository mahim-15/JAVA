import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

public class QueryStringFormatter {
    private String baseURL;
    private Map<String, String> queryParams;

    public QueryStringFormatter(String baseURL) {
        this.baseURL = baseURL;
        this.queryParams = new LinkedHashMap<>();
    }

    public void addQuery(String key, String value) {
        try {
            queryParams.put(URLEncoder.encode(key, "UTF-8"), URLEncoder.encode(value, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public String getQueryString() {
        StringBuilder queryString = new StringBuilder();
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            if (queryString.length() > 0) {
                queryString.append("&");
            }
            queryString.append(entry.getKey()).append("=").append(entry.getValue());
        }
        return queryString.toString();
    }

    public String getEngine() {
        return baseURL;
    }
}
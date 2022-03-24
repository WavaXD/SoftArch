package first;

import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    
    private String jsonText = "";
    private JSONArray textArray;

    public JSONBookMetadataFormatter() throws IOException {
        textArray = new JSONArray();
        reset();
    }
    
    @Override
    public BookMetadataFormatter reset() {
        System.out.println("Books");
        return null;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject obj = new JSONObject();
        
        try {
            obj.put("ISBN",b.getISBN());
            obj.put("title",b.getTitle());
            obj.put("Publisher",b.getPublisher());
            obj.put("Author",b.getAuthors());
        } catch (Exception e) {
            e.printStackTrace();
        }
        jsonText = obj.toString();
        textArray.add(jsonText);
        
        return this;
    }

    @Override
    public String getMetadataString() {
        return textArray.toString();
    }

    public JSONArray getJsonArray() {
        return textArray;
    }
}

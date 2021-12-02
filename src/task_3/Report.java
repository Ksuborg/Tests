package task_3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Report {
    static JSONArray test;
    static JSONArray value;
    public static void main(String[] args) throws IOException, ParseException {
        FileReader testsReader = new FileReader(args[0]);
        FileReader valuesReader = new FileReader(args[1]);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObjectTests = (JSONObject) jsonParser.parse(testsReader);
        JSONObject jsonObjectValues = (JSONObject) jsonParser.parse(valuesReader);
        testsReader.close();
        valuesReader.close();

        test = (JSONArray) jsonObjectTests.get("tests");
        value = (JSONArray) jsonObjectValues.get("values");

        System.out.println(writeReport(getResult(test, value)));
    }

    public static JSONObject getResult(JSONArray test, JSONArray value) {
        JSONObject object = new JSONObject();
        object.put("report", values(test, value));
        return object;
    }

    public static List<JSONObject> values(JSONArray values, JSONArray value) {
        List<JSONObject> obj = new ArrayList<>();
        for (Object tes : values) {
            JSONObject result = new JSONObject();
            JSONObject t = (JSONObject) tes;
            if (t.get("id") != null) {
                result.put("id", t.get("id"));
                result.put("title", t.get("title"));
                for (Object val : value) {
                    JSONObject v = (JSONObject) val;
                    if (t.get("id").equals(v.get("id"))) {
                        result.put("value", v.get("value"));
                        break;
                    }
                }
                if (result.get("value") == null) {
                    result.put("value", "");
                }
            }
            if (t.get("values") != null) {
                result.put("values", values((JSONArray) t.get("values"), value));
            }
            obj.add(result);
        }
        return obj;
    }
    public static String writeReport(JSONObject json) {
        File file = new File(System.getProperty("user.dir") + "report.json");
        System.out.println(file.getAbsolutePath());
        try (FileWriter writer = new FileWriter(file)) {
            json.writeJSONString(writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        return "report created";
    }
}
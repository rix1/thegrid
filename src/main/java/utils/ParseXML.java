package utils;

import android.util.Log;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.ExecutionException;

public class ParseXML {

    public static double getLatestValue(){

        try {
            String data = new GetXMLTask().execute("https://api.demosteinkjer.no/meters/0e6e348bfdb74432b6709526527c3d12/latest?seriesType=ActivePlus").get();
            String mValue = StringUtils.substringBetween(data, "<m:value>", "</m:value>");

            return Double.parseDouble(mValue);

        } catch (InterruptedException e) {
            e.printStackTrace();
            return 0.0;
        } catch (ExecutionException e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}

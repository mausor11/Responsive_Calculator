package org.charts;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.Map;
import java.util.TreeMap;

public class Currency {
    public static Map<String,String> getCurrencyTable() {
        Map<String, String> currency = new TreeMap<>();
        try {
            Document document = Jsoup.connect("https://www.x-rates.com/table/?from=USD&amount=1").get();

            for (Element row : document.select("table.ratesTable tr")) {
                if(row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                } else {
                    String ticker = row.select("td:nth-of-type(1)").text();
                    String value = row.select("td:nth-of-type(2)").text();
                    currency.put(ticker, value);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("updated");
        return currency;
    }

}

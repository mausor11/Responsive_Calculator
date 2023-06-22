package org.charts;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main  {
    public static void main(String[] args) throws IOException {

            Document doc = Jsoup.connect("https://www.marketwatch.com/market-data/currencies").get();
            Element euro = doc.getElementsByClass("table__cell w15").first();
            System.out.println("euro: " + euro.text());

    }
}


import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Mustafa Syed Ali

 *
 */

public class Lab {
/**
 *
 * @param args o
 */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        String article1 = "http://erdani.com/tdpl/hamlet.txt";
        String article2 = "https://www.bls.gov/tus/charts/chart9.txt";
        String article3 = "http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt";
       System.out.println(urlToString(article3));
       String str1 = urlToString(article3);
       String[] wordArray = str1.trim().split("\\s+");
       int wordCount = wordArray.length;
       System.out.println("The Word Count in this Article is: " + wordCount);
    }

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

}



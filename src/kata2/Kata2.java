package kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] data = {"uno", "cero", "uno", "uno", "dos", "dos"};
        Histogram histo = new Histogram(data);
        Map<Object, Integer> histogr = histo.getHistogram();
        
        for(Object key : histogr.keySet()){
            System.out.println(key + " --> " + histogr.get(key));
            System.out.println(Arrays.asList(histogr));
        }
    }
    
}

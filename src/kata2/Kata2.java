package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer [] data = {1, 1, 1, 1, 0, 0, 2, 3, 3, 3};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for(int key : histogr.keySet()){
            System.out.println(key + " --> " + histogr.get(key));
            //System.out.println(Arrays.asList(histogram));
        }
    }
    
}

package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] data = {1, 1, 1, 1, 0, 0, 2, 3, 3, 3};
        Histogram histogram = new Histogram(data);
        
        for(int key : histogram.getHistogram().keySet()){
            System.out.println(key + " --> " + histogram.getHistogram().get(key));
            //System.out.println(Arrays.asList(histogram));
        }
    }
    
}

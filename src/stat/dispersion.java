package stat;

import java.util.Arrays;

public class dispersion {


    // MIN
    public static double min(int[] x){
        Arrays.sort(x);
        return x[0];
    }

    // MAX
    public static double max(int[] x){
        Arrays.sort(x);
        return x[x.length-1];
    }

    // RANGE
    public static double range(int[] x){
        Arrays.sort(x);
        double min = x[0];
        double max = x[x.length - 1];
        return max - min;
    }


    // VARIANCE
    public static double variance(int[] x){
        int n = x.length;
        double mean = centralTendency.computeMean(x);
        double summation = 0;
        double variance;
        for(int i=0; i<n; i++){
            double squaredDiff = Math.pow((x[i] - mean),2);
            summation += squaredDiff;
        }
        variance = summation / n;
        return variance;
    }


    // SD
    public static double sd(int[] x){
        int n = x.length;
        double mean = centralTendency.computeMean(x);
        double summation = 0;
        double variance;
        double sd;
        for(int i=0; i<n; i++){
            double squaredDiff = Math.pow((x[i] - mean),2);
            summation += squaredDiff;
        }
        variance = summation / n;
        sd = Math.sqrt(variance);
        return sd;
    }
}

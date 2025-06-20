package stat;

import java.util.Arrays;

public class centralTendency {

    // MEAN
    public static double computeMean(int[] x){
        double summation = 0;
        for (int each : x) {
            summation += each;
        }
        return summation / x.length;
    }

    public static double computeMean(double[] x){
        double summation = 0;
        for (double each : x) {
            summation += each;
        }
        return summation /x.length;
    }
    public static double computeMean(float[] x){
        double summation = 0;
        for (float each : x) {
            summation += each;
        }
        return summation / x.length;
    }

    // MEDIAN
    public static double computeMedian(int[] x){
        Arrays.sort(x);
        int N = x.length;
        if(N % 2 != 0){
            int mid = (( N + 1 ) / 2)-1;
            return x[mid];
        }
        else{
            int mid1 = (N/2) - 1; // formula 1 for finding 1st term
            int mid2 = (N/2); // formula 2 for finding 2nd term
            return (x[mid1] + x[mid2])/2.0; // averages of two terms/ items in the array
        }
    }

    // MODE
    public static int computeMode(int[] x){
        int N = x.length;
        int freq = 0;
        int mode = x[0];
        for(int i=0; i < N-1; i++){
            int tempFreq = 0;
            for(int j=0; j < N; j++){
                if(x[i] == x[j]){
                    tempFreq += 1;
                }
            }
            if(tempFreq > freq) {
                freq = tempFreq;
                mode = x[i];
            }
        }
        return mode;
    }


    public static double computeMode(double[] x){
        int N = x.length;
        int freq = 0;
        double mode = x[0];
        for(int i=0; i < N-1; i++){
            int tempFreq = 0;
            for(int j=0; j < N; j++){
                if(x[i] == x[j]){
                    tempFreq += 1;
                }
            }
            if(tempFreq > freq) {
                freq = tempFreq;
                mode = x[i];
            }
        }
        return mode;
    }
}

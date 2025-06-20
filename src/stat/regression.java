package stat;

public class regression {

     public static double shortcutRegx(int[] x, int[] y){
        int N = x.length;
        if(N == y.length){
            double xMean = centralTendency.computeMean(x);
            double yMean = centralTendency.computeMean(y);
            double xSigma  = 0;
            double ySigma = 0;
            double x2Sigma = 0;
            double y2Sigma = 0;
            double xySigma = 0;
            double regCoeff;
            for(int i = 0; i < N; i++){
                xSigma += x[i];
                ySigma += y[i];
                x2Sigma += Math.pow(x[i],2);
                y2Sigma += Math.pow(y[i],2);
            }
            for(int i = 0; i<N; i++){
                    xySigma += (x[i]*y[i]);
            }
            regCoeff = ((N*xySigma) - (xSigma*ySigma))/((N*y2Sigma) - Math.pow(ySigma,2));
            System.out.println("x = "+ regCoeff*yMean+" + "+regCoeff+" * y + "+xMean);
            return 0;

        }
        else {
            System.out.println("Data length doesn't match.");
            return 0;
        }
    }
}

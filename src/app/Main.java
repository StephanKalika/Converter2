package app;

public class Main {

    private static final double CONV_K = 1.60934;

    public static void main(String[] args) {
        System.out.println("Distance Converter Project v1.0");

        double mls = 10;
        double kilometers = convMilesToKms(mls);
        System.out.println("Result is " + kilometers + " kilometers.");
    }

    private static double convMilesToKms(double mls) {
        return mls * CONV_K;
    }
}

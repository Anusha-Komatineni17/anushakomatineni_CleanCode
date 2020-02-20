public class CompoundInterest {

    public double calculate(double p,float t,float r) {
        return ((p * Math.pow(1.0 + r / 100.0, t)) - p);
    }
}

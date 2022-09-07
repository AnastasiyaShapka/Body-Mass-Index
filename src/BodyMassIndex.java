public class BodyMassIndex {
    public double calculate (double mass, double height){
        double a = 2;
        double result = height / Math.pow(mass, a);

        return result;
    }
}
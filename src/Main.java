public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        double mass = 64;
        double height = 1.72;
        double bmi = service.calculate (height, mass);
        System.out.println("Индекс массы тела: " + bmi);
    }
}

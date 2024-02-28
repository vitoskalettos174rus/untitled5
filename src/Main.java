public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double meter = 1.87;
        int kilogram = 98;

        int index = service.calculate(kilogram, meter);

        System.out.println(index);
    }


}
public class BmiService {

    public int calculate(int kilogram, double meter) {

        double bmi = kilogram / Math.pow(meter, 2);

        //double bmi = kilogram / (meter * meter);

        return (int) bmi;

    }
}


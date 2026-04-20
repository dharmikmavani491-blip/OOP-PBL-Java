// Interface
interface Classify {
    String getDivision(double average);
}

// Implementing class
class Result implements Classify {

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Below First Division";
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Result result = new Result();

        System.out.println(result.getDivision(72)); // First Division
        System.out.println(result.getDivision(55)); // Below First Division
    }
}

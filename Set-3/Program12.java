public class VolumeCalculator {

    // Cube: volume = side^3
    public double calculateVolume(double side) {
        return side * side * side;
    }

    // Rectangular Cube: volume = length * width * height
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Sphere: volume = (4/3) * pi * r^3
    public double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // Main method
    public static void main(String[] args) {

        VolumeCalculator vc = new VolumeCalculator();

        // Cube
        double cubeVolume = vc.calculateVolume(3);
        System.out.println("Volume of Cube: " + cubeVolume);

        // Rectangular Cube
        double rectVolume = vc.calculateVolume(4, 5, 6);
        System.out.println("Volume of Rectangular Cube: " + rectVolume);

        // Sphere
        double sphereVolume = vc.calculateVolume(2.5f);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}

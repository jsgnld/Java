package JAVA.Practice1;

public class Cube implements Shape3D {

    private double side; // Length of the cube's side.
    private double volume; // Last calculated volume.
    private double surfaceArea; // Last calculated surface area.

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        this.volume = Math.pow(side, 3); // Calculate and store the volume.
        return volume;
    }

    @Override
    public double calculateSurfaceArea() {
        this.surfaceArea = 6 * Math.pow(side, 2); // Calculate and store the surface area.
        return surfaceArea;
    }

    @Override
    public double getVolume() {
        return volume; // Return the last calculated volume.
    }

    @Override
    public double getSurfaceArea() {
        return surfaceArea; // Return the last calculated surface area.
    }
}

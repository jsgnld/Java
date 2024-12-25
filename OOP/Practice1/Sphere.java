package JAVA.Practice1;

public class Sphere implements Shape3D {

    private double radius; // Radius of the sphere.
    private double volume; // Last calculated volume.
    private double surfaceArea; // Last calculated surface area.

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        this.volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Calculate and store the volume.
        return volume;
    }

    @Override
    public double calculateSurfaceArea() {
        this.surfaceArea = 4 * Math.PI * Math.pow(radius, 2); // Calculate and store the surface area.
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

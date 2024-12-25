package JAVA.Practice1;

public class MyShape {

    public static void main(String[] args) {
        // Create a Sphere object.
        Shape3D sphere = new Sphere(5); // Instantiate Sphere with a radius of 5.
        sphere.calculateVolume(); // Calculate the volume.
        sphere.calculateSurfaceArea(); // Calculate the surface area.
        System.out.println("Volume of sphere: " + sphere.getVolume()); // Print the volume.
        System.out.println("Surface area of sphere: " + sphere.getSurfaceArea()); // Print the surface area.

        // Create a Cube object.
        Shape3D cube = new Cube(5); // Instantiate Cube with a side length of 5.
        cube.calculateVolume(); // Calculate the volume.
        cube.calculateSurfaceArea(); // Calculate the surface area.
        System.out.println("Volume of cube: " + cube.getVolume()); // Print the volume.
        System.out.println("Surface area of cube: " + cube.getSurfaceArea()); // Print the surface area.
    }
}
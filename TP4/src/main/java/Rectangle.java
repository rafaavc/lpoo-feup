public class Rectangle implements Shape {
    double height, width;
    Rectangle(double h, double w) {
        height = h;
        width = w;
    }

    public double getArea() {
        return height*width;
    }
}

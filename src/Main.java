public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(4);
        shapes[1] = new Square(5);
        shapes[2] = new Square(6);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable) {
                Colorable colorableShape = (Colorable) shape;
                colorableShape.howToColor();
            }
            System.out.println();
        }
    }
}
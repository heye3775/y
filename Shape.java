interface Drawable {
    void draw();
}
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}
class Main {
    public static void main(String[] args) {
        Drawable[] shapes = new Drawable[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();
        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}
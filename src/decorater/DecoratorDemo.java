package decorater;

public class DecoratorDemo {

    public static void main(String[] args) {
        Shape s1;
        s1 = new Circle();
        s1 = new ColorFiller(s1,Color.RED);
        s1 = new LinePainter(s1,Color.PINK);
        s1.draw();
    }


}

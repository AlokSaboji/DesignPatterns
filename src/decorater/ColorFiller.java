package decorater;

public class ColorFiller extends ShapeDecorator {

    private Color color;

    ColorFiller(Shape shape,Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw(){
       this.shapeToBeProtected.draw();
       System.out.println("Color is  now " + this.color);
    }

}

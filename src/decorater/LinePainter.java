package decorater;

public class LinePainter extends ShapeDecorator {

    private Color LineColor;

    LinePainter(Shape shape,Color lineColor){
        super(shape);
        this.LineColor = lineColor;
    }
    @Override
    public void draw(){
        this.shapeToBeProtected.draw();
        System.out.println("Color of the line is " + this.LineColor);
    }


}

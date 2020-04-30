package decorater;

public abstract class ShapeDecorator implements Shape {

    protected Shape shapeToBeProtected;

    ShapeDecorator(Shape shape){
        this.shapeToBeProtected =shape;
    }

}

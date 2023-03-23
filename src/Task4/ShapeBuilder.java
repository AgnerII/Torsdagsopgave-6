package Task4;

import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShapes(Shape s){
         shapes.add(s);
    }
    public double getTotalArea(){
        double total = 0.0;
        for (Shape s:shapes) {
            total += s.getArea();
        }
        return total;
    }

}

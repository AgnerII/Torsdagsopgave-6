package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeBuilderTest {

    Circle c;
    ShapeBuilder shapeBuilder;
    Square s;
    @BeforeEach
    void setUp() {
        c = new Circle(3);
        s = new Square(4.5);
        shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShapes(c);
        shapeBuilder.addShapes(s);
        shapeBuilder.getTotalArea();
    }

    @Test
    void addShapes() {

    }

    @Test
    void getTotalArea() {
        assertEquals(42,shapeBuilder.getTotalArea());
    }
}
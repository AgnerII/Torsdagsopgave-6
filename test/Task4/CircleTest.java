package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle c;
    @BeforeEach
    void setUp() {
        c = new Circle(3);
        c.getArea();
    }

    @Test
    void getArea() {
        assertEquals(28,c.getArea());
    }
}
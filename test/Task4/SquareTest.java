package Task4;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square s;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        s = new Square(3);
        s.getArea();
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        assertEquals(10,s.getArea());
    }
}
import org.example.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    Rectangle rectangle = new Rectangle();
    @Test
    void TestArea(){
        assertEquals(rectangle.getArea(2,10 ),20.0);
    }
    @Test
    void TestParam(){
        assertEquals(rectangle.getperamiter(2,10 ),24.0);
    }
}

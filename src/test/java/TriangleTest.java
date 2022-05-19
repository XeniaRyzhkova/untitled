

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    void triangleTypeTest1() {
        int a = 2;
        int b = 2;
        int c = 2;

        String expected = "equilateral triangle";
        String result = TriangleType.TriangleTypeTest(a, b, c);
        assertEquals(expected, result);
    }
}


public class GetTriangleType {
    public static String getTriangleType(int a, int b, int c) {
        // Check if any side length is zero or negative
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Error";
        }

        // Check if input values satisfy the triangle inequality theorem
        if (a + b <= c || b + c <= a || a + c <= b) {
            return "Error";
        }

        // Check for equilateral triangle
        if (a == b && b == c) {
            return "Equilateral";
        }

        // Check for isosceles triangle
        if (a == b || b == c || a == c) {
            return "Isosceles";
        }

        // If none of the above checks apply, it must be a scalene triangle
        return "Scalene";
    }

}

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GeometryObject[] array = new GeometryObject[]{new triangle(3, 4, 5),
                new circle(5),
                new rectangle(2, 2)};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        array[0].setScale(3);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
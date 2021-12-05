package detect_triangle_test;

import org.testng.annotations.DataProvider;
import triangle.Triangle;

public class DataProvidersDetect {

    @DataProvider
    public static Object [][] detectRectangularProvider () {
        return new Object[][] {
                {new Triangle(3,4,5)},
                {new Triangle(5,4,3)},
                {new Triangle(4,5,3)}
        };
    }

    @DataProvider
    public static Object [][] detectEquilaterialProvider () {
        return new Object[][] {
                {new Triangle(1,1,1)},
                {new Triangle(0,0,0)},
                {new Triangle(3,3,3)},
                {new Triangle(-1,0,1)},
                {new Triangle(-1,-1,-1)}
        };
    }

    @DataProvider
    public static Object [][] detectIsocelesProvider () {
        return new Object[][] {
                {new Triangle(2,2,1)},
                {new Triangle(0,0,0)},
                {new Triangle(1,2,2)},
                {new Triangle(2,1,2)},
                {new Triangle(-1,0,-1)},
                {new Triangle(-1,-1,-1)},
                {new Triangle(1,1,3)},
                {new Triangle(3,1,1)},
                {new Triangle(1,3,1)}
        };
    }

    @DataProvider
    public static Object [][] detectOrdinaryProvider () {
        return new Object[][] {
                {new Triangle(2,3,4)},
                {new Triangle(1,2,3)},
                {new Triangle(2,1,3)},
                {new Triangle(3,2,1)},
                {new Triangle(0,1,2)},
                {new Triangle(1,0,2)},
                {new Triangle(1,2,0)},
                {new Triangle(-2,-3,-4)},
                {new Triangle(0,0,0)}
        };
    }

}

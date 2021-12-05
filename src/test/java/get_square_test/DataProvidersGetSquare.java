package get_square_test;

import org.testng.annotations.DataProvider;
import triangle.Triangle;

public class DataProvidersGetSquare {

    @DataProvider
    public static Object [][] getSquareProvider () {
        return new Object[][] {
                {new Triangle(2,3,4), 2.9047375096555625},
                {new Triangle(3,4,5), 6},
                {new Triangle(1,2,3), 0},
                {new Triangle(0,1,2), Double.NaN},
                {new Triangle(-2,-3,-4), Double.NaN},
                {new Triangle(0,0,0), 0}
        };
    }
}

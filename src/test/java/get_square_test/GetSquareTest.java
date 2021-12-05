package get_square_test;

import detect_triangle_test.DataProvidersDetect;
import org.testng.Assert;
import org.testng.annotations.Test;
import triangle.Triangle;

public class GetSquareTest {

    @Test(dataProviderClass = DataProvidersGetSquare.class, dataProvider = "getSquareProvider")
    public void testDetectRectangular (Triangle _triangle, double result){
        double temp = _triangle.getSquare();
        Assert.assertEquals(temp, result);
    }
}

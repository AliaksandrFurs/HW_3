package detect_triangle_test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import triangle.Triangle;

public class DetectTriangleTest {

    @Test(dataProviderClass = DataProvidersDetect.class, dataProvider = "detectRectangularProvider")
    public void testDetectRectangular (Triangle _triangle){
        int temp = _triangle.detectTriangle();
        Assert.assertEquals(temp, 8);
    }

    @Test(dataProviderClass = DataProvidersDetect.class, dataProvider = "detectEquilaterialProvider")
    public void testDetectEquilaterial (Triangle _triangle){
        //SoftAssert softAssert = new SoftAssert();
        int temp = _triangle.detectTriangle();
        Assert.assertEquals(temp, 3);
    }

    @Test(dataProviderClass = DataProvidersDetect.class, dataProvider = "detectIsocelesProvider")
    public void testDetectIsoceles (Triangle _triangle){
        SoftAssert softAssert = new SoftAssert();
        Boolean triangleIsTrue = _triangle.checkTriangle();
        int temp = _triangle.detectTriangle();

        softAssert.assertTrue(triangleIsTrue == true);
        Assert.assertEquals(temp, 2);
        softAssert.assertAll();
    }

    @Test(dataProviderClass = DataProvidersDetect.class, dataProvider = "detectOrdinaryProvider")
    public void testDetectOrdinary (Triangle _triangle){
        SoftAssert softAssert = new SoftAssert();
        Boolean triangleIsTrue = _triangle.checkTriangle();
        int temp = _triangle.detectTriangle();

        softAssert.assertTrue(triangleIsTrue == true);
        Assert.assertEquals(temp, 4);
        softAssert.assertAll();
    }

}

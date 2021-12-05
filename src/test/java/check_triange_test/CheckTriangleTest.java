package check_triange_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import triangle.Triangle;

public class CheckTriangleTest {

    @Test(dataProviderClass = DataProvidersCheck.class, dataProvider = "checkTriangleAProvider")
    public void checktriangleA (Triangle _triangle){
        Boolean temp = _triangle.checkTriangle();
        Assert.assertTrue(_triangle.getMessage().equals("a<=0") && temp == false, "a<=0");
    }

    @Test(dataProviderClass = DataProvidersCheck.class, dataProvider = "checkTriangleBProvider")
    public void checktriangleB (Triangle _triangle){
        Boolean temp = _triangle.checkTriangle();
        Assert.assertTrue(_triangle.getMessage().equals("b<=0") && temp == false, "b<=0");
    }

    @Test(dataProviderClass = DataProvidersCheck.class, dataProvider = "checkTriangleCProvider")
    public void checktriangleC (Triangle _triangle){
        Boolean temp = _triangle.checkTriangle();
        Assert.assertTrue(_triangle.getMessage().equals("c<=0") && temp == false, "c<=0");
    }

    @Test(dataProviderClass = DataProvidersCheck.class, dataProvider = "checkTriangleAPlusBProvider")
    public void checktriangleAPlusB (Triangle _triangle){
        Boolean temp = _triangle.checkTriangle();
        Assert.assertTrue(_triangle.getMessage().equals("a+b<=c") && temp == false, "a+b<=c");
    }

    @Test(dataProviderClass = DataProvidersCheck.class, dataProvider = "checkTriangleAPlusCProvider")
    public void checktriangleAPlusC (Triangle _triangle){
        Boolean temp = _triangle.checkTriangle();
        Assert.assertTrue(_triangle.getMessage().equals("a+c<=b") && temp == false, "a+c<=b");
    }

    @Test(dataProviderClass = DataProvidersCheck.class, dataProvider = "checkTriangleBPlusCProvider")
    public void checktriangleBPlusC (Triangle _triangle){
        Boolean temp = _triangle.checkTriangle();
        Assert.assertTrue(_triangle.getMessage().equals("b+c<=a") && temp == false, "b+c<=a");
    }

    @Test
    public void triangleIsTrue (){
        Triangle _triangle = new Triangle (2,4,5);
        Boolean triangleIsTrue = _triangle.checkTriangle();
        Assert.assertTrue(triangleIsTrue == true, "Trinagle is true");
    }
}

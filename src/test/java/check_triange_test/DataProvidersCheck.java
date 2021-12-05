package check_triange_test;

import org.testng.annotations.DataProvider;
import triangle.Triangle;

public class DataProvidersCheck {

    @DataProvider
    public static Object [][] checkTriangleAProvider () {
        return new Object[][] {
                {new Triangle(0,1,3)},
                {new Triangle(-1,1,3)},
                //{new Triangle(Double.MIN_VALUE,1,3)}
        };
    }

    @DataProvider
    public static Object [][] checkTriangleBProvider (){
        return new Object [][]{
            { new Triangle(2, 0, 1)},
            { new Triangle(2, -1, 1)},
            //{ new Triangle(2, Double.MIN_VALUE, 1)}
        };
    }

    @DataProvider
    public static Object [][] checkTriangleCProvider (){
        return new Object [][]{
                { new Triangle(2, 2, 0)},
                { new Triangle(2, 2, -1)},
                //{ new Triangle(1, 1, Double.MIN_VALUE)}
        };
    }

    @DataProvider
    public static Object [][] checkTriangleAPlusBProvider (){
        return new Object [][]{
                { new Triangle(1, 1, 2)},
                { new Triangle(1, 1, 3)},
                //{ new Triangle(1, 1, Double.MIN_VALUE)}
        };
    }

    @DataProvider
    public static Object [][] checkTriangleAPlusCProvider (){
        return new Object [][]{
                { new Triangle(1, 3, 2)},
                { new Triangle(1, 4, 2)},
                //{ new Triangle(1, 1, Double.MIN_VALUE)}
        };
    }

    @DataProvider
    public static Object [][] checkTriangleBPlusCProvider (){
        return new Object [][]{
                { new Triangle(3, 1, 2)},
                { new Triangle(4, 1, 2)},
                //{ new Triangle(1, 1, Double.MIN_VALUE)}
        };
    }
}

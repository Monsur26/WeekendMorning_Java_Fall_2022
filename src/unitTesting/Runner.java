package unitTesting;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Runner {
    @BeforeClass
    public static void startOfTest(){
        System.out.println("Test Started!!");
    }
    @Test
    public void testingTwoNumberAddition(){
       int actual=  new MyClass().addTwoNumbers(6,6);
       int expected=12;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testWithOperatorEnum(){
        int actual=new MyClass().performOperation(5,6,operator.ADDITION);
        int expected=11;

        Assert.assertEquals(actual,expected);

    }
    @AfterClass
    public static void teardown(){
        System.out.println("Test Completed!!");
    }


}

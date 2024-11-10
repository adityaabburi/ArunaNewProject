import org.example.NewTestExample;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewTest {

    @Test
    @DisplayName("addition method success")
    public void addtwonumbes() {
        NewTestExample cal = new NewTestExample();
        int value = cal.add(5, 5);
        assertEquals(10, value);
    }
    @Test
    @DisplayName("subtration method success")
    public void subtractiontwonumbers(){
        NewTestExample cal = new NewTestExample();
        int value = cal.subtract(7,5);
        assertEquals(2, value);
    }

    @Test
    @DisplayName("multiplication method success")
    public void multiplytwonumbers(){
        NewTestExample cal = new NewTestExample();
        int value = cal.multiply(4,3);
        assertEquals( 12,value);
    }

    @Test
    @DisplayName("Division method success")
    public void dividtwonumbers(){
        NewTestExample cal = new NewTestExample();
        double value = cal.dividing(6,3);
        assertEquals(2,value);
    }

    @Test
    @DisplayName("Square method success")
    public void squrerootofvalue(){
        NewTestExample cal = new NewTestExample();
        Double value = cal.squareRootOf(8);
        assertNotEquals(2,value);
    }

   @Test
   public void assertvaluecheck(){
        Assert.assertTrue(true);
  }

}

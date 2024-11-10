import org.example.NewTestExample;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewTest {

    @Test
    public void addvalue(){
        Assert.assertTrue(true);
    }
    @Test
    public void addvalue2(){
        Assert.assertTrue(true);
    }
    @Test
    @DisplayName("addition method success")
    public void addtwonumbes() {
        NewTestExample cal = new NewTestExample();
        int value = cal.add(5, 5);
        assertEquals(10, value);
    }





//    @Test
//    public void addvalue3(){
//        Assert.assertTrue(false);
//    }
}

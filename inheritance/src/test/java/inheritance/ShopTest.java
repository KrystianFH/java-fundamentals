package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    @Test
    public void shopTest (){
        Shop test = new Shop("Carters", "clothes for small humans", "$$$");
        assertEquals("Shop" + "{name='Carters', description='clothes for small humans', price='$$$'}", test.toString());
    }

}

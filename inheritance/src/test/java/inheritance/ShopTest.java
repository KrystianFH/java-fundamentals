package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    @Test
    public void testShopToString (){
        Shop test = new Shop("Carters", "clothes for small humans", 3);
        assertEquals("Shop should print out in a string", "Shop{name='Carters', description='clothes for small humans', price='$$$'}", test.toString());
    }

    @Test public void testShopConstructor(){
        Shop test = new Shop("Carters", "clothes for small humans", 3);
        assertEquals("the name of the shop should be set", "Carters", test.getName());
        assertEquals("the description of the shop should be set", "clothes for small humans", test.getDescription());
        assertEquals("the price of the shop should be three dollar signs", "$$$", test.getPrice());
    }
}

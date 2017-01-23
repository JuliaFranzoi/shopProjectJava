import static org.junit.Assert.*;
import org.junit.*;



public class ShopTest {
    Shop shop;
   

  @Before
  public void beforeEach(){
    shop = new Shop(15.00);
  } 
  

  @Test
  public void getFundsTest(){
    assertEquals(15.00, shop.getFunds(), 0.01);
  }
   
}
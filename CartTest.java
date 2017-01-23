import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class CartTest{
  Cart cart;
  Customer customer;
  Item item1;
  Item item2;
  // ArrayList<Item>basket;

  @Before
  public void beforeEach(){
    cart = new Cart();
    item1 = new Item("cheese", 2.00, 2);
    item2 = new Item("1234", 4.00, 2);
    // cart.addToBasket(Item item1);
    // cart.addToBasket(Item item2);
  }
  
 
  @Test
  public void addToBasketTest(){
    cart.addToBasket(item1);
    cart.addToBasket(item2);
    assertEquals(2, cart.countItems());
  }

  @Test
  public void removeItemTest(){
    cart.addToBasket(item1);
    cart.addToBasket(item2);
    cart.removeItem(item2);
    assertEquals(1, cart.countItems());
  }

  @Test
  public void getTotalPriceTest(){
    cart.addToBasket(item1);
    assertEquals(2.00, cart.getTotalPrice(), 0.01);
 }

  @Test
  public void getTotalPriceMoreItemsTest(){
    cart.addToBasket(item1);
    cart.addToBasket(item2);
    assertEquals(6.00, cart.getTotalPrice(), 0.01);
}

  

}
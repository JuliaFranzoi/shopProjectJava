import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;


public class CustomerTest{
  Customer customer;
  Item item;
  Cart cart;

  @Before
  public void beforeEach(){
    item = new Item("cheese", 2.00, 2);
    cart = new Cart();
    customer = new Customer("julia", 10.00);
  }

  @Test
  public void getNameTest(){
    assertEquals("julia", customer.getName());
  }

  @Test
  public void getFundsTest(){
    assertEquals(10.00, customer.getFunds(), 0.01);
  }

  @Test
  public void payForCartTest(){
    cart.addToBasket(item);
    double totalPriceOfCart = cart.getTotalPrice();
    customer.payForCart(totalPriceOfCart);
    assertEquals(8.00, customer.getFunds(), 0.01);
  }

  }



  // @Test
  // public void addToBasketTest(){
  //   customer.addToBasket(item);

  //   assertEquals(1, customer.countItems());
  // }



  // @Test
  // public void DecreaseFundsTest(){
         
  //   assertEquals(10.00, customer.getFunds(), 0.01);
  // }


  // @Test 
  // public void IncreaseFundsTest(){
  //   assertEquals(10.00, customer.getFunds(), 0.01);
  // }


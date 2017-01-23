import java.util.ArrayList;


public class Cart{

  // private Double totalPrice;
  private ArrayList<Item>basket;
  

  public Cart(){
    this.basket = new ArrayList<Item>();
  }


  public void addToBasket(Item item){
    basket.add(item);
  }

  public void removeItem(Item item){
    basket.remove(item);
  }
  
  public int countItems(){
    return basket.size();
  }

  public double getTotalPrice(){
    double totalPrice = 0.0;
    for (Item item : basket){
      totalPrice += item.getPrice();
    }
    return totalPrice;
  }

  // public double getCustomerPay(){
  //   double funds = customer.getFunds();
  //   double price = getTotalPrice();
  //   double newFunds = funds - price;
  //   return newFunds;
  // } 
  
  // public void sale(){
  //   if (customer.getFunds() >= getTotalPrice()){
  //     customer.setFunds(getTotalPrice());
  //   }
  // }
  

}
import java.util.ArrayList;


public class Customer {
    private String name;
    private double funds;
    private ArrayList<Item>itemsBought;
    private Cart cart;
    
   

    public Customer(String name, double funds){
        this.name = name;
        this.funds = funds;
        this.itemsBought = new ArrayList<Item>();
    }
        


    public String getName() {
        return name;
    }
    
    public void setFunds(double newFunds){
        this.funds = newFunds;
    }

    public void payForCart(double totalPriceOfCart){
       if(){
        funds -= totalPriceOfCart;
       } 
    }

    public double getFunds() {
        return funds;
    }

    // public  void updateFunds(){
    //     this.funds = cart.sale();
    // }
    
    
      

}

public class Item{
  private String id;
  private Double price;
  private int quantity;

  public Item(String id, Double price, int quantity){
    this.id = id;
    this.price = price;
    this.quantity = quantity;
  }
   public String getId(){
    return id;
   }
   
  public Double getPrice(){
    return price;
   }
  
  public int getQuantity(){
    return quantity;
  }

 
}
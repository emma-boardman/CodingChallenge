import java.util.*;
import buyable_interface.*;
import fruits.*;


public class ShoppingBasket {
  
  private ArrayList<Buyable> basket;

  public ShoppingBasket(){
    this.basket = new ArrayList<Buyable>();
  }

  public int itemCount(){
    return basket.size();
  }

  public void addToBasket(Buyable item){
  basket.add(item);
  }

  public void clearBasket(){
    basket.clear();
  }
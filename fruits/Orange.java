package fruits;
import discount_behaviours.*;

public class Orange extends Fruit {

public Orange(){
  super();
  productName = "Orange";
  countryOfOrigin = "Turkey";
  price = 1;
  discountBehaviour = new NoDiscount();
}

// product name
      public String getProductName(){
          return productName;
      }

// country of origin

    public String getCountryOfOrigin(){
          return countryOfOrigin;
      }

// price

      public int getPrice(){
        return price ;
      }

// discount behaviour

      public String getDiscountBehaviour(){
        return discountBehaviour.discountStatus();
      }


      }
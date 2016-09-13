package fruits;
import discount_behaviours.*;

public class Lemon extends Fruit {

public Lemon(){
  super();
  productName = "Lemon";
  countryOfOrigin = "Spain";
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
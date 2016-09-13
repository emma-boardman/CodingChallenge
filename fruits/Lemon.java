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
          return "Lemon";
      }


// country of origin

    public String getCountryOfOrigin(){
          return "Spain";
      }

// price

      public int getPrice(){
        return 1;
      }

// discount behaviour

      public String getDiscountBehaviour(){
        return discountBehaviour.discountStatus();
      }

      }
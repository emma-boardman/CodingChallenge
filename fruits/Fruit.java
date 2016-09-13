package fruit;
import discount_behaviours.*;

public class Fruit implements Buyable{

      private String productName;
      private String countryOfOrigin;
      private int price;
      private DiscountBehaviour discountBehaviour;

// product name 
      public String getProductName()
      {
          return productName;
      }

      // public void setName(String productName)
      // {
      //     this.productName = productName;
      // }

// country of origin

      public String getCountryOfOrigin(){
        return countryOfOrigin;
      }

      // public void setCountryOfOrigin(String countryOfOrigin){
      //   this.countryOfOrigin = countryOfOrigin;
      // }

// price

    public int getPrice(){
      return price;
    }

    // public void setPrice(int price){
    //     this.price = price;
    // }

// discount behaviour

    public String getDiscountBehaviour(){
      return discountBehaviour.discountStatus();
    }

    // public void setDiscountBehaviour(DiscountBehaviour newDiscountBehaviour){
    //   discountBehaviour = newDiscountBehaviour;
    // }

  }
}
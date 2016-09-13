package discount_behaviours;

public class NoDiscount implements DiscountBehaviour {
  public String discountStatus() {
    return "no applicable discount";
  }
}
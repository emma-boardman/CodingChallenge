import static org.junit.Assert.*;
import org.junit.*;
import fruits.*;
import discount_behaviours.*;
import shopping_basket.*;
// import register.*;

public class ShoppingBasketTest {

ShoppingBasket shoppingBasket;
Lemon lemon;
Lime lime;
Orange orange;

@Before
public void before() {
  shoppingBasket = new ShoppingBasket();
  lemon = new Lemon();
  lime = new Lime();
  orange = new Orange();
}

@Test
public void basketStartsEmpty(){
  assertEquals(0, shoppingBasket.itemCount());
}

@Test
public void canPutLemonInBasket(){
  shoppingBasket.addToBasket(lemon);
  assertEquals(1, shoppingBasket.itemCount());
}

@Test
public void canPutLimeInBasket(){
  shoppingBasket.addToBasket(lime);
  assertEquals(1, shoppingBasket.itemCount());
}

@Test
public void canRemoveItemfromBasket(){
shoppingBasket.addToBasket(orange);
    assertEquals(1, shoppingBasket.itemCount());
  shoppingBasket.removeItemFromBasket(orange);
  assertEquals(0, shoppingBasket.itemCount());
}


@Test
public void canEmptyBasket() {
  shoppingBasket.addToBasket(orange);
  shoppingBasket.addToBasket(lemon);
  shoppingBasket.addToBasket(lime);
  assertEquals(3, shoppingBasket.itemCount());

  shoppingBasket.clearBasket();
  assertEquals(0, shoppingBasket.itemCount());
}

@Test
public void returnsTotalPrice(){
  shoppingBasket.addToBasket(orange);
  shoppingBasket.addToBasket(lemon);
  shoppingBasket.addToBasket(lime);
  assertEquals(3, shoppingBasket.totalPrice());
}


}
import static org.junit.Assert.*;
import org.junit.*;
import fruits.*;
import discount_behaviours.*;
import shopping_basket.*;

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



}
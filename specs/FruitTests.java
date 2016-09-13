import static org.junit.Assert.*;
import org.junit.*;
import fruits.*;
import discount_behaviours.*;

public class FruitTests {

Lemon lemon;

  @Before
  public void before(){
    lemon = new Lemon();
  }

  @Test
  public void canGetProductName(){
    assertEquals(lemon.getProductName(),"Lemon");
  }

  @Test
  public void canGetCountryOfOrigin(){
    assertEquals(lemon.getCountryOfOrigin(),"Spain");
  }


  @Test
  public void canGetPrice(){
    assertEquals(lemon.getPrice(), 1);
  }


  @Test
  public void canGetDiscountBehaviour(){
    assertEquals(lemon.getDiscountBehaviour(), "no applicable discount");
  }



}
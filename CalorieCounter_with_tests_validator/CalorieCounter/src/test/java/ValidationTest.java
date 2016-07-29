import api.Meal;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by pocok on 7/29/16.
 */

public class ValidationTest {

  @Test
  public void nameShouldNotBeEmpty() {
    Meal testMeal = new Meal("", 200, "1999-07-26");
    assertFalse(testMeal.isValidMeal());
  }

  @Test
  public void shouldReturnTrueForValidMeal() {
    Meal testMeal = new Meal("meal", 200, "1999-07-26");
    assertTrue(testMeal.isValidMeal());
  }

  @Test
  public void calorieShouldNotBeZero() {
    Meal testMeal = new Meal("meal", 0, "1999-07-26");
    assertFalse(testMeal.isValidMeal());
  }

  @Test
  public void dateShouldNotBeEmpty() {
    Meal testMeal = new Meal("meal", 200, "");
    assertFalse(testMeal.isValidMeal());
  }

}

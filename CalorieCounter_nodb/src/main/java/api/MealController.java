package api;

/**
 * Created by pocok on 7/28/16.
 */

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MealController {

  Database mealDb = new Database();

  @RequestMapping(value = "/meals", method = RequestMethod.GET )
  public ArrayList<Meal> allMeals() {
    return mealDb.getList();
  }

  @RequestMapping(value = "/meals", method = RequestMethod.GET, params = {"filter"})
  public ArrayList<Meal> filterMeals(@RequestParam("filter") String date) {
    return mealDb.filterMeals(date);
  }

  @RequestMapping(value = "/meals", method = RequestMethod.POST)
  public Meal addMeal(@RequestBody Meal newMeal) {
    return mealDb.addMeal(newMeal);
  }

  @RequestMapping(value = "/meals/{id}", method = RequestMethod.DELETE)
  public Response deleteMeal(@PathVariable int id) {
    return new Response(mealDb.deleteMeal(id));
  }

}




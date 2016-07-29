package api;

/**
 * Created by pocok on 7/28/16.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MealController {

  @Autowired
  private MealRepo repository;

  @RequestMapping(value = "/meals", method = RequestMethod.GET )
  public List<Meal> allMeals() {
    return repository.findAll();
  }

  @RequestMapping(value = "/meals", method = RequestMethod.GET, params = {"filter"})
  public List<Meal> filterMeals(@RequestParam("filter") String date) {
    return repository.findByDate(date);
  }

  @RequestMapping(value = "/meals", method = RequestMethod.POST)
  public Meal addMeal(@RequestBody Meal newMeal) {
    return repository.insert(newMeal);
  }

  @RequestMapping(value = "/meals/{id}", method = RequestMethod.DELETE)
  public void deleteMeal(@PathVariable String id) {
    if (repository.exists(id)) {
      repository.delete(id);
    }

  }

}




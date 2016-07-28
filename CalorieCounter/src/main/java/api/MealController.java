package api;

/**
 * Created by pocok on 7/28/16.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealController {

  @RequestMapping(value = "/meals", method = RequestMethod.GET)
  public Meal meals(@RequestParam(value="name", defaultValue="World") String name) {
    return new Meal(1, "Chili", 200, "2015");
  }
}


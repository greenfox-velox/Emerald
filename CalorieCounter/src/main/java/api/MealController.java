package api;

/**
 * Created by pocok on 7/28/16.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.ArrayList;

@RestController
public class MealController {

  Database mealDb = new Database();

  @RequestMapping("/meals")
  public ArrayList<Meal> meals() {
    return mealDb.getList();
  }
}




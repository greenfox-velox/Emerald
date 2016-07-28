package api;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by pocok on 7/28/16.
 */
public class Database {

    ArrayList<Meal> mealsList = new ArrayList<>();

    public void fillMeals() {
      mealsList.add(new Meal(1, "Chili", 200, new Date()));
      mealsList.add(new Meal(2, "Csirke", 400, new Date()));
      mealsList.add(new Meal(3, "Oldalas", 500, new Date()));
    }

    public ArrayList<Meal> getList(){
      fillMeals();
      return mealsList;
    }
}

package api;

import java.util.Date;

/**
 * Created by pocok on 7/28/16.
 */
public class Meal{

    private final int id;
    private final String name;
    private final int calories;
    private final Date date;

    public Meal(int id, String name, int calories, Date date) {
      this.id = id;
      this.name = name;
      this.calories = calories;
      this.date = date;
    }

    public int getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public int getCalories() {
      return calories;
    }

    public Date getDate() {
      return date;
    }

}

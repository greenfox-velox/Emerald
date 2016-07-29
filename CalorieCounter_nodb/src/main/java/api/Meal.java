package api;

import java.util.Date;

/**
 * Created by pocok on 7/28/16.
 */
public class Meal{

    private int id;
    private String name;
    private int calories;
    private String date;

    public Meal(){}


  public Meal(int id, String name, int calories, String date) {
      this.id = id;
      this.name = name;
      this.calories = calories;
      this.date = date;
    }

    public void setId(int id) {
      this.id = id;
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

    public String getDate() {
      return date;
    }

}

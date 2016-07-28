package api;

/**
 * Created by pocok on 7/28/16.
 */
public class Meal {

    private final int id;
    private final String name;
    private final int calories;
    private final String date;

    public Meal(int id, String name, int calories, String date) {
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

    public String getDate() {
      return date;
    }


}

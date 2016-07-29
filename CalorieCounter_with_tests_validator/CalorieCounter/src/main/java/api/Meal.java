package api;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by pocok on 7/28/16.
 */
@Document(collection = "meals")
public class Meal {

  @Id
  private String id;
  private String name;
  private int calories;
  private String date;

  public Meal() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public boolean isValidMeal(){
    String nameRegex = "^[a-zA-Z]+$";
    String dateRegex = "^((19|20)\\d\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$";
    return (getName().matches(nameRegex) &&
            getCalories() > 0 &&
            getDate().matches(dateRegex));
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }



  public Meal(String name, int calories, String date) {
    this.name = name;
    this.calories = calories;
    this.date = date;
  }

  @Override
  public String toString() {
    return String.format(
        "Meal[name='%s', calories='%i', date='%s']",
        name, calories, date);
  }

}

//package api;
//
//import java.util.ArrayList;
//import java.util.Date;
//
///**
// * Created by pocok on 7/28/16.
// */
//public class Database {
//
//    public Database(){
//      fillMeals();
//    }
//
//    ArrayList<Meal> mealsList = new ArrayList<>();
//    int id = 3;
//
//    public void fillMeals() {
//      mealsList.add(new Meal(1, "Chili", 200, "07-16"));
//      mealsList.add(new Meal(2, "Csirke", 400, "07-16"));
//      mealsList.add(new Meal(3, "Oldalas", 500, "07-16"));
//    }
//
//    public ArrayList<Meal> getList(){
//      return mealsList;
//    }
//
//    public Meal addMeal(Meal newMeal) {
//      newMeal.setId(++id);
//      mealsList.add(newMeal);
//      return newMeal;
//    }
//
//    public String deleteMeal(int id) {
//      for (Meal meal : mealsList) {
//        if (meal.getId() == id) {
//          mealsList.remove(meal);
//          return "ok";
//        }
//      }
//      return "not found";
//    }
//
//    public ArrayList<Meal> filterMeals(String date){
//      ArrayList<Meal> filteredMeals = new ArrayList<>();
//      for (Meal meal : mealsList) {
//        if(meal.getDate().equals(date)) {
//          filteredMeals.add(meal);
//        }
//      }
//      return filteredMeals;
//    }
//}

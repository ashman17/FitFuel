import java.time.LocalTime;

public abstract class Recommendations {

    public static Meal[] getMealPlan(User usr) {
        Meal breakfast = new Meal("fruit", LocalTime.of(9,30,00), 250);
        Meal lunch  = new Meal("chapati", LocalTime.of(13,00,00), 300 );
        Meal snacks = new Meal("salad", LocalTime.of(17,20,00), 100);
        Meal dinner = new Meal("vegetable", LocalTime.of(20,00,00), 400);
        Meal[] mealPlan = new Meal[4];

        mealPlan[0] = breakfast;
        mealPlan[1] = lunch;
        mealPlan[2] = snacks;
        mealPlan[3] = dinner;

        return mealPlan;
    }
}
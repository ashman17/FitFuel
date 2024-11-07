// import java.io.FileWriter;
import java.time.LocalTime;
// import java.util.Arrays;
// import java.util.Properties;

public class run {
    public static void main(String[] args) throws Exception {
        User ashman = new User("ashman",19,50,152,"ashFire","helloWorld");
        System.out.println(ashman);
        //System.out.println(ashman.getUserInfo());
        //System.out.println(ashman.authInfo.authenticate("ashFire","helloWorld"));
        //System.out.println(ashman.authInfo.changePassword("helloWorld", "helloUniverse"));
        //System.out.println(ashman.authInfo.authenticate("ashFire","helloWorld"));
        //System.out.println(ashman.authInfo.changePassword("helloWorld", "iAmMalware"));
        //System.out.println(Recommendations.getMealPlan(ashman));


        // Properties p = new Properties();
  
        // // add properties to it
        // p.setProperty("name", "Ganesh Chowdhary Sadanala");
        // p.setProperty("email",
        //               "ganeshs.gfg@gmail.com");
  
        // // store the properties to a file
        // p.store(new FileWriter("info.properties"),
        //         "GeeksforGeeks Properties Example");

        //System.out.println(ashman.dietdiary);
        ashman.dietdiary.addRecord(new Meal("salad", LocalTime.now(), 100));
        Meal m = (Meal)ashman.dietdiary.getAllRecords()[0];
        System.out.println(m);

    }
}

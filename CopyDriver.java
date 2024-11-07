import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

import java.time.LocalTime;

public abstract class CopyDriver {

    //custom colors
    static Color backgroundColor = new Color(25,25,26);
    static Color buttonColor = new Color(47,47,48);
    static Color accentColor = new Color(55,148,255);
    static Color primaryTextColor = new Color(255, 255, 255);
    static Color secondaryTextColor = new Color(25, 25, 25);

    //custom border
    static Border buttonBorder = new LineBorder(accentColor, 2, true);

    public static User currentUser  = null;
    public static List<User> users = new ArrayList<User>();
    
    public static User ashman = new User("Ashman Mehra", 19, 54, 152, "ash17", "oop");
    static {
        users.add(ashman);
    }

    public static void main(String[] args) {
        homePage();
    }

    public static  void homePage() {
        JFrame homeFrame = new JFrame("Recommendation System");
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setSize(1500,1000);
        homeFrame.setLayout(new FlowLayout(FlowLayout.CENTER,80,200));
        homeFrame.getContentPane().setBackground(backgroundColor);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800,450));
        panel.setLayout(new GridLayout(3, 1,100,40));
        panel.setBackground(backgroundColor);
        
        JLabel label = new JLabel();
        label.setText("The Fitness and Diet Tracker");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(new Font("Bahnschrift",Font.BOLD,36));
        label.setForeground(primaryTextColor);

        //Login
        JButton loginButton = new JButton ("Login");
        buttonStyle(loginButton, 28);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                homeFrame.setVisible(false);
                loginPage();
            }
        });

        //Sign Up
        JButton signUpButton = new JButton ("Sign Up");
        buttonStyle(signUpButton, 28);
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                homeFrame.setVisible(false);
                signUpPage();
            }
        });

        // //button x that leads to y
        // JButton x = new JButton ("x");
        // buttonStyle(x, 28);
        // x.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         homeFrame.setVisible(false);
        //         y();
        //     }
        // });
        
        panel.add(label);
        panel.add(loginButton);
        panel.add(signUpButton);

        homeFrame.add(panel);

        homeFrame.setVisible(true);
    }

    public static void signUpPage() {
        
        JFrame signUpFrame = new JFrame("Login Page");
        signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signUpFrame.setSize(1500,1000);
        
        signUpFrame.setLayout(new FlowLayout(FlowLayout.CENTER,80,200));
        signUpFrame.getContentPane().setBackground(backgroundColor);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,600));
        panel.setLayout(new GridLayout(8, 2, 20, 40));
        panel.setBackground(backgroundColor);
        
        JLabel label = new JLabel();
        label.setText("Enter your details below");
        label.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        label.setForeground(primaryTextColor);

        panel.add(label);
        panel.add(new JLabel());
        
        JLabel userID = new JLabel("User ID");
        userID.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        userID.setSize(100, 20);
        userID.setLocation(100, 100);
        userID.setForeground(primaryTextColor);
        panel.add(userID);
 
        JTextField tuserID = new JTextField();
        tuserID.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        tuserID.setSize(300, 20);
        tuserID.setLocation(200, 100);
        tuserID.setForeground(secondaryTextColor);
        panel.add(tuserID);

        JLabel password = new JLabel("Password");
        password.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        password.setSize(100, 20);
        password.setLocation(100, 100);
        password.setForeground(primaryTextColor);
        panel.add(password);
 
        JPasswordField tpassword = new JPasswordField();
        tpassword.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        tpassword.setSize(300, 20);
        tpassword.setLocation(200, 100);
        tpassword.setForeground(secondaryTextColor);
        panel.add(tpassword);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        name.setForeground(primaryTextColor);
        panel.add(name);
 
        JTextField tname = new JTextField();
        tname.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        tname.setSize(300, 20);
        tname.setLocation(200, 100);
        tname.setForeground(secondaryTextColor);
        panel.add(tname);

        JLabel age = new JLabel("Age");
        age.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        age.setSize(100, 20);
        age.setLocation(100, 200);
        age.setForeground(primaryTextColor);
        panel.add(age);
 
        JTextField tage = new JTextField();
        tage.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        tage.setSize(300, 20);
        tage.setLocation(200, 200);
        tage.setForeground(secondaryTextColor);
        panel.add(tage);

        JLabel weight = new JLabel("Weight");
        weight.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        weight.setSize(100, 20);
        weight.setLocation(100, 100);
        weight.setForeground(primaryTextColor);
        panel.add(weight);
 
        JTextField tweight = new JTextField();
        tweight.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        tweight.setSize(300, 20);
        tweight.setLocation(200, 100);
        tweight.setForeground(secondaryTextColor);
        panel.add(tweight);

        signUpFrame.add(panel);

        JLabel height = new JLabel("Height");
        height.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        height.setSize(100, 20);
        height.setLocation(100, 100);
        height.setForeground(primaryTextColor);
        panel.add(height);
 
        JTextField theight = new JTextField();
        theight.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        theight.setSize(300, 20);
        theight.setLocation(200, 100);
        theight.setForeground(secondaryTextColor);
        panel.add(theight);

        signUpFrame.add(panel);

        
        // panel.setPreferredSize(new Dimension(400,100));
        //panel.setBackground(new Color(94, 155, 230));
        //panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,50));
        //panel.setBounds(0,0,0,0);

        JButton submitButton = new JButton("Submit");
        buttonStyle(submitButton, 18);
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                User temp = new User(tname.getText(), Integer.valueOf(tage.getText()), Double.valueOf(tweight.getText()), Double.valueOf(theight.getText()), tuserID.getText(), String.valueOf(tpassword.getPassword()));
                users.add(temp);
                signUpFrame.setVisible(false);
                homePage();
            }
        });
         
        signUpFrame.setVisible(true);
    }

    public static void loginPage(){
        
        JFrame loginFrame = new JFrame("Login Page");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(1500,1000);
        
        loginFrame.setLayout(new FlowLayout(FlowLayout.CENTER,80,200));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,250));
        panel.setLayout(new GridLayout(4, 2, 20, 25));
        
        JLabel label = new JLabel();
        label.setText("Enter your details below");
        label.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        panel.add(label);
        panel.add(new JLabel());
        
        JLabel userID = new JLabel("User ID");
        userID.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        userID.setSize(100, 20);
        userID.setLocation(100, 100);
        panel.add(userID);
 
        JTextField tuserID = new JTextField();
        tuserID.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        tuserID.setSize(300, 20);
        tuserID.setLocation(200, 100);
        panel.add(tuserID);

        JLabel password = new JLabel("Password");
        password.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        password.setSize(100, 20);
        password.setLocation(100, 100);
        panel.add(password);

        JPasswordField tpassword = new JPasswordField();
        tpassword.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        tpassword.setSize(300, 20);
        tpassword.setLocation(200, 100);
        panel.add(tpassword);

        JButton submitButton = new JButton("Submit");
        submitButton.setSize(10, 20);
        submitButton.setFont(new Font("Courier New",Font.BOLD,18));
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Iterator<User> it = users.iterator();
                User temp;
                while (it.hasNext()) {
                    temp = it.next();
                    if(temp.authInfo.userID.equals(tuserID.getText())) {
                        if(temp.authInfo.authenticate(tuserID.getText(), String.valueOf(tpassword.getPassword()))) {
                            currentUser = temp;
                            loginFrame.setVisible(false);
                            mainPage();
                        } else {
                            label.setText("Wrong password.");
                            label.setForeground(Color.red);
                            return;
                        }
                    }
                }

                if (currentUser == null) {
                    label.setText("No such user.");
                    label.setForeground(Color.BLUE);
                }
                //loginFrame.setVisible(false);
                //homePage();
            }
        });

        loginFrame.add(panel);
        loginFrame.setVisible(true);

    }


    public static void mainPage() {
        JFrame mainFrame = new JFrame("Login Page");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1500,1000);
        
        mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER,80,200));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setLayout(new GridLayout(4, 1, 20, 25));

        JLabel label = new JLabel();
        label.setText("Welcome " + currentUser.getUserInfo().get("name"));
        label.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        panel.add(label);

        JButton dietDiary = new JButton("Diet Diary");
        dietDiary.setSize(10, 50);
        dietDiary.setFont(new Font("Courier New",Font.BOLD,18));
        panel.add(dietDiary);

        dietDiary.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(false);
                dietDiary();
            }
        });

        JButton fitnessDiary = new JButton("Fitness Diary");
        fitnessDiary.setSize(10, 50);
        fitnessDiary.setFont(new Font("Courier New",Font.BOLD,18));
        panel.add(fitnessDiary);

        fitnessDiary.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(false);
                fitnessDiary();
            }
        });

        JButton recommendations = new JButton("Get Recommendations");
        recommendations.setSize(10, 50);
        recommendations.setFont(new Font("Courier New",Font.BOLD,18));
        panel.add(recommendations);

        mainFrame.add(panel);
        mainFrame.setVisible(true);

    }

    public static void dietDiary() {

        JFrame dietFrame = new JFrame("Diet Diary");
        dietFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dietFrame.setSize(1500,1000);
        
        dietFrame.setLayout(new FlowLayout(FlowLayout.CENTER,80,200));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,200));
        panel.setLayout(new GridLayout(4, 1, 20, 25));

        JLabel food = new JLabel("Type:");
        food.setFont(new Font("Arial", Font.PLAIN, 20));
        food.setSize(100, 20);
        food.setLocation(100, 100);
        panel.add(food);

        String[] foods = {"Fruits", "Vegetables", "Curry", "Roti", "Rice", "Ice Cream"};
        JComboBox<String> tfood = new JComboBox<String>(foods);
        tfood.setSize(10, 20);
        tfood.setFont(new Font("Courier New",Font.BOLD,18));
        panel.add(tfood);

        JLabel time = new JLabel("Time:");
        time.setFont(new Font("Arial", Font.PLAIN, 20));
        time.setSize(100, 20);
        time.setLocation(100, 100);
        panel.add(time);

        LocalTime[] times = new LocalTime[50];
        int i = 0;
        int j = 0;
        while (i<24) {
            times[j] = LocalTime.of(i,0);
            times[j+1] = LocalTime.of(i,30);
            j+=2;
            i+=1;
        }
        JComboBox<LocalTime> ttime = new JComboBox<LocalTime>(times);
        ttime.setSize(10, 20);
        ttime.setFont(new Font("Courier New",Font.BOLD,18));
        panel.add(ttime);

        JLabel weight = new JLabel("Weight (in gms):");
        weight.setFont(new Font("Arial", Font.PLAIN, 20));
        weight.setSize(100, 20);
        weight.setLocation(100, 100);
        panel.add(weight);

        JTextField tweight = new JTextField();
        tweight.setFont(new Font("Arial", Font.PLAIN, 15));
        tweight.setSize(100, 20);
        tweight.setLocation(200, 100);
        panel.add(tweight);


        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(400,400));
        panel2.setLayout(new GridLayout(6, 1, 20, 25));

        Object[] meals = currentUser.dietdiary.getAllRecords();

        panel2.add(new JLabel("Your previous meals:"));

        for (int k=0; k<meals.length; k++) {
            panel2.add(new JLabel(meals[k].toString()));
        }

        JButton submitButton = new JButton("Submit");
        submitButton.setSize(10, 20);
        submitButton.setFont(new Font("Courier New",Font.BOLD,18));
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Meal temp = new Meal((String)tfood.getSelectedItem(), (LocalTime)ttime.getSelectedItem(), Integer.valueOf(tweight.getText()));
                currentUser.dietdiary.addRecord(temp);
                dietFrame.setVisible(false);
                mainPage();
            }
        });

        dietFrame.add(panel);
        dietFrame.add(panel2);
        dietFrame.setVisible(true);
        
    }

    public static void fitnessDiary() {

        JFrame fitnessFrame = new JFrame("Fitness Diary");
        fitnessFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fitnessFrame.setSize(1500,1000);
        fitnessFrame.getContentPane().setBackground(backgroundColor);
        
        fitnessFrame.setLayout(new FlowLayout(FlowLayout.CENTER,80,200));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,200));
        panel.setLayout(new GridLayout(4, 1, 20, 25));
        panel.setBackground(backgroundColor);

        JLabel exercise = new JLabel("Type:");
        exercise.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        exercise.setSize(100, 20);
        exercise.setLocation(100, 100);
        exercise.setForeground(primaryTextColor);
        panel.add(exercise);

        String[] exercises = {"jogging", "jumping jacks", "cycling", "skipping"};
        JComboBox<String> texercise = new JComboBox<String>(exercises);
        texercise.setSize(10, 20);
        texercise.setFont(new Font("Bahnschrift",Font.BOLD,18));
        panel.add(texercise);

        JLabel time = new JLabel("Start Time:");
        time.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        time.setSize(100, 20);
        time.setLocation(100, 100);
        time.setForeground(primaryTextColor);
        panel.add(time);

        LocalTime[] times = new LocalTime[50];
        int i = 0;
        int j = 0;
        while (i<24) {
            times[j] = LocalTime.of(i,0);
            times[j+1] = LocalTime.of(i,30);
            j+=2;
            i+=1;
        }
        JComboBox<LocalTime> ttime = new JComboBox<LocalTime>(times);
        ttime.setSize(10, 20);
        ttime.setFont(new Font("Bahnschrift",Font.BOLD,18));
        panel.add(ttime);
        
        JLabel time2 = new JLabel("End Time:");
        time2.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        time2.setSize(100, 20);
        time2.setLocation(100, 100);
        time2.setForeground(primaryTextColor);
        panel.add(time2);

        JComboBox<LocalTime> ttime2 = new JComboBox<LocalTime>(times);
        ttime2.setSize(10, 20);
        ttime2.setFont(new Font("Bahnschrift",Font.BOLD,18));
        panel.add(ttime2);

        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(400,400));
        panel2.setLayout(new GridLayout(6, 1, 20, 25));
        panel2.setBackground(backgroundColor);

        Object[] sessions = currentUser.fitnessdiary.getAllRecords();

        JLabel label0 = new JLabel("Your previous sessions:");
        label0.setForeground(primaryTextColor);
        panel2.add((label0));
        

        for (int k=0; k<sessions.length; k++) {
            panel2.add(new JLabel(sessions[k].toString()));
        }

        JButton submitButton = new JButton("Submit");
        submitButton.setSize(10, 20);
        submitButton.setFont(new Font("Courier New",Font.BOLD,18));
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Exercise temp = new Exercise((String)texercise.getSelectedItem(), (LocalTime)ttime.getSelectedItem(), (LocalTime)ttime2.getSelectedItem());
                currentUser.fitnessdiary.addRecord(temp);
                fitnessFrame.setVisible(false);
                mainPage();
            }
        });

        fitnessFrame.add(panel);
        fitnessFrame.add(panel2);
        fitnessFrame.setVisible(true);
        
    }

    public static void buttonStyle(JButton x, int fsize)
    {
        x.setFont(new Font("Bahnschrift",Font.PLAIN,fsize));

        x.setForeground(primaryTextColor);
        x.setBackground(buttonColor);
        x.setBorderPainted(false);
        x.setFocusPainted(false);

        x.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
        x.setBackground(accentColor);
        }  

        public void mouseExited(java.awt.event.MouseEvent evt) {
        x.setBackground(buttonColor);
        }
        });
    }
    
        
        
    }


    


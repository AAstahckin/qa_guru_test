package tests;

import com.github.javafaker.Faker;
import utils.RandomGenerator;

public class TestData {
    static Faker faker = new Faker();
    //Test data from PracticeFormTest

    public static String checkingStateFillingLogic(String value) {
        String[] cityRajasthan = new String[]{
                "Jaipur", "Jaiselmer"
        };
        String[] cityHaryana = new String[]{
                "Karnal", "Panipat"
        };
        String[] cityUttarPradesh = new String[]{
                "Agra", "Lucknow", "Merrut"
        };
        String[] cityNCR = new String[]{
                "Delhi", "Gurgaon", "Noida"
        };

        switch (value) {
            case "NCR":
                return RandomGenerator.getRandomArr(cityNCR);
            case "Uttar Pradesh":
                return RandomGenerator.getRandomArr(cityUttarPradesh);
            case "Haryana":
                return RandomGenerator.getRandomArr(cityHaryana);
            case "Rajasthan":
                return RandomGenerator.getRandomArr(cityRajasthan);
        }
        return value;
    }

    private static final String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };
    private static final String[] genders = {
            "Male", "Female", "Other"
    };
    private static final String[] hobby = {
            "Sports", "Reading", "Music"
    };
    private static final String[] state = {
            "NCR", "Uttar Pradesh", "Haryana", "Rajasthan"
    };
    private static final String[] subject = {
            "Hindi", "English", "Maths", "Physics", "Chemistry", "Biology",
            "Biology", "Computer Science", "Commerce", "Accounting", "Economics",
            "Arts", "Social Studies", "History", "Civics"
    };

    public static String practiceFirstName = RandomGenerator.getRandomString(7, "AnyString");
    public static String practiceLastName = RandomGenerator.getRandomString(7, "AnyString");
    public static String practiceEmail = RandomGenerator.getRandomString(10, "Email");
    public static String practiceMobileNumber = RandomGenerator.getRandomString(10, "Phone");
    public static String practiceSubjects = RandomGenerator.getRandomArr(subject);
    public static String practiceAddress = RandomGenerator.getRandomString(50, "AnyString");
    public static String practiceMonth = RandomGenerator.getRandomArr(months);
    public static String practiceYear = String.valueOf(RandomGenerator.getRandomInt(1900, 2100));
    public static String practiceDay = String.valueOf(RandomGenerator.getRandomInt(10, 28));
    public static String practiceMale = RandomGenerator.getRandomArr(genders);
    public static String practiceHobbies = RandomGenerator.getRandomArr(hobby);
    public static String practiceState = RandomGenerator.getRandomArr(state);
    public static String practiceCity = checkingStateFillingLogic(practiceState);
    public static String picture = "Screenshot_1.png";
}
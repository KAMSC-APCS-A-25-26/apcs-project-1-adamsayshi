//Creates global variables

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Globals {
    public static String name;
    public static Boolean testing = true;
    public static Boolean lottery = true;
    public static Boolean gamble = true;
    public static String clothes = "black";
    public static int sleepTime = 1;
    public static String[] girlsA = {"Lana", "Suzie", "Rudy", "Esmeralda", "Leia", "Patricia", "Samantha", "Layla"};
    public static String[] hobbiesA = {"partying", "playing soccer", "playing basketball", "smoking", "sword fighting", "playing hockey", "playing basketball and soccer", "fencing"};
    public static Integer[] ratingA = {3, 6, 10, 5, 6, 4, 10, 8};
    public static List<String> girls = new ArrayList<>(Arrays.asList(Globals.girlsA));
    public static List<String> hobbies = new ArrayList<>(Arrays.asList(Globals.hobbiesA));
    public static List<Integer> rating = new ArrayList<>(Arrays.asList(Globals.ratingA));
}

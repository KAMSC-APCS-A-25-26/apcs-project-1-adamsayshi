import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.util.Random;

public class TextAdventure {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner readmeFile = new Scanner(new File("src/main/readme.txt"));
        // Initialize variables
        boolean ContinuePlay = true;
        int user;
        // Introduction Screen
        System.out.println(" ██▓     ▒█████   ██▒   █▓▓█████     ██▓  ██████  ██▓    ▄▄▄       ███▄    █ ▓█████▄ \n" +
                "▓██▒    ▒██▒  ██▒▓██░   █▒▓█   ▀    ▓██▒▒██    ▒ ▓██▒   ▒████▄     ██ ▀█   █ ▒██▀ ██▌\n" +
                "▒██░    ▒██░  ██▒ ▓██  █▒░▒███      ▒██▒░ ▓██▄   ▒██░   ▒██  ▀█▄  ▓██  ▀█ ██▒░██   █▌\n" +
                "▒██░    ▒██   ██░  ▒██ █░░▒▓█  ▄    ░██░  ▒   ██▒▒██░   ░██▄▄▄▄██ ▓██▒  ▐▌██▒░▓█▄   ▌\n" +
                "░██████▒░ ████▓▒░   ▒▀█░  ░▒████▒   ░██░▒██████▒▒░██████▒▓█   ▓██▒▒██░   ▓██░░▒████▓ \n" +
                "░ ▒░▓  ░░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░   ░▓  ▒ ▒▓▒ ▒ ░░ ▒░▓  ░▒▒   ▓▒█░░ ▒░   ▒ ▒  ▒▒▓  ▒ \n" +
                "░ ░ ▒  ░  ░ ▒ ▒░    ░ ░░   ░ ░  ░    ▒ ░░ ░▒  ░ ░░ ░ ▒  ░ ▒   ▒▒ ░░ ░░   ░ ▒░ ░ ▒  ▒ \n" +
                "  ░ ░   ░ ░ ░ ▒       ░░     ░       ▒ ░░  ░  ░    ░ ░    ░   ▒      ░   ░ ░  ░ ░  ░ \n" +
                "    ░  ░    ░ ░        ░     ░  ░    ░        ░      ░  ░     ░  ░         ░    ░    \n" +
                "                      ░                                                       ░      ");
        System.out.println("-------------------------------------------------------------------------------------");
        // Title Screen
        while (ContinuePlay) {
            System.out.println("1. Play\n2. Help\n3. Exit\n4. Testing");
            System.out.print("Write your option: ");
            user = sc.nextInt();
            // Switch case to Handle User Input
            switch (user) {
                case 1:
                    // User is done playing
                    ContinuePlay = false;
                    Globals.testing = false;
                    Scene1();
                    break;
                case 2:
                    while (readmeFile.hasNext()) {
                        System.out.println(readmeFile.nextLine());
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    ContinuePlay = false;
                    break;
                case 4:
                    System.out.print("Which scene would you like to go to?: ");
                    String stuff = "Scene" + sc.nextInt();
                    try {
                        Method method = TextAdventure.class.getDeclaredMethod(stuff);
                        method.invoke(null);
                    } catch (NoSuchMethodException e) {
                        System.out.println("Scene not found");
                    }

                default:
                    System.out.println("I don't know that");
                    break;
            }
        }
        // Done Playing
        System.out.println("Thanks for playing!");
    }

    public static void Scene1() throws Exception {
        // Initialize variables for scene 1
        Scanner sc = new Scanner(System.in);
        int x = Globals.sleepTime;
        // Getting the Name
        System.out.print("What would you like your name to be?: ");
        Globals.name = sc.nextLine();
        Thread.sleep(x);
        System.out.println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░         ░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓████▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░ \n" +
                " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░           ░▒▓█▓▒░ \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░ \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░ \n" +
                "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░         ░▒▓█▓▒░ \n" +
                "                                                                                   \n" +
                "                                                                                   ");
        // Dialog
        System.out.println("You wake up, to your mom yelling in your ear.");
        Thread.sleep(x);
        System.out.println("\"Why are you still in bed?? You are the most disappointing of all my sons\" - Mom");
        Thread.sleep(x);
        System.out.println("\"I don't understand why you're mad, just let me find a job soon\" - " + Globals.name);
        Thread.sleep(x);
        System.out.println("\"I have waited long enough! Leave my house!\" - Mom");
        Thread.sleep(x);
        System.out.println("You start to pack up and leave");
        Thread.sleep(x);
        //Move onto next scene
        Scene2();
    }

    public static void Scene2() throws Exception {
        // Get the scanner
        Scanner sc = new Scanner(System.in);
        int x = Globals.sleepTime;
        System.out.println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░      ░▒▓███████▓▒░  \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░         ░▒▓██████▓▒░  \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░        \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░        \n" +
                "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░      ░▒▓████████▓▒░ \n" +
                "                                                                                       \n" +
                "                                                                                       ");
        Thread.sleep(x);
        // Scene 2 dialog
        System.out.println("You wake up, hung over with mud stains");
        Thread.sleep(x);
        System.out.println("You see someone come up to you");
        Thread.sleep(x);
        System.out.println("You can't see his face as he stands over you because of the sun");
        Thread.sleep(x);
        System.out.println("He stuck out both his hands, seemingly holding bread and a lottery ticket");
        Thread.sleep(x);
        System.out.print("Do you grab the bread or the lottery ticket? (bread/ticket):  ");
        // User decides this, which leads to future decisions
        Globals.lottery = !sc.nextLine().equals("bread");
        //Big decision later on
        if (Globals.lottery) {
            System.out.println("Right when you grab the ticket, he hands you a coin to scratch");
            Thread.sleep(x);
            System.out.println("You scratch it off");
            Thread.sleep(x);
            System.out.println("You get nothing");
            Thread.sleep(x);
            System.out.println("Your stomach starts to rumble, so you ask if you can have the bread");
            Thread.sleep(x);
            System.out.println(
                    "He starts to hand you the bread, but stops at the last seconds and throws it on the ground");
            Thread.sleep(x);
            System.out.println("You try reaching for it, but he stomped on it and destroyed it");
            Thread.sleep(x);
        }
        System.out.println("He hands you a letter that says something about a Love Island");
        Thread.sleep(x);
        System.out.println("You decide to go to earn some money");
        Thread.sleep(x);
        System.out.println("Before you can say anything, he knocks you out...");
        Thread.sleep(x);
        //Move onto next scene
        Scene3();
    }

    public static void Scene3() throws Exception {
        Scanner sc = new Scanner(System.in);
        Boolean heads;
        int x = Globals.sleepTime;
        // Scene 3
        System.out.println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░      ░▒▓███████▓▒░  \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░        ░▒▓███████▓▒░  \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░      ░▒▓███████▓▒░  \n" +
                "                                                                                       \n" +
                "                                                                                       ");
        Thread.sleep(x);
        System.out.println("You wake up in a bus");
        Thread.sleep(x);
        System.out.println("\"You're finally awake, you missed half the ride\" - ?");
        Thread.sleep(x);
        System.out.println("\"Who are you?\" - " + Globals.name);
        Thread.sleep(x);
        System.out.println("\"I am Michael\" - Michael");
        Thread.sleep(x);
        System.out.println("\"Hello Michael\" - " + Globals.name);
        Thread.sleep(x);
        System.out.println("\"Where are we? What am I doing here?\" - " + Globals.name);
        Thread.sleep(x);
        System.out.println("\"You will either win lots of money, or lose everything\" - Michael");
        Thread.sleep(x);
        System.out.println("\"Do you want to gamble what you have left?\" - Michael");
        Thread.sleep(x);
        System.out.print("Would you like to gamble your life savings? (yes/no): ");
        Thread.sleep(x);
        Globals.gamble = sc.nextLine().equals("yes");
        //Big decision later on
        if (Globals.gamble) {
            System.out.println("He pulls out a coin from his pocket and flips it");
            Thread.sleep(x);
            System.out.println("Do you call out heads or tails? (heads/tails): ");
            heads = sc.nextLine().equals("heads");
            System.out.print(".");
            Thread.sleep(x / 3);
            System.out.print(".");
            Thread.sleep(x / 3);
            System.out.println(".");
            Thread.sleep(x);
            System.out.print("The coin lands on ");
            //Make user always lose
            if (heads) {
                System.out.println("tails");
            } else {
                System.out.println("heads");
            }
            Thread.sleep(x);
            System.out.println("You lost");
            Thread.sleep(x);
            System.out.println("You realize how bad it's going for you");
            Thread.sleep(x);
            System.out.println("However, maybe you will earn everything back and more from Love Island");
            Thread.sleep(x);
        } else {
            System.out.println("\"You're no fun\" - Michael");
            Thread.sleep(x);
        }
        System.out.println("You continue on your way, watching the window");
        Thread.sleep(x);
        System.out.println("You notice you are in a heavily wooded area");
        Thread.sleep(x);
        System.out.println("You find a paper on the floor");
        Thread.sleep(x);
        System.out.println("You decide to read it, but it's incredibly smeared");
        Thread.sleep(x);
        System.out.println(" ██░ ██ ▓█████  ██▓     ██▓███  \n" +
                "▓██░ ██▒▓█   ▀ ▓██▒    ▓██░  ██▒\n" +
                "▒██▀▀██░▒███   ▒██░    ▓██░ ██▓▒\n" +
                "░▓█ ░██ ▒▓█  ▄ ▒██░    ▒██▄█▓▒ ▒\n" +
                "░▓█▒░██▓░▒████▒░██████▒▒██▒ ░  ░\n" +
                " ▒ ░░▒░▒░░ ▒░ ░░ ▒░▓  ░▒▓▒░ ░  ░\n" +
                " ▒ ░▒░ ░ ░ ░  ░░ ░ ▒  ░░▒ ░     \n" +
                " ░  ░░ ░   ░     ░ ░   ░░       \n" +
                " ░  ░  ░   ░  ░    ░  ░         \n" +
                "                                ");
        Thread.sleep(x);
        System.out.println("You decide to keep quiet, because who knows what will happen");
        Thread.sleep(x);
        System.out.println("You keep looking out the window");
        Thread.sleep(x);
        Scene4();
    }

    public static void Scene4() throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = Globals.sleepTime;
        //Scene 4
        System.out.println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░ \n" +
                " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░        ░▒▓████████▓▒░ \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░             ░▒▓█▓▒░ \n" +
                "                                                                                       \n" +
                "                                                                                       ");
        Thread.sleep(x);
        System.out.println("You find yourself in a beautiful house, with a really nice pool, just like a movie");
        Thread.sleep(x);
        System.out.println("There are 8 girls lined up in front of you");
        Thread.sleep(x);
        System.out.println("They introduce themselves");
        Thread.sleep(x);
        for (int i = 0; i < Globals.girlsA.length; i++) {
            System.out.println("Hello, I'm " + Globals.girlsA[i] + " and I like " + Globals.hobbiesA[i]);
            Thread.sleep(x);
            System.out.println("You rate her a " + Globals.ratingA[i] + " out of 10");
            Thread.sleep(x);
        }
        System.out.println("\"The first choice is hard\" - Narrator");
        Thread.sleep(x);
        System.out.println("\"Who do you decide to kick out?\" - Narrator");
        // Kicks out girls

        for (int i = 0; i < 4; i++) {
            System.out.print("Your options to kick out are: ");
            System.out.println(String.join(", ", Globals.girls));
            Thread.sleep(x);
            System.out.print("Who is person number " + (i + 1) + " that you want to kick out?(type in the name): ");
            String girlStuff = sc.nextLine();
            //Check girls
            while(!Globals.girls.contains(girlStuff)){
                System.out.print("Sorry, that girl is not in the list, type it again: ");
                girlStuff = sc.nextLine();
            }
            int spot = Globals.girls.indexOf(girlStuff);
            Globals.girls.remove(spot);
            Globals.hobbies.remove(spot);
            Globals.rating.remove(spot);
        }
        //Move on to next scene
        if (Globals.testing) {
            return;
        } else {
            Scene5();
        }
    }

    public static void Scene5() throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = Globals.sleepTime;
        // Scene 5
        System.out
                .println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░      ░▒▓████████▓▒░ \r\n" + //
                        "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░        \r\n" + //
                        "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░        \r\n" + //
                        " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░        ░▒▓███████▓▒░  \r\n" + //
                        "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \r\n" + //
                        "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \r\n" + //
                        "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░      ░▒▓███████▓▒░  \r\n" + //
                        "                                                                                       \r\n" + //
                        "                                                                                       ");
        Thread.sleep(x);
        System.out.println("The day has been incredibly long, and you feel terrible for voting out some of the girls");
        Thread.sleep(x);
        System.out.println("Before you go to bed, you notice that something feels strange about this place");
        Thread.sleep(x);
        System.out.println("The note on the bus made you feel shivers");
        Thread.sleep(x);
        System.out.println("However, there is nothing you can do about it now, so you must get ready for tomorrow");
        Thread.sleep(x);
        System.out.print("What color clothes do you decide to wear?: ");
        Globals.clothes = sc.nextLine();
        System.out.println("Do you want to eat a quick snack before bed? (yes/no): ");
        //Little eating scene
        Boolean eating = sc.nextLine().equals("yes");
        if (eating) {
            System.out.println("You eat a little hamburger");
            Thread.sleep(x);
        }
        System.out.println("You head off to bed");
        if (Globals.testing) {
            return;
        } else {
            Scene6();
        }
    }

    public static void Scene6() throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x = Globals.sleepTime;
        // Scene 6
        System.out
                .println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░       ░▒▓███████▓▒░ \r\n" + //
                        "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░        \r\n" + //
                        "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░        \r\n" + //
                        " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░        ░▒▓███████▓▒░  \r\n" + //
                        "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░ \r\n" + //
                        "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░ \r\n" + //
                        "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░       ░▒▓██████▓▒░  \r\n" + //
                        "                                                                                       \r\n" + //
                        "                                                                                       ");
        Thread.sleep(x);
        System.out.println("You find yourself looking at the 4 remaining contestants");
        System.out.print("Contestants: ");
        System.out.println(String.join(", ", Globals.girls));
        Thread.sleep(x);
        System.out.println("\"You may choose one of them to play a game with\" - Narrator");
        Thread.sleep(x);
        System.out.println("Who do you choose?: ");
        String girlStuff = sc.nextLine();
        //Check if girl is in the thing
        while(!Globals.girls.contains(girlStuff)){
            System.out.print("Sorry, that girl is not in the list, type it again: ");
            girlStuff = sc.nextLine();
        }
        int spot = Globals.girls.indexOf(girlStuff);
        String contestant = Globals.girls.get(spot);
        System.out.println("\"So you chose " + contestant + "! - Narrator");
        Thread.sleep(x);
        System.out.println("\"You will play a number guessing game, and whoever guesses first, will win!\" - Narrator");
        Thread.sleep(x);
        //Beginning of secret ending
        if (contestant.equals("Samantha")) {
            System.out.println("As you look deeply into Samantha's eyes, you notice how beautiful she is");
            System.out.println("She notices you looking and quickly looks away");
            System.out.print("Would you like to forfeit and let Samantha win? (yes/no): ");
            // Secret Ending #1
            if (sc.nextLine().equals("yes")) {
                System.out.println("You speak up, \"I forfeit and would like to choose Samantha!\" - " + Globals.name);
                Thread.sleep(x);
                System.out.println("\"A bold move! We've never seen this before\" - Narrator");
                Thread.sleep(x);
                System.out.println("Before you could say any words, he pulls out a gun and shoots you");
                Thread.sleep(x);
                return;
            }
            System.out.println("Although she's beautiful, you must play the game");
        }
        System.out.println("You know I'm the best at this? - " + contestant);
        Thread.sleep(x);
        System.out.println("You're nice looking " + Globals.clothes + " shirt won't help you win - " + contestant);
        Thread.sleep(x);
        System.out.println("\"" + contestant + " will begin by guessing your number between 1-5!\" - Narrator");
        Thread.sleep(x);
        //initialize points
        int userPoints = 0;
        int contPoints = 0;
        //Minigame
        while (userPoints < 3 && contPoints < 3) {
            System.out.print("What number do you decide to choose: ");
            int userStay = sc.nextInt();
            int contRandom = rand.nextInt(4) + 1;
            System.out.println(Globals.name + " has chosen " + userStay + " and " + contestant + " has chosen " + contRandom);
            Thread.sleep(x/2);
            //Check if girl scored
            if (userStay == contRandom) {
                System.out.println("\"Looks like " + contestant + " has won this round! One point!\" - Narrator");
                Thread.sleep(x/2);
                contPoints++;
            } else {
                System.out.println("Looks like " + contestant + " was off!\" - Narrator");
                Thread.sleep(x/2);
            }
            System.out.print("What number do you decide to choose: ");
            int userAttack = sc.nextInt();
            int contDef = rand.nextInt(4) + 1;
            System.out.println(Globals.name + " has chosen " + userAttack + " and " + contestant + " has chosen " + contDef);
            //Check if user scored
            if (userAttack == contDef) {
                System.out.println("\"Looks like " + Globals.name + " has won this round! One point!\" - Narrator");
                Thread.sleep(x/2);
                userPoints++;
            } else {
                System.out.println("Looks like " + Globals.name + " was off!\" - Narrator");
                Thread.sleep(x/2);
            }
            //Decide who wins the game
            if(userPoints < 3 && contPoints < 3){
                System.out.println("We will keep going until one of you has reached 3 points!");
                System.out.println(Globals.name + ": " + userPoints);
                System.out.println(contestant + ": " + contPoints);
            } else{
                if (userPoints > 3){
                    System.out.println("\"Congrats " + Globals.name + " for winning!\" - Narrator");
                    Thread.sleep(x);
                    System.out.println("\"I can't believe I lost\" - " + contestant);
                    Thread.sleep(x);
                } else{
                    System.out.println("\"Congrats " + contestant + " for winning!\" - Narrator");
                    Thread.sleep(x);
                    System.out.println("\"I told you I would win!! Suck it! - " + contestant);
                    Thread.sleep(x);
                }
            }
        }
        System.out.println("The game is over!"); 
        Thread.sleep(x);
        System.out.println("\"You must kick out 2 more contestants\" - Narrator");
        Thread.sleep(x);
        sc.nextLine();
        //Kick out girls
        for (int i = 0; i < 2; i++) {
            System.out.print("Your options to kick out are: ");
            System.out.println(String.join(", ", Globals.girls));
            Thread.sleep(x);
            System.out.print("Who is person number " + (i + 1) + " that you want to kick out?(type in the name): ");
            String girlStuff = sc.nextLine();
            while(!Globals.girls.contains(girlStuff)){
                System.out.print("Sorry, that girl is not in the list, type it again: ");
                girlStuff = sc.nextLine();
            }
            int spot2 = Globals.girls.indexOf(girlStuff);
            Globals.girls.remove(spot2);
            Globals.hobbies.remove(spot2);
            Globals.rating.remove(spot2);
        }
        //Move on to next scene
        if (Globals.testing) {
            return;
        } else {
            Scene7();
        }
    }
    public static void Scene7() throws Exception{
        Scanner sc = new Scanner(System.in);
        int x = Globals.sleepTime;
        //Scene 7
        System.out.println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░      ░▒▓████████▓▒░ \r\n" + //
                        "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░ \r\n" + //
                        "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \r\n" + //
                        " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░              ░▒▓█▓▒░  \r\n" + //
                        "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                   ░▒▓█▓▒░  \r\n" + //
                        "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                  ░▒▓█▓▒░   \r\n" + //
                        "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░           ░▒▓█▓▒░   \r\n" + //
                        "                                                                                       \r\n" + //
                        "                                                                                       ");
        Thread.sleep(x);
        System.out.println("Its a new day, and you are ready to choose between the last two contestants");
        Thread.sleep(x);
        //Choose date
        System.out.println("You will go on a date with each of them today");
        String cont1 = Globals.girls.get(0);
        String cont2 = Globals.girls.get(1);
        System.out.println("You begin your date with " + cont1);
        Thread.sleep(x);
        //The date is just gonna go well, but it will take too long
        System.out.println("You learn that she is really good at cooking and an amazing pickleball player!");
        Thread.sleep(x);
        System.out.println("Now, your second date begins with " + cont2);
        Thread.sleep(x);
        System.out.println("This date does not go well and she storms out");
        Thread.sleep(x);
        System.out.println("\"Now that you have talked to both, who will you keep?\" - Narrator");
        Thread.sleep(x);
        //Kick girls out
        for (int i = 0; i < 1; i++) {
            System.out.print("Your options to kick out are: ");
            System.out.println(String.join(", ", Globals.girls));
            Thread.sleep(x);
            System.out.print("Who is person number " + (i + 1) + " that you want to kick out?(type in the name): ");
            String girlStuff = sc.nextLine();
            while(!Globals.girls.contains(girlStuff)){
                System.out.print("Sorry, that girl is not in the list, type it again: ");
                girlStuff = sc.nextLine();
            }
            int spot = Globals.girls.indexOf(girlStuff);
            Globals.girls.remove(spot);
            Globals.hobbies.remove(spot);
            Globals.rating.remove(spot);
        }
        System.out.println("You decide to choose " + Globals.girls.get(0));
        Thread.sleep(x);
        System.out.println("You travel home with her");
        //Move on to next scene
        if (Globals.testing) {
            return;
        } else {
            Scene8();
        }
    }
    public static void Scene8()throws Exception{
        int x = Globals.sleepTime;
        //Scene 8 - final
        System.out.println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░       ░▒▓██████▓▒░  \r\n" + //
                        "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░ \r\n" + //
                        "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░ \r\n" + //
                        " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░         ░▒▓██████▓▒░  \r\n" + //
                        "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░ \r\n" + //
                        "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░ \r\n" + //
                        "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░       ░▒▓██████▓▒░  \r\n" + //
                        "                                                                                       \r\n" + //
                        "                                                                                       ");
        Thread.sleep(x);
        //Good ending
        if(!Globals.gamble && !Globals.lottery){
            System.out.println("Because you don't gamble, you live a happy life");
            Thread.sleep(x);
            System.out.println("Your mom comes home and you get a nice house and a dog");
            Thread.sleep(x);
            System.out.println("Thank you for playing");
        } else if(!Globals.gamble ^ !Globals.lottery){
            System.out.println("You only liked to gamble when it was fun, making your life alright");
            Thread.sleep(x);
            System.out.println("Your mom does not come home, but you have the girl of your dreams");
            Thread.sleep(x);
            System.out.println("Thank you for playing");
        } else{
            //Bad Ending
            System.out.println("You gambled everything...");
            Thread.sleep(x);
            System.out.println("Not only did your mom not come back, but your love left you too");
            Thread.sleep(x);
            System.out.println("No thank you for playing freaking gambler");
        }
        //Sort of secret
        if(Globals.girls.get(0).equals("Samantha")){
            System.out.println("You thought it was over? Even when you chose Samantha?");
            Thread.sleep(x);
            System.out.println("With Samantha as your wife, she forces you to do many things against your consent");
            Thread.sleep(x);
            System.out.println("She tells you about the secrets of Love Island");
            Thread.sleep(x);
            System.out.println("Stay tuned for part 2 to reveal the secrets!!");
        }
    }
}
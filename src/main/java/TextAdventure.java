import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
public class TextAdventure {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Scanner readmeFile = new Scanner(new File("src/main/readme.txt"));
        //Initialize variables
        boolean ContinuePlay = true;
        int user;
        //Introduction Screen
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
        //Title Screen
        while (ContinuePlay) {
            System.out.println("1. Play\n2. Help\n3. Exit");
            System.out.print("Write your option: ");
            user = sc.nextInt();
            //Switch case to Handle User Input
            switch (user) {
                case 1:
                    //User is done playing
                    Scene1();
                    ContinuePlay = false;
                    break;
                case 2:
                    while (readmeFile.hasNext()){
                        System.out.println(readmeFile.nextLine());
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    ContinuePlay = false;
                    break;
                default:
                    System.out.println("I don't know that");
                    break;
            }
        }
        //Done Playing
        System.out.println("Thanks for playing!");
    }
    public static void Scene1()throws  Exception{
        //Initialize variables for scene 1
        Scanner sc = new Scanner(System.in);
        int x = Globals.sleepTime;
        //Getting the Name
        System.out.print("What would you like your name to be?: ");
        Globals.name = sc.nextLine();
        Thread.sleep(1000);
        System.out.println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░         ░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓████▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░ \n" +
                " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░           ░▒▓█▓▒░ \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░ \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                ░▒▓█▓▒░ \n" +
                "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░         ░▒▓█▓▒░ \n" +
                "                                                                                   \n" +
                "                                                                                   ");
        //Dialog
        System.out.println("You wake up, to your mom yelling in your ear."); Thread.sleep(x);
        System.out.println("\"Why are you still in bed?? You are the most disappointing of all my sons\" - Mom"); Thread.sleep(x);
        System.out.println("\"I don't understand why you're mad, just let me find a job soon\" - " + Globals.name); Thread.sleep(x);
        System.out.println("\"I have waited long enough! Leave my house!\" - Mom"); Thread.sleep(x);
        System.out.println("You start to pack up and leave"); Thread.sleep(x);
        Scene2();
    }
    public static void Scene2()throws Exception{
        //Get the scanner
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
                "                                                                                       "); Thread.sleep(x);
        //Scene 2 dialog
        System.out.println("You wake up, hung over with mud stains"); Thread.sleep(x);
        System.out.println("You see someone come up to you"); Thread.sleep(x);
        System.out.println("You can't see his face as he stands over you because of the sun");Thread.sleep(x);
        System.out.println("He stuck out both his hands, seemingly holding bread and a lottery ticket");Thread.sleep(x);
        System.out.print("Do you grab the bread or the lottery ticket? (bread/ticket):  ");
        //User decides this, which leads to future decisions
        Globals.lottery = !sc.nextLine().equals("bread");
        if(Globals.lottery){System.out.println("Right when you grab the ticket, he hands you a coin to scratch"); Thread.sleep(x);
            System.out.println("You scratch it off"); Thread.sleep(x); System.out.println("You get nothing"); Thread.sleep(x);
            System.out.println("Your stomach starts to rumble, so you ask if you can have the bread");Thread.sleep(x);
            System.out.println("He starts to hand you the bread, but stops at the last seconds and throws it on the ground");Thread.sleep(x);
            System.out.println("You try reaching for it, but he stomped on it and destroyed it");Thread.sleep(x);
        }
        System.out.println("He hands you a letter that says something about a Love Island"); Thread.sleep(x);
        System.out.println("You decide to go to earn some money");Thread.sleep(x);
        System.out.println("Before you can say anything, he knocks you out...");Thread.sleep(x);
        Scene3();
    }
    public static void Scene3() throws Exception{
        Scanner sc = new Scanner(System.in);
        Boolean heads;
        int x = Globals.sleepTime;
        //Scene 3
        System.out.println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░      ░▒▓███████▓▒░  \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░        ░▒▓███████▓▒░  \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░      ░▒▓███████▓▒░  \n" +
                "                                                                                       \n" +
                "                                                                                       ");Thread.sleep(x);
        System.out.println("You wake up in a bus");Thread.sleep(x);
        System.out.println("\"You're finally awake, you missed half the ride\" - ?");Thread.sleep(x);
        System.out.println("\"Who are you?\" - " + Globals.name); Thread.sleep(x);
        System.out.println("\"I am Michael\" - Michael"); Thread.sleep(x);
        System.out.println("\"Hello Michael\" - " + Globals.name); Thread.sleep(x);
        System.out.println("\"Where are we? What am I doing here?\" - " + Globals.name);
        System.out.println("\"You will either win lots of money, or lose everything\" - Michael");Thread.sleep(x);
        System.out.println("\"Do you want to gamble what you have left?\" - Michael");Thread.sleep(x);
        System.out.print("Would you like to gamble your life savings? (yes/no): ");Thread.sleep(x);
        Globals.gamble = sc.nextLine().equals("yes");
        if(Globals.gamble){
            System.out.println("He pulls out a coin from his pocket and flips it");Thread.sleep(x);
            System.out.println("Do you call out heads or tails? (heads/tails): ");
            heads = sc.nextLine().equals("heads");
            System.out.print(".");Thread.sleep(x/3);System.out.print(".");Thread.sleep(x/3);System.out.println(".");Thread.sleep(x);
            System.out.print("The coin lands on ");
            if(heads){
                System.out.println("tails");
            } else{
                System.out.println("heads");
            }
            System.out.println("You lost");Thread.sleep(x);
            System.out.println("You realize how bad it's going for you");Thread.sleep(x);
            System.out.println("However, maybe you will earn everything back and more from Love Island");Thread.sleep(x);
        } else{
            System.out.println("\"You're no fun\" - Michael");Thread.sleep(x);
        }
        System.out.println("You continue on your way, watching the window");Thread.sleep(x);
        System.out.println("You notice you are in a heavily wooded area");Thread.sleep(x);
        System.out.println("You find a paper on the floor");Thread.sleep(x);
        System.out.println("You decide to read it, but it's incredibly smeared");Thread.sleep(x);
        System.out.println(" ██░ ██ ▓█████  ██▓     ██▓███  \n" +
                "▓██░ ██▒▓█   ▀ ▓██▒    ▓██░  ██▒\n" +
                "▒██▀▀██░▒███   ▒██░    ▓██░ ██▓▒\n" +
                "░▓█ ░██ ▒▓█  ▄ ▒██░    ▒██▄█▓▒ ▒\n" +
                "░▓█▒░██▓░▒████▒░██████▒▒██▒ ░  ░\n" +
                " ▒ ░░▒░▒░░ ▒░ ░░ ▒░▓  ░▒▓▒░ ░  ░\n" +
                " ▒ ░▒░ ░ ░ ░  ░░ ░ ▒  ░░▒ ░     \n" +
                " ░  ░░ ░   ░     ░ ░   ░░       \n" +
                " ░  ░  ░   ░  ░    ░  ░         \n" +
                "                                ");Thread.sleep(x);
        System.out.println("You decide to keep quiet, because who knows what will happen");Thread.sleep(x);
        System.out.println("You keep looking out the window");Thread.sleep(x);
        Scene4();
    }
    public static void Scene4() throws Exception{
        Scanner sc = new Scanner(System.in);
        int x = Globals.sleepTime;
        System.out.println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░░▒▓█▓▒░ \n" +
                " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░        ░▒▓████████▓▒░ \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░             ░▒▓█▓▒░ \n" +
                "                                                                                       \n" +
                "                                                                                       ");Thread.sleep(x);
        System.out.println("You find yourself in a beautiful house, with a really nice pool, just like a movie");Thread.sleep(x);
        System.out.println("There are 8 girls lined up in front of you");Thread.sleep(x);
        System.out.println("They introduce themselves");Thread.sleep(x);
        for(int i = 0; i < Globals.girls.length; i++){
            System.out.println("Hello, I'm " + Globals.girls[i] + " and I like " + Globals.hobbies[i]);
            System.out.println("You rate her a " + Globals.rating[i] + " out of 10");
        }
        System.out.println("\"The first choice is hard\" - Narrator");
        System.out.println("\"Who do you decide to kick out?\" - Narrator");
        for(int i = 0; i < Globals.girls.length/2; i++){
            System.out.print("Who is person number " + i + " that you want to kick out?: ");

        }
    }
}

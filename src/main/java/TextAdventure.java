import java.util.Scanner;
import java.io.File;
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
        System.out.println("You wake up, to your mom yelling in your ear."); Thread.sleep(1000);
        System.out.println("\"Why are you still in bed?? You are the most disappointing of all my sons\" - Mom"); Thread.sleep(1500);
        System.out.println("\"I don't understand why you're mad, just let me find a job soon\" - " + Globals.name); Thread.sleep(1500);
        System.out.println("\"I have waited long enough! Leave my house!\" - Mom"); Thread.sleep(1500);
        System.out.println("You start to pack up and leave");
        Scene2();
    }
    public static void Scene2()throws Exception{
        //Get the scanner
        Scanner sc = new Scanner(System.in); Thread.sleep(1000);
        System.out.println(" ░▒▓███████▓▒░░▒▓██████▓▒░░▒▓████████▓▒░▒▓███████▓▒░░▒▓████████▓▒░      ░▒▓███████▓▒░  \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                "░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░                    ░▒▓█▓▒░ \n" +
                " ░▒▓██████▓▒░░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░         ░▒▓██████▓▒░  \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░        \n" +
                "       ░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░             ░▒▓█▓▒░        \n" +
                "░▒▓███████▓▒░ ░▒▓██████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░      ░▒▓████████▓▒░ \n" +
                "                                                                                       \n" +
                "                                                                                       "); Thread.sleep(1500);
        //Scene 2 dialog
        System.out.println("You wake up, hung over with mud stains"); Thread.sleep(1500);
        System.out.println("You see someone come up to you"); Thread.sleep(1500);
        System.out.println("You can't see his face as he stands over you because of the sun");Thread.sleep(1500);
        System.out.println("He stuck out both his hands, seemingly holding bread and a lottery ticket");Thread.sleep(1500);
        System.out.print("Do you grab the bread or the lottery ticket? (bread/ticket):  ");
        //User decides this, which leads to future decisions
        Globals.lottery = !sc.nextLine().equals("bread");
        if(Globals.lottery){System.out.println("Right when you grab the ticket, he hands you a coin to scratch"); Thread.sleep(1500);
            System.out.println("You scratch it off"); Thread.sleep(2000); System.out.println("You get nothing"); Thread.sleep(1500);
            System.out.println("Your stomach starts to rumble, so you ask if you can have the bread");Thread.sleep(1500);
            System.out.println("He starts to hand you the bread, but stops at the last seconds and throws it on the ground");Thread.sleep(1500);
            System.out.println("You try reaching for it, but he stomped on it and destroyed it");Thread.sleep(1500);
        }
        System.out.println("He leaves without saying any words");Thread.sleep(1500);
    }
}

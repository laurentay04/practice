package practice;
import java.util.ArrayList;
import java.util.Scanner;

public class Music_Selector
{
    public static void main (String[] args)
    {
        ArrayList<String> albums = new ArrayList<String>();

        //ateez
        albums.add("Pirate King");
        albums.add("Hala Hala");
        albums.add("Wave");
        albums.add("Wonderland");
        albums.add("Answer");
        albums.add("Guerilla");
        albums.add("Crazy Form");
        albums.add("Work");

        //blackpink
        albums.add("Pink Venom");

        //itzy
        albums.add("Mafia");
        albums.add("Loco");
        albums.add("Sneakers");

        //twice
        albums.add("Feel Special");
        albums.add("Can't Stop Me");
        albums.add("Alcohol Free");
        albums.add("Scientist");
        albums.add("Talk that Talk");
        albums.add("Set Me Free");
        albums.add("Killin Me Good");
        albums.add("I Got You");

        //le sserafim
        albums.add("Fearless");
        albums.add("Antifragile");
        albums.add("Unforgiven");
        albums.add("Easy");
        albums.add("Crazy");

        //gidle
        albums.add("Queencard");
        albums.add("Super Lady");

        //new jeans
        albums.add("Super Shy");

        //aespa
        albums.add("Supernova");

        //extra
        albums.add("Princess and the Pauper");
        albums.add("Dua Lipa");
        albums.add("Ariana Grande");
        //albums.add("Selena Gomez");
        //albums.add("Lemonade Mouth");
        albums.add("brat and it's the same but there's three more songs so it's not");

        System.out.println("I have " + albums.size() + " albums.");
        musicSelect(albums);

    }

    public static void musicSelect(ArrayList<String> arr)
    {
        Scanner in = new Scanner(System.in);
        String input = "";
        boolean done = false;

        //loops until I am done or there are no albums left
        while (!done && arr.size() > 0)
        {
            //randomly selects an album
            int selectionIndex = (int) (Math.random() * arr.size());
            System.out.println("Now playing: " + arr.get(selectionIndex));

            //removes playing album from current list
            arr.remove(selectionIndex);

            System.out.println("Continue? Yes or No");
            input = in.next();

            //stops running if I am done listening
            if (input.equals("no") || input.equals("No") || input.equals("NO") || input.equals("n"))
            {
                done = true;
            }
        }
    }
}
import java.util.Scanner;

public class IanMain2 {


    public static void main(String[] args) {

        System.out.println("Enter a direction: ");

        Room Room1 = new Room("First Room", "This is the first room", "Sword", "Shield ", "Spider");

        if (direction == "North") {

            System.out.println(Room1.name);
            System.out.println(Room1.description);
            System.out.println(Room1.item1);
            System.out.println(Room1.item2);
            System.out.println(Room1.enemy1);

            System.out.println("Where do you want to go now? ");
            Scanner in = new Scanner(System.in);

        }

        System.out.println("End");


    }

class Room {

    public String name;
    public String description;
    public String item1;
    public String item2;
    public String enemy1;

    public String Room(String name, String description, String item1, String item2, String enemy1) { //Constructs a room

        this.name = name;
        this.description = description;
        this.item1 = item1;
        this.item2 = item2;
        this.enemy1 = enemy1;

}



}



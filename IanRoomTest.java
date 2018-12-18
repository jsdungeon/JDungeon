

import java.util.Scanner;

public class IanRoomTest {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a direction: "); //Ask for direction input from keyboard
        String direction = input.nextLine();



        if (direction.equals("North")) { //If they type "North", go to first room

            Room Room1 = new Room("First Room", "This is the first room", "Sword", "Shield ", "Spider");

            System.out.println("Welcome to " + Room1.name);
            System.out.println(Room1.description);
            System.out.println("In the room you can see " +Room1.item1 +
                    " and also " + Room1.item2);
            System.out.println("Be careful! " + " There is a " + Room1.enemy1);


            System.out.println("Where do you want to go now? ");
            direction = input.nextLine();

        }

        if  (direction.equals("South")){ //If they type "South", they would go to another room

            System.out.println("Otherwise, do this and run Room2 ");
        }

        else { //If not "North" or 'South" typed, something else will happen instead
            System.out.println("Nothing happening - More to be added!");
        }




    }

    public static class Room {

        public String name;
        public String description;
        public String item1;
        public String item2;
        public String enemy1;


        public Room(String name, String description, String item1, String item2, String enemy1) {
            this.name = name;
            this.description = description;
            this.item1 = item1;
            this.item2 = item2;
            this.enemy1 = enemy1;



        }







    }

}

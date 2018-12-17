

import java.util.Scanner;

public class IanRoomTest {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a direction: ");
        String direction = input.nextLine();



        if (direction.equals("North")) {

            Room Room1 = new Room("First Room", "This is the first room", "Sword", "Shield ", "Spider");

            System.out.println("Welcome to " + Room1.name);
            System.out.println(Room1.description);
            System.out.println("In the room you can see " +Room1.item1 +
                    " and also " + Room1.item2);
            System.out.println("Be careful! " + " There is a " + Room1.enemy1);


            System.out.println("Where do you want to go now? ");
            direction = input.nextLine();

        }

        else if  (direction.equals("South")){

            System.out.println("Otherwise, do this ");
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

import java.util.Scanner;

public class MainIAN {

       public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome Player to the JDUNGEON OF DOOM!\n\n");
        System.out.print("Please enter your name: ");
        String name;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        System.out.print("\n");
        System.out.println("Welcome in the JDungeon, "+name);


        Scanner scan = new Scanner(System.in);
        System.out.println("Where do you want to go 1 to 9?");
        System.out.print("Enter the room number: ");


        // This method reads the number provided using keyboard
        int num1 = scan.nextInt();
        int playerInRoom = 1;

        int[][] multiples = new int[9][4];
        String[][] yourArray = new String[5][4];

        int [][] room = new int[9][4];

        //room {0} = new int[4];

        room[0][0] = 2;
        room[0][1] = 0;
        room[0][2] = 0;
        room[0][3] = 0;

        room[1][0] = 3;
        room[1][1] = 5;
        room[1][2] = 0;
        room[1][3] = 0;

        room[2][0] = 2;
        room[2][1] = 6;
        room[2][2] = 0;
        room[2][3] = 0;

        room[3][0] = 1;
        room[3][1] = 5;
        room[3][2] = 7;
        room[3][3] = 0;

        room[4][0] = 6;
        room[4][1] = 0;
        room[4][2] = 0;
        room[4][3] = 0;

        room[5][0] = 3;
        room[5][1] = 9;
        room[5][2] = 0;
        room[5][3] = 0;

        room[6][0] = 4;
        room[6][1] = 8;
        room[6][2] = 0;
        room[6][3] = 0;

        room[7][0] = 5;
        room[7][1] = 9;
        room[7][2] = 0;
        room[7][3] = 0;

        room[8][0] = 8;
        room[8][1] = 0;
        room[8][2] = 0;
        room[8][3] = 0;

/*        int [] room2;
        room2 = new int[] {3, 5, 0, 0};

        int [] room3;
        room3 = new int[] {2, 6, 0, 0};

        int [] room4;
        room4 = new int[] {1, 5, 7, 0};

        int [] room5;
        room5 = new int[] {6, 0, 0, 0};

        int [] room6;
        room6 = new int[] {3, 9, 0, 0};

        int [] room7;
        room7 = new int[] {4, 8, 0, 0};

        int [] room8;
        room8 = new int[] {5, 9, 0, 0};

        int [] room9;
        room9 = new int[] {8, 0, 0, 0};*/

        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                if (room[i][j] > 0) {System.out.print(room[i][j] + " ");};
            }
            int wo = 1;
            //for (int element: room[0][0] {
            //    if (element > 0) {
            //    System.out.println(element);}
        }

    }
}


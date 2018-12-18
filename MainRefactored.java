public class MainRefactored {

    // How I would refactor that code / prepare it to further work with it:
// First of all, I would create class called Game with method run() like this:
    public class Game {

        // this is constructor
        public Game() {

        }

        // this is method called "run"
        // it does NOT return anything (void)
        public void run() {

        }

    }

    public static void main(String[] args) {
        // Then create object of that class in main method
        Game game = new Game(); // constructor from Game is called
        // And call it run method
        game.run();
        // remove everyting above that
    }

    // Thanks to this, we are not forced to use static methods and fields
// What is static is not important for now - you can read about that later
// Now start to implements your game in Game class
// I can see that in your code you are creating Scanner few times. Dont. ;)
// Create it once as an field in a Game class, like that:
    public class Game {
        private Scanner scanner;
        public Game() {
            scanner = new Scanner(System.in);
        }
    }

    // Now you can use it enywhere in Game class. But nowhere else (in different
// classes)
// because it is private (it is only for Game class)
// OK, so right now, lets start to implements our mainLoop.
// In class Game, in method run(), create loop, like this:
    public void run() {
        while (gameRunning) {
        }
    }

    // And add "gameRunning" as another field in our class Game, like this:
    public class Game {
        private Scanner scanner;
        private Boolean gameRunning;
        public Game() {
            scanner = new Scanner(System.in);
            gameRunning = true;
        }
    }

// Right now, your program will be working forever.
// Until you change value of gameRunning to false.
// OK, so we have working main loop.
// Right now lets determine what steps we want to perform each time in loop
while(gameRunning) {
        // 1) Display information that are necessary for user
        String input = scanner.nextLine(); // 2) Read input from user
        // 2) Determine if user enter correct command
        // and if yes, do something with it
        // 3) Check if user won / lost
        // and if so, change gameRunning to false
    }

    // OK, let's take care for each steps, starting from bullet 3
// create new method in Game class:
// This method will return Boolean value [true/false]
    private Boolean continueGame() {
        // put code that checks if user won or lost
        // if (somethig) {
        //    return false; // it's end of game
        // } else {
        //    return true; // it's not end of game
        // }
    }

// and use that new method in main loop:
while(gameRunning) {
        // 1) Display information that are necessary for user
        String input = scanner.nextLine(); // 2) Read input from user
        // 2) Determine if user enter correct command
        // and if yes, do something with it
        gameRunning = continueGame();
    }

    // OK, so lets take care about user input...
// let's create new method in Game class
    private void parseInput(String input) {
        String command = input.toLowerCase() // toLowerCase will change all letters to small one
                .trim(); // trim will remove spaces on begining and end of user input
        if ("left".equals(command)) {
            // go left
        } else if ("right".equals(command)) {
            // go right
        } else if ("up".equals(command)) {
            // go up
        } else if ("down".equals(command)) {
            // go down
        } else {
            System.out.println("Unknown command");
        }
    }

// And let's use it in our game loop...
while(gameRunning) {
        // 1) Display information that are necessary for user
        String input = scanner.nextLine();
        parseInput(input);
        gameRunning = continueGame();
    }

// Also move declaration of "room" to Game class (see scanner and gameRunning).
// Try to create different method for all commands (up, down, left...).
// Try to use as little class fields (scanner, gameRunning, etc.) as possible.
// Only variables that will be used EVERYWHERE should be declared as that.


}

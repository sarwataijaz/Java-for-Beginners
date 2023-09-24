public class Echo {
    // we will learn to print this 'args' parameter, but we can only do it if it would contain some value
    // initially its empty, but we can pass the arguments through command line
    // in order to pass something, we need to use the command line only

    public static void main(String[] args) {

        // for converting string to int by using wrapper class functions of primitive data types

        int sum = 0; // only int value will be passed as an argument


        for(int i = 0; i < args.length; i++) {

            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum is: " + sum);

        // by writing commands like, javac Echo.java for compilation
        // java Echo sarwat aijaz for running the program, where after the file name we have written two string arguments
        // you will see the output in the command line
        // BUTT make sure from navigating from some other drives, like from C to D
        // run D:
        // then navigate to the folder by running the cd command

    }
}

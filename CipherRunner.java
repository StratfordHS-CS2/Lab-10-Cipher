import java.util.Scanner;

/**
 * Displays and manages input for a menu of options.
 * Allows the user to select which cipher and whether
 * to encode or decode.
 *
 * YOU DO NOT NEED TO EDIT THIS FILE.
 *
 * @author Dave Avis
 * @version 11.3.2018
 */
public class CipherRunner
{
    public static void main( String[] args )
    {
        int cipher = 0;
        int operation = 0;

        do{
            operation = printOpMenu();
            if( operation != 0 )
            {
                cipher = printCipherMenu();

                switch( cipher ){
                    case 1: doReverse( operation ); break;
                    case 2: doRotation( operation ); break;
                    case 3: doVigenere( operation ); break;
                    default: System.out.println("ERROR"); break;
                }
            }
        } while( operation != 0 );
        System.out.println("Exiting...");
    }

    /**
     * Prints the menu where the operation is selected.
     *
     * @return the option selected.
     */
    private static int printOpMenu()
    {
        Scanner keyboard = new Scanner( System.in );

        System.out.println();
        System.out.println("OPERATIONS:");
        System.out.println("1. Encode");
        System.out.println("2. Decode");
        System.out.println("0. Quit");
        System.out.print("Select an operation: ");
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        return choice;
    }

    /**
     * Prints the menu where the cipher is selected.
     *
     * @return the cipher selected.
     */
    private static int printCipherMenu()
    {
        Scanner keyboard = new Scanner( System.in );

        System.out.println();
        System.out.println("CIPHERS:");
        System.out.println("1. Reverse Cipher");
        System.out.println("2. Rotation Cipher");
        System.out.println("3. Vigenere Cipher");
        System.out.print("Select a cipher: ");
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        return choice;
    }

    /**
     * Calls the Reverse cipher.
     *
     * @param  op  the option selected.
     */
    private static void doReverse( int op )
    {
        Reverse rev = new Reverse();
        Scanner keyboard = new Scanner( System.in );

        System.out.println();
        System.out.println("Enter the message:");
        String msg = keyboard.nextLine();

        switch( op ){
            case 1: System.out.println( rev.encode(msg) ); break;  //encode
            case 2: System.out.println( rev.decode(msg) ); break;  //decode
            default: System.out.println("ERROR");
        }
    }

    /**
     * Calls the Rotation cipher.
     *
     * @param  op  the option selected.
     */
    private static void doRotation( int op )
    {
        Rotation rotator = new Rotation();
        Scanner keyboard = new Scanner( System.in );

        System.out.println();
        System.out.print("Enter rotation amount: ");
        int rot = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter the message:");
        String msg = keyboard.nextLine();

        switch( op ){
            case 1: System.out.println( rotator.encode(msg, rot) ); break;  //encode
            case 2: System.out.println( rotator.decode(msg, rot) ); break;  //decode
            default: System.out.println("ERROR");
        }
    }

    /**
     * Calls the Vigenere cipher.
     *
     * @param  op  the option selected.
     */
    private static void doVigenere( int op )
    {
        Vigenere v = new Vigenere();
        Scanner keyboard = new Scanner( System.in );

        System.out.println();
        System.out.print("Enter key: ");
        String key = keyboard.nextLine();
        System.out.println("Enter the message:");
        String msg = keyboard.nextLine();

        switch( op ){
            case 1: System.out.println( v.encode(msg, key) ); break;
            case 2: System.out.println( v.decode(msg, key) ); break;
            default: System.out.println("ERROR");
        }
    }
}

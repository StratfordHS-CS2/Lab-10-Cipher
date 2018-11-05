/**
 * You will be implementing the Vigenere cipher. Two parameters are necessary for encoding or decoding.
 *
 * String msg - this is the message to be encoded or decoded
 * String key - this is the key to the cipher
 *
 * You should remove any spaces and make the output all uppercase.
 *
 * OPTION: You may call your Rotation class encoding and decoding methods while implementing this cipher.
 *         You can also implement this cipher without refering to your Rotation class.
 *
 * Reference:
 * https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher
 *
 * Example:
 * System.out.println( Vigenere.encode( "My Message", "COSCI" ) ); // outputs OMEGAUOYG
 * System.out.println( Vigenere.decode( "OMEGAUOYG", "COSCI") );   // outputs MYMESSAGE
 */

public class Vigenere
{
    public String encode( String msg, String key )
    {
        msg = msg.toUpperCase();
        key = key.toUpperCase();
        String out = "";

        return out;
    }

    public String decode( String msg, String key )
    {
        msg = msg.toUpperCase();
        key = key.toUpperCase();
        String out = "";

        return out;
    }
}

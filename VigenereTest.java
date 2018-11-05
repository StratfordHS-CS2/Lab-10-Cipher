import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing the Vigenere Cipher.
 *
 * @author Dave Avis
 * @version 11.3.2018
 */
public class VigenereTest
{
    /**
     * Testing the encoding method of the Vigenere cipher.
     */
    @Test(timeout=2000)
    public void encodeTest()
    {
        String[] plain = {"Computer Science", "TestingTesting", "A long message in a bottle"};
        String[] key   = {"Testing",          "xkcd",           "ThisIsAKey"};
        String[] coded = {"VSEICGKKWUBMAIX",  "QOUWFXIWBCVLKQ", "TSWFOEECWYZLQFITODXJX"};

        Vigenere v;
        for( int i = 0; i < plain.length; i++ )
        {
            v = new Vigenere();
            String testName = "Test: Vigenere->Encode->" + plain[i] + "->key(" + key[i] + ")";
            String input = v.encode( plain[i], key[i] );
            String expectedOutput = coded[i];
            assertEquals( testName, expectedOutput, input );
        }
    }

    /**
     * Testing the decoding method of the Vigenere cipher.
     */
    @Test(timeout=2000)
    public void decodeTest()
    {
        String[] plain = {"Computer Science", "TestingTesting", "A long message in a bottle"};
        String[] key   = {"Testing",          "xkcd",           "ThisIsAKey"};
        String[] coded = {"VSEICGKKWUBMAIX",  "QOUWFXIWBCVLKQ", "TSWFOEECWYZLQFITODXJX"};

        Vigenere v;
        for( int i = 0; i < coded.length; i++ )
        {
            v = new Vigenere();
            String testName = "Test: Vigenere->Decode->" + coded[i] + "->key(" + key[i] + ")";
            String input = v.decode( coded[i], key[i] );
            String expectedOutput = plain[i].toUpperCase().replaceAll("\\s+","");
            assertEquals( testName, expectedOutput, input );
        }
    }
}

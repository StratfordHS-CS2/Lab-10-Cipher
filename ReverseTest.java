import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing the Reverse cipher.
 * 
 * @author Dave Avis
 * @version 11.3.2018
 */
public class ReverseTest
{
    /**
     * Testing the encoding method of the Reverse cipher.
     */
    @Test(timeout=2000)
    public void encodeTest()
    {
        String[] plain = {"Computer Science", "TestingTesting", "A long message in a bottle"};
        String[] coded = {"ECNEICSRETUPMOC",  "GNITSETGNITSET", "ELTTOBANIEGASSEMGNOLA"};

        Reverse r;
        for( int i = 0; i < plain.length; i++ )
        {
            r = new Reverse();
            String input = r.encode( plain[i] );
            String expectedOutput = coded[i];
            assertEquals("Test: Reverse->Encode->" + plain[i], expectedOutput, input );
        }
    }

    /**
     * Testing the decoding method of the Reverse cipher.
     */
    @Test(timeout=2000)
    public void decodeTest()
    {
        String[] plain = {"Computer Science", "TestingTesting", "A long message in a bottle"};
        String[] coded = {"ECNEICSRETUPMOC",  "GNITSETGNITSET", "ELTTOBANIEGASSEMGNOLA"};

        Reverse r;
        for( int i = 0; i < coded.length; i++ )
        {
            r = new Reverse();
            String input = r.decode( coded[i] );
            String expectedOutput = plain[i].toUpperCase().replaceAll("\\s+","");
            assertEquals("Test: Reverse->Decode->" + coded[i], expectedOutput, input );
        }
    }
}
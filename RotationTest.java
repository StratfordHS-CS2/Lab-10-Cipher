import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing the Rotation cipher.
 * 
 * @author Dave Avis
 * @version 11.3.2018
 */
public class RotationTest
{
    /**
     * Testing the encoding method of the Rotation cipher.
     */
    @Test(timeout=2000)
    public void encodeTest()
    {
        String[] plain = {"Computer Science", "TestingTesting", "A long message in a bottle"};
        int[] rotation = { 5,                  18,               13 };
        String[] coded = {"HTRUZYJW XHNJSHJ", "LWKLAFYLWKLAFY", "N YBAT ZRFFNTR VA N OBGGYR"};

        Rotation r;
        for( int i = 0; i < plain.length; i++ )
        {
            r = new Rotation();
            String testName = "Test: Rotation->Encode->" + plain[i] + "->rot(" + rotation[i] + ")";
            String input = r.encode( plain[i], rotation[i] );
            String expectedOutput = coded[i];
            String alternateOutput = coded[i].replaceAll("\\s+","");
            //assertEquals( testName, expectedOutput, input );
            assertTrue( input.equals(expectedOutput) || input.equals(alternateOutput) );
        }
    }

    /**
     * Testing the decoding method of the Rotation cipher.
     */
    @Test(timeout=2000)
    public void decodeTest()
    {
        String[] plain = {"Computer Science", "TestingTesting", "A long message in a bottle"};
        int[] rotation = { 5,                  18,               13 };
        String[] coded = {"HTRUZYJW XHNJSHJ", "LWKLAFYLWKLAFY", "N YBAT ZRFFNTR VA N OBGGYR"};

        Rotation r;
        for( int i = 0; i < coded.length; i++ )
        {
            r = new Rotation();
            String testName = "Test: Rotation->Decode->" + coded[i] + "->rot(" + rotation[i] + ")";
            String input = r.decode( coded[i], rotation[i] );
            String expectedOutput = plain[i].toUpperCase().replaceAll("\\s+","");
            String alternateOutput = plain[i].toUpperCase();
            //assertEquals( testName, expectedOutput, input );
            assertTrue( input.equals(expectedOutput) || input.equals(alternateOutput) );
        }
    }
}
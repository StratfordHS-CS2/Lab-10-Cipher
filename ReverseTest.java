import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing the Reverse cipher.
 * 
 * @author Dave Avis
 * @version 12.7.2018
 */
public class ReverseTest
{
    private Reverse r = new Reverse();
    
    /**
     * Encoded message should be all caps.
     */
    @Test(timeout=2000)
    public void encodeCaseTest()
    {
        assertEquals("Your encoded message is not all caps.", "AAA", r.encode("aaa") );
    }
    
    /**
     * Encoded message shouldn't have spaces.
     */
    @Test(timeout=2000)
    public void removeSpacesTest()
    {
        assertEquals("You did not remove spaces from the message.", "AA", r.encode("A A"));
    }
    
    /**
     * Encoding a single letter.
     */
    @Test(timeout=2000)
    public void singleLetterEncodeTest()
    {
        assertEquals("Single letter encode failed.", "C", r.encode("C") );
    }
    
    /**
     * Encoding a string with no spaces.
     */
    @Test(timeout=2000)
    public void encodeStringNoSpacesTest()
    {
        assertEquals("Encoding string with no spaces failed.", "GNITSETGNITSET", r.encode("TESTINGTESTING") );
    }
    
    /**
     * Encoding a string with spaces.
     */
    @Test(timeout=2000)
    public void encodeStringWithSpacesTest()
    {
        assertEquals("Encoding string with spaces failed.", "ECNEICSRETUPMOC", r.encode("COMPUTER SCIENCE") );
    }
    
    /**
     * Decoding a single letter.
     */
    @Test(timeout=2000)
    public void singleLetterDecodeTest()
    {
        assertEquals("Single letter decode failed.", "C", r.decode("C") );
    }
    
    /**
     * Decoding a string.
     */
    @Test(timeout=2000)
    public void decodeStringTest()
    {
        assertEquals("Decoding a string failed.", "TESTINGTESTING", r.decode("GNITSETGNITSET") );
    }
}
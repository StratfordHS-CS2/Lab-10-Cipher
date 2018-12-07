import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing the Rotation cipher.
 * 
 * @author Dave Avis
 * @version 12.7.2018
 */
public class RotationTest
{
    private Rotation r = new Rotation();
    
    /**
     * The encoded message should be all caps.
     */
    @Test(timeout=2000)
    public void encodeCaseTest()
    {
        assertEquals("Your encoded message is not all caps.", "BBB", r.encode("aaa", 1) );
    }
    
    /**
     * Spaces should be removed from the message.
     */
    @Test(timeout=2000)
    public void removeSpacesTest()
    {
        assertEquals("You did not remove spaces from the message.", "BB", r.encode("A A", 1));
    }
    
    /**
     * Encoding a single letter with no wrapping.
     */
    @Test(timeout=2000)
    public void singleLetterEncodeTest()
    {
        assertEquals("Single letter encode failed.", "D", r.encode("C", 1) );
    }
    
    /**
     * Encoding a string with spaces and no wrapping.
     */
    @Test(timeout=2000)
    public void encodeStringNoSpacesNoWrapTest()
    {
        assertEquals("Encoding string with no spaces failed.", "BCD", r.encode("ABC", 1) );
    }
    
    /**
     * Encoding a string with spaces and no wrapping.
     */
    @Test(timeout=2000)
    public void encodeStringWithSpacesNoWrapTest()
    {
        assertEquals("Encoding string with spaces failed.", "BC", r.encode("A B", 1) );
    }
    
    /**
     * Encoding with a wrap around the end.
     */
    @Test(timeout=2000)
    public void rotateAroundEndTest()
    {
        assertEquals("Encoding wrap around end failed.", "ABC", r.encode("XYZ", 3) );
    }
    
    /**
     * Single letter decode with no wrapping.
     */
    @Test(timeout=2000)
    public void singleLetterDecodeNoWrapTest()
    {
        assertEquals("Single letter decode failed.", "B", r.decode("C", 1) );
    }
    
    /**
     * String decoding with no wrapping.
     */
    @Test(timeout=2000)
    public void decodeStringNoWrapTest()
    {
        assertEquals("Decoding a string failed.", "ABC", r.decode("BCD", 1) );
    }
    
    /**
     * Decoding with a wrap around the end.
     */
    @Test(timeout=2000)
    public void decodeStringWithWrapTest()
    {
        assertEquals("Decoding a string with wrapping failed.", "XYZ", r.decode("ABC", 3) );
    }
}
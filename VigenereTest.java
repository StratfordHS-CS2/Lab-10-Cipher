import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing the Vigenere Cipher.
 * 
 * @author Dave Avis
 * @version 12.7.2018
 */
public class VigenereTest
{
    private Vigenere r = new Vigenere();
    
    /**
     * The encoded message should be all caps.
     */
    @Test(timeout=2000)
    public void encodeCaseTest()
    {
        assertEquals("Your encoded message is not all caps.", "BBB", r.encode("aaa", "B") );
    }
    
    /**
     * The key should be made all caps.
     */
    @Test(timeout=2000)
    public void keyCaseTest()
    {
        assertEquals("You did not make the key all caps.", "BBB", r.encode("AAA","bbb") );
    }
    
    /**
     * Spaces should be removed from the message while encoding.
     */
    @Test(timeout=2000)
    public void removeSpacesTest()
    {
        assertEquals("You did not remove spaces from the message.", "BB", r.encode("A A", "BBB"));
    }
    
    /**
     * Testing encode when the key is shorter than the message.
     */
    @Test(timeout=2000)
    public void shortKeyEncodeTest()
    {
        assertEquals("Encode failed when they key is shorter than the message.", "BCD", r.encode("ABC","B") );
    }
    
    /**
     * Testing encoding a single letter with no wrapping.
     */
    @Test(timeout=2000)
    public void singleLetterEncodeTest()
    {
        assertEquals("Single letter encode failed.", "D", r.encode("C", "B") );
    }
    
    /**
     * Testing encoding a string with no spaces and no wrap.
     */
    @Test(timeout=2000)
    public void encodeStringNoSpacesNoWrapTest()
    {
        assertEquals("Encoding string with no spaces failed.", "BCD", r.encode("ABC", "BBB") );
    }
    
    /**
     * Testing encoding a string with spaces and no wrap.
     */
    @Test(timeout=2000)
    public void encodeStringWithSpacesNoWrapTest()
    {
        assertEquals("Encoding string with spaces failed.", "BC", r.encode("A B", "BBB") );
    }
    
    /**
     * Testing encoding with a wrap around the end of the alphabet.
     */
    @Test(timeout=2000)
    public void encodeRotateAroundEndTest()
    {
        assertEquals("Encoding wrap around end failed.", "ABC", r.encode("XYZ", "DDD") );
    }
    
    /**
     * Testing decoding when the key is shorter than the message.
     */
    @Test(timeout=2000)
    public void shortKeyDecodeTest()
    {
        assertEquals("Decode failed when they key is shorter than the message.", "ABC", r.decode("BCD","B") );
    }
    
    /**
     * Testing decoding a single letter with no wrapping.
     */
    @Test(timeout=2000)
    public void singleLetterDecodeTest()
    {
        assertEquals("Single letter decode failed.", "C", r.decode("D", "B") );
    }
    
    /**
     * Testing decoding a string with no wrapping.
     */
    @Test(timeout=2000)
    public void decodeStringNoWrapTest()
    {
        assertEquals("Decoding string with no wrapping failed.", "ABC", r.decode("BCD", "BBB") );
    }
    
    /**
     * Testing decoding with wrapping.
     */
    @Test(timeout=2000)
    public void decodeRotateAroundEndTest()
    {
        assertEquals("Decoding wrap around end failed.", "XYZ", r.decode("ABC", "DDD") );
    }
}
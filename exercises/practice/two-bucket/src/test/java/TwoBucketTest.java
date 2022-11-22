import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


import static org.assertj.core.api.Assertions.*;

public class TwoBucketTest {
	//checking for negative desired
	@Test
	public void testBucketOneSizeFiveTwoSizeOneStartWithOne() {
		TwoBucket twoBucket = new TwoBucket(5, 1, -1, "one");
		assertThat(twoBucket.getClass() == null).withFailMessage("Negative Desired Liters Not Handled");
	}
	
	//checking for negative capacity
	public void testBucketOneSizeFiveTwoSizeNegOneStartWithOne() {
		TwoBucket twoBucket = new TwoBucket(5, -1, 4, "one");
		assertThat(twoBucket.getClass() == null).withFailMessage("Negative Capacity Not Handled");
	}
	
    @Test
    public void testBucketOneSizeThreeBucketTwoSizeFiveStartWithOne() {

        TwoBucket twoBucket = new TwoBucket(3, 5, 1, "one");

        assertEquals(4, twoBucket.getTotalMoves());
        assertEquals("one", twoBucket.getFinalBucket());
        assertEquals(5, twoBucket.getOtherBucket());

    }

    @Ignore("Remove to run test")
    @Test
    public void testBucketOneSizeThreeBucketTwoSizeFiveStartWithTwo() {

        TwoBucket twoBucket = new TwoBucket(3, 5, 1, "two");

        assertEquals(8, twoBucket.getTotalMoves());
        assertEquals("two", twoBucket.getFinalBucket());
        assertEquals(3, twoBucket.getOtherBucket());

    }

    @Ignore("Remove to run test")
    @Test
    public void testBucketOneSizeSevenBucketTwoSizeElevenStartWithOne() {

        TwoBucket twoBucket = new TwoBucket(7, 11, 2, "one");

        assertEquals(14, twoBucket.getTotalMoves());
        assertEquals("one", twoBucket.getFinalBucket());
        assertEquals(11, twoBucket.getOtherBucket());

    }

    @Ignore("Remove to run test")
    @Test
    public void testBucketOneSizeSevenBucketTwoSizeElevenStartWithTwo() {

        TwoBucket twoBucket = new TwoBucket(7, 11, 2, "two");

        assertEquals(18, twoBucket.getTotalMoves());
        assertEquals("two", twoBucket.getFinalBucket());
        assertEquals(7, twoBucket.getOtherBucket());

    }

    @Ignore("Remove to run test")
    @Test
    public void testBucketOneSizeOneBucketTwoSizeThreeStartWithTwo() {

        TwoBucket twoBucket = new TwoBucket(1, 3, 3, "two");

        assertEquals(1, twoBucket.getTotalMoves());
        assertEquals("two", twoBucket.getFinalBucket());
        assertEquals(0, twoBucket.getOtherBucket());

    }

    @Ignore("Remove to run test")
    @Test
    public void testBucketOneSizeTwoBucketTwoSizeThreeStartWithOne() {

        TwoBucket twoBucket = new TwoBucket(2, 3, 3, "one");

        assertEquals(2, twoBucket.getTotalMoves());
        assertEquals("two", twoBucket.getFinalBucket());
        assertEquals(2, twoBucket.getOtherBucket());

    }
}

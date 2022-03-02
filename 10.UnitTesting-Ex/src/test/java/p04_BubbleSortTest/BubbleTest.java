package p04_BubbleSortTest;


import org.junit.Assert;
import org.junit.Test;


public class BubbleTest {

    private static final int[] array = new int[]{3, 2, 8, 7, 7, 11, 9, 12};
    private static final int[] sameArrayDiffPositions = new int[]{2, 3, 7, 7, 8, 9, 11, 12};

    @Test
    public void testCorrectSortedBubble() {
        Bubble.sort(array);
        Bubble.sort(sameArrayDiffPositions);

        Assert.assertArrayEquals(sameArrayDiffPositions, array);

    }
}
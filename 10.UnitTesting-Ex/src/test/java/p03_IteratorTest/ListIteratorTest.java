package p03_IteratorTest;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class ListIteratorTest {

    ListIterator listIterator;
    private static final String[] NAMES = new String[]{"Marin", "Angel", "Pesho", "Kircho"};

    @Before
    public void setUp() throws OperationNotSupportedException {
        listIterator = new ListIterator(NAMES);
    }


    @Test(expected = OperationNotSupportedException.class)
    public void constructorShouldThrowException() throws OperationNotSupportedException {
        new ListIterator(null);
    }

    @Test
    public void testSuccessfullyCreateInstance() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator(NAMES);
    }

    @Test
    public void testHasNext() {
        assertTrue(listIterator.hasNext());
        listIterator.move();
        assertTrue(listIterator.hasNext());
        listIterator.move();
        assertTrue(listIterator.hasNext());
        listIterator.move();
        assertFalse(listIterator.hasNext());
    }

    @Test
    public void testMove() {
        assertTrue(listIterator.move());
        assertTrue(listIterator.move());
        assertTrue(listIterator.move());
        assertFalse(listIterator.move());
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintShouldThrowException() throws OperationNotSupportedException {
        listIterator = new ListIterator();
        listIterator.print();
    }

    @Test
    public void testPrintSuccess() {
        int index = 0;
        while (listIterator.hasNext()) {
            Assert.assertEquals(NAMES[index], listIterator.print());
            listIterator.move();
            index++;
        }
    }

}
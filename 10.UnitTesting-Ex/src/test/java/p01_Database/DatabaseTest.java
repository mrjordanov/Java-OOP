package p01_Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {


    private static final Integer[] NUMBERS = {1, 2, 3, 4};
    private static final int TOO_BIG_NUMBER = 17;

    private Database database;

    @Before
    public void setUp() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    // Test the happy path (create instance)
    @Test
    public void testConstructorShouldCreateValidDatabase() throws OperationNotSupportedException {
        Integer[] dbElements = database.getElements();
        assertEquals("Count of db elements is incorrect", dbElements.length, NUMBERS.length);

        Assert.assertArrayEquals(dbElements, NUMBERS);
       /* for (int i = 0; i < NUMBERS.length; i++) {
            assertEquals("We have different elements in the database", dbElements[i], NUMBERS[i]);
        }*/
    }


    // If C-tor takes more than 16 elements throw Exception....
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowExceptionForMoteThan16Elements() throws OperationNotSupportedException {
        Integer[] largeArray = new Integer[TOO_BIG_NUMBER];
        Database failDataBase = new Database(largeArray);
    }

    // If C-tor takes less than 1 elements throw Exception....
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowExceptionForLessThan1Elements() throws OperationNotSupportedException {
        Integer[] smallArray = new Integer[0];
        new Database(smallArray);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testThatTheGivenElementToAddIsNullThrowsException() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testShouldAddElement() throws OperationNotSupportedException {
        database.add(6);

        Integer[] dbElements = database.getElements();

        Assert.assertEquals(NUMBERS.length + 1, dbElements.length);
        Assert.assertEquals(Integer.valueOf(6), dbElements[dbElements.length - 1]);
    }


    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveElementThrowsException() throws OperationNotSupportedException {
        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }
        database.remove();
    }


    @Test
    public void testRemoveElement() throws OperationNotSupportedException {
        database.remove();
        Integer[] dbElements = database.getElements();

        Assert.assertEquals(NUMBERS.length - 1, dbElements.length);
    }

}
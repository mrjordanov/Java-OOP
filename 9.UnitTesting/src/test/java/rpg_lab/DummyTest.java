package rpg_lab;


import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class DummyTest {

    private static final int HEALTH = 100;
    private static final int XP = 100;



    private Dummy dummy;
    private Dummy deadDummy;

    @Before
    public void setUp() {
        this.dummy = new Dummy(HEALTH, XP);
        this.deadDummy = new Dummy(0, XP);

    }

    @Test
    public void testDummyLosesHealthWhenAttacked() {
        int attackPoints = 10;
        dummy.takeAttack(attackPoints);
        assertEquals(HEALTH - attackPoints, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyThrowsWhenAttacked() {
        deadDummy.takeAttack(10);
    }

    @Test
    public void testDeadDummyGivesExperience() {
        int actual = deadDummy.giveExperience();
        assertEquals(XP, actual);
        // assertTrue(deadDummy.getHealth()<=0);
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyThrowsWhenDoNotGivesExperience() {
        dummy.giveExperience();
    }

}
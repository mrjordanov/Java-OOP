package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AxeTest {



    private Dummy dummy;
    private Axe axe;
    private Axe brokenAxe;

    @Before
    public void setUp() {
        this.axe = new Axe(10, 10);
        this.brokenAxe = new Axe(10, 0);
        this.dummy = new Dummy(100, 100);
    }

    @Test
    public void testWeaponLosesDurabilityAfterAttack() {
        axe.attack(dummy);
        Assert.assertEquals(9, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAxeAttackThrowsIfAxeHaveZeroDurability() {
        brokenAxe.attack(dummy);
    }


}
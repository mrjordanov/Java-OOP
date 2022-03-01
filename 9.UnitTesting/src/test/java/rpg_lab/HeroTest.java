package rpg_lab;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class HeroTest {

   /* private static class FakeAxe implements Weapon {

        @Override
        public int getAttackPoints() {
            return 0;
        }

        @Override
        public int getDurabilityPoints() {
            return 0;
        }

        @Override
        public void attack(Target target) {

        }
    }


    private static class FakeTarget implements Target {

        @Override
        public int getHealth() {
            return 0;
        }

        @Override
        public void takeAttack(int attackPoints) {

        }

        @Override
        public int giveExperience() {
            return 100;
        }

        @Override
        public boolean isDead() {
            return true;
        }
    }


    private static class AliveTarget implements Target {

        @Override
        public int getHealth() {
            return 0;
        }

        @Override
        public void takeAttack(int attackPoints) {

        }

        @Override
        public int giveExperience() {
            return 100;
        }

        @Override
        public boolean isDead() {
            return false;
        }
    }*/


    private Hero hero;

    @Before
    public void setUp() {

        Weapon mockedWeapon = Mockito.mock(Weapon.class);
        this.hero = new Hero("Ragnarok", mockedWeapon);
    }


    @Test
    public void testUponTargetKillHeroGetsXP() {
        Target mockedTarget = Mockito.mock(Target.class);
        Mockito.when(mockedTarget.isDead()).thenReturn(true);
        Mockito.when(mockedTarget.giveExperience()).thenReturn(100);
        this.hero.attack(mockedTarget);
        assertEquals(100, this.hero.getExperience());
    }

    @Test
    public void testUponTargetAttackWhileTargetIsStillAliveHeroGetsNoXP() {
        Target mockedTarget = Mockito.mock(Target.class);
        Mockito.when(mockedTarget.isDead()).thenReturn(false);
        Mockito.when(mockedTarget.giveExperience()).thenReturn(100);
        this.hero.attack(mockedTarget);
        assertEquals(0, this.hero.getExperience());
    }

}
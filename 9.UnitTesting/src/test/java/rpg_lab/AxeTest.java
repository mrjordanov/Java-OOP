package rpg_lab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {


    @Test
    public void testWeaponLosesDurabilityAfterAttack(){
        //Arrange
        Axe axe= new Axe(10,10);
        Dummy dummy =new Dummy(100,100);

        //Act
        axe.attack(dummy);

        //Assert
        //expectations vs reality
        Assert.assertEquals(9,axe.getDurabilityPoints());
    }


   /* @Test
    public void myFirstTest(){
        System.out.println("Hello world! From test");
    }*/
}
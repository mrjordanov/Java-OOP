package barracksWars.core.factories;

import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import barracksWars.models.units.*;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        // TODO: implement for problem 3

      /*  switch (unitType) {

            case "Archer":
                return new Archer();
            case "Pikeman":
                return new Pikeman();
            case "Swordsman":
                return new Swordsman();
            case "Horseman":
                return new Horseman();
            case "Gunner":
                return new Gunner();
        }
        throw new ExecutionControl.NotImplementedException("message");
        */

        try {
            Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<Unit> unitConstructor = unitClass.getDeclaredConstructor();
            return unitConstructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException exception) {
            exception.printStackTrace();
        }

        return null;
    }
}

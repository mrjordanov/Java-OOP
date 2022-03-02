package p06_TirePressureMonitoringSystem;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class AlarmTest {


    private static final double LOW_PRESSURE = 5;
    private static final double HIGH_PRESSURE = 50;
    private static final double PRESSURE_IN_RANGE = 20;


    @Test
    public void testCheckAlarmTurnsOnForLowPressure() {
        Sensor fakeSensor = Mockito.mock(Sensor.class);

        Alarm alarm = new Alarm(fakeSensor);
        when(fakeSensor.popNextPressurePsiValue()).thenReturn(LOW_PRESSURE);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }


    @Test
    public void testCheckAlarmTurnsOnForHighPressure() {
        Sensor fakeSensor = Mockito.mock(Sensor.class);

        Alarm alarm = new Alarm(fakeSensor);
        when(fakeSensor.popNextPressurePsiValue()).thenReturn(HIGH_PRESSURE);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }


    @Test
    public void testCheckAlarmStaysTurnedOff() {
        Sensor fakeSensor = Mockito.mock(Sensor.class);

        Alarm alarm = new Alarm(fakeSensor);
        when(fakeSensor.popNextPressurePsiValue()).thenReturn(PRESSURE_IN_RANGE);
        alarm.check();
        assertFalse(alarm.getAlarmOn());
    }


}
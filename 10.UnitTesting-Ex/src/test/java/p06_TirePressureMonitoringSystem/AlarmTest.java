package p06_TirePressureMonitoringSystem;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AlarmTest {


    @Test
    public void testCheckAlarmTurnsOnForLowPressure() {
       // Sensor sensor = new Sensor();
        Alarm alarm = new Alarm(Mockito.mock(Sensor.class));
        Mockito.when(alarm.check()).thenReturn()
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }
}
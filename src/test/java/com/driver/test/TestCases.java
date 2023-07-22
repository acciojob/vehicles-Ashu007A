package com.driver.test;

import com.driver.Car;
import com.driver.F1;
import com.driver.WaterVehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {

    @Test
    public void testCar() {
        Car car = new Car("Toyota", 4, 4, 5, true, "SUV", 5);

        assertEquals("Toyota", car.getName());
        assertEquals(4, car.getWheels());
        assertEquals(4, car.getDoors());
        assertEquals(5, car.getGears());
        assertEquals(true, car.isManual());
        assertEquals("SUV", car.getType());
        assertEquals(5, car.getSeats());

        car.changeGear(3);
        assertEquals(3, car.getCurrentGear());

        car.changeSpeed(60, 45);
        assertEquals(60, car.getCurrentSpeed());
        assertEquals(45, car.getCurrentDirection());

        car.stop();
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    public void testF1() {
        F1 f1 = new F1("Mercedes", false);

        assertEquals("Mercedes", f1.getName());
        assertEquals(false, f1.isManual());

        f1.accelerate(40);
        assertEquals(40, f1.getCurrentSpeed());
        assertEquals(0, f1.getCurrentDirection());

        f1.accelerate(30);
        assertEquals(70, f1.getCurrentSpeed());
        assertEquals(0, f1.getCurrentDirection());

        f1.accelerate(-50);
        assertEquals(20, f1.getCurrentSpeed());
        assertEquals(0, f1.getCurrentDirection());

        f1.stop();
        assertEquals(0, f1.getCurrentSpeed());
    }

    @Test
    public void testBoat() {
        WaterVehicle boat = new Boat("Speedboat", 8);

        assertEquals("Speedboat", boat.getVehicleName());
        assertEquals(8, boat.getVehicleCapacity());
    }
}

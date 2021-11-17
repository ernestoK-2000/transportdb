package cu.edu.cujae.transportdb;

import cu.edu.cujae.transportdb.dto.CarDto;
import cu.edu.cujae.transportdb.services.CarServices;
import cu.edu.cujae.transportdb.services.ServicesLocator;

import java.sql.SQLException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CarServices cs = ServicesLocator.getCarServices();

        try {
            LinkedList<CarDto> carNames = cs.getAllCars();
            System.out.println("Cars:");
            for (CarDto carDto :
                    carNames) {
                System.out.println("id_car: " + carDto.getIdCar());
                System.out.println("car_number: " + carDto.getCarNumber());
                System.out.println("car_brand: " + carDto.getCarBrand());
                System.out.println("car_seats: " + carDto.getCarSeats());
                System.out.println("km_available: " + carDto.getKmAvailable());
                System.out.println();
            }
            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

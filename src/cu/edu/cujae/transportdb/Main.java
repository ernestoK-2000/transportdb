package cu.edu.cujae.transportdb;

import cu.edu.cujae.transportdb.visual.Principal;

public class Main {
    public static void main(String[] args) {

        Principal frame = new Principal();
        frame.setVisible(true);

        //CarServices cs = ServicesLocator.getCarServices();
        //try {
            //cs.insertCar(new CarDto(0, "0000000000", "Toyota", 4, 1000));



        //} catch (SQLException e) {
            //e.printStackTrace();
       // }

        /*CarServices cs = ServicesLocator.getCarServices();

        try {
            LinkedList<CarDto> carNames = cs.getAllInfo();
            System.out.println("Cars:");
            for (CarDto carDto :
                    carNames) {
                System.out.println(carDto.toString());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }*/

        /** REMEMBER
         * Actualizar lista dto al modificar, insertar o eliminar registros
         */
    }
}

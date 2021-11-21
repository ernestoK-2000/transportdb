package cu.edu.cujae.transportdb;

import cu.edu.cujae.transportdb.visual.Window;

public class Main {
    public static void main(String[] args) {

        Window w = new Window();
        w.setBounds(100, 100, 500, 500);
        w.setVisible(true);



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
    }
}

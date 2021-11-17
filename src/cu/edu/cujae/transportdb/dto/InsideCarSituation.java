package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;

public class InsideCarSituation extends CarSituation{

    private Calendar returnDate;

    public InsideCarSituation(String idCarSituation, Calendar date, String idCarSituationType, String idCar, Calendar returnDate) {
        super(idCarSituation, date, idCarSituationType, idCar);
        this.returnDate = returnDate;
    }

    public Calendar getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Calendar returnDate) {
        this.returnDate = returnDate;
    }
}

package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;

public class InsideDriverSituationDto extends DriverSituationDto {

    private Calendar returnDate;

    public InsideDriverSituationDto(String idDriverSituation, Calendar date, String idDriverSituationType, String idDriver, Calendar returnDate) {
        super(idDriverSituation, date, idDriverSituationType, idDriver);
        this.returnDate = returnDate;
    }

    public Calendar getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Calendar returnDate) {
        this.returnDate = returnDate;
    }
}

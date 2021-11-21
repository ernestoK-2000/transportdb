package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;
import java.util.Date;

public class InsideCarSituationDto {

    private final int idCarSituation;
    private Date returnDate;
    private Date date;

    public InsideCarSituationDto(int idCarSituation, Date date, Date returnDate) {
        this.returnDate = returnDate;
        this.idCarSituation = idCarSituation;
        this.date = date;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getIdCarSituation() {
        return idCarSituation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

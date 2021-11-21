package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;
import java.util.Date;

public class InsideDriverSituationDto {

    private Date date;
    private Date returnDate;
    private final int idDriverSituation;

    public InsideDriverSituationDto(int idDriverSituation, Date returnDate, Date date) {
        this.returnDate = returnDate;
        this.idDriverSituation = idDriverSituation;
        this.date = date;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getIdDriverSituation() {
        return idDriverSituation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

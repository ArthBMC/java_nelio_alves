package section14.exceptionsTreatment.model.entities;

import section14.exceptionsTreatment.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNUmber;
    private Date checkIn;
    private Date checkOut;

    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNUmber, Date checkIn, Date checkOut) throws DomainException{
        if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNUmber = roomNUmber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration (){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException{

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNUmber() {
        return roomNUmber;
    }

    public void setRoomNUmber(Integer roomNUmber) {
        this.roomNUmber = roomNUmber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    @Override
    public String toString() {
        return "Room " +
               roomNUmber +
               ", checkin: " +
               sdf1.format(checkIn) +
               ", checkout: " +
               sdf1.format(checkOut) +
               ", " +
               duration()+
                " nights";
    }

}

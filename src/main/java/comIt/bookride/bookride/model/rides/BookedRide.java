package comIt.bookride.bookride.model.rides;

import comIt.bookride.bookride.model.BookingStatus;
import comIt.bookride.bookride.model.user.CarOwner;
import comIt.bookride.bookride.model.user.UserProfile;

public class BookedRide {

    private long id;
    private CarOwner rideOwner;
    private OfferedTrips bookTrip;
    private UserProfile rider;
    private BookingStatus rideStatus;

    public BookedRide() {
    }

    public BookedRide(CarOwner rideOwner, OfferedTrips bookTrip, UserProfile rider, BookingStatus rideStatus) {
        this.rideOwner = rideOwner;
        this.bookTrip = bookTrip;
        this.rider = rider;
        this.rideStatus = rideStatus;
    }

    public CarOwner getRideOwner() {
        return rideOwner;
    }

    public void setRideOwner(CarOwner rideOwner) {
        this.rideOwner = rideOwner;
    }

    public OfferedTrips getBookTrip() {
        return bookTrip;
    }

    public void setBookTrip(OfferedTrips bookTrip) {
        this.bookTrip = bookTrip;
    }

    public UserProfile getRider() {
        return rider;
    }

    public void setRider(UserProfile rider) {
        this.rider = rider;
    }

    public BookingStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(BookingStatus rideStatus) {
        this.rideStatus = rideStatus;
    }
}

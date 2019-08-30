package comIt.bookride.bookride.model.rides;

import comIt.bookride.bookride.model.user.CarOwner;

import java.time.LocalTime;

public class OfferedTrips {
    private long id;
    private CarOwner carOwner;
    private LocalTime tripStartTime;
    private String startLocation;
    private String endLocation;

    public OfferedTrips() {
    }

    public OfferedTrips(CarOwner carOwner, LocalTime tripStartTime, String startLocation, String endLocation) {
        this.carOwner = carOwner;
        this.tripStartTime = tripStartTime;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public CarOwner getCarOwner() {

        return carOwner;
    }

    public void setCarOwner(CarOwner carOwner) {
        this.carOwner = carOwner;
    }

    public LocalTime getTripStartTime() {
        return tripStartTime;
    }

    public void setTripStartTime(LocalTime tripStartTime) {
        this.tripStartTime = tripStartTime;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }
}

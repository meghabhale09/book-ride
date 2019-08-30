package comIt.bookride.bookride.model.user;
import comIt.bookride.bookride.model.user.UserProfile;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
public class Car extends UserProfile implements Serializable {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "car_id")
    private long id;

    @NotNull
    @Size(max = 65)
    @Column(name = "car_number")
    private String vehicleNumber;

    @NotNull
    @Size(max = 65)
    @Column(name = "seats")
    private String seats;


    public Car() {
    }

    public Car(long id, String firstName, String lastName, String address,
                                    String city, String province, String country, String email,
                                    String phoneNumber, int credit, long id1, String vehicleNumber, String seats) {
        super(id, firstName, lastName, address, city, province, country, email, phoneNumber, credit);
        this.id = id1;
        this.vehicleNumber = vehicleNumber;
        this.seats = seats;
    }


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }
}

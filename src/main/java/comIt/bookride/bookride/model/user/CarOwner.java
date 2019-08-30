package comIt.bookride.bookride.model.user;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "car_owner")
@PrimaryKeyJoinColumn(name = "user_id")
public class CarOwner extends UserProfile implements Serializable {


    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "owner_id")
    private long ownerId;

    @NotNull
    @Size(max = 15)
    @Column(name = "dl_number")
    private String drivingLicenseNumber;

    @NotNull
    @Column(name = "dl_expiry_date")
    private String licenseExpiryDate;

    public CarOwner() { }


    public CarOwner(long id, String firstName, String lastName, String address, String city, String province, String country, String email, String phoneNumber, int credit, long id1,
                    @NotNull @Size(max = 15) String drivingLicenseNumber, @NotNull String licenseExpiryDate) {
        super(id, firstName, lastName, address, city, province, country, email, phoneNumber, credit);

        this.ownerId = id1;
        this.drivingLicenseNumber = drivingLicenseNumber;
        this.licenseExpiryDate = licenseExpiryDate;
    }

/*    public CarOwner(long id, String drivingLicenseNumber, LocalDate licenseExpiryDate) {
        this.id = id;
        this.drivingLicenseNumber = drivingLicenseNumber;
        this.licenseExpiryDate = licenseExpiryDate;
    }*/

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public String getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public void setLicenseExpiryDate(String licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }
}

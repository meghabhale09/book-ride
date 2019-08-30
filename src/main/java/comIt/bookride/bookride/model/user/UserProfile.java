package comIt.bookride.bookride.model.user;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class UserProfile {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;

    @NotNull
    @Size(max = 65)
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Size(max = 65)
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Column(name = "address")
    private String address;

    @NotNull
    @Size(max = 65)
    @Column(name = "city")
    private String city;

    @NotNull
    @Size(max = 65)
    @Column(name = "province")
    private String province;

    @NotNull
    @Size(max = 65)
    @Column(name = "country")
    private String country;

    @NotNull
    @Size(max = 65)
    @Column(name = "email")
    private String email;

    @NotNull
    @Size(max = 12)
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "credit")
    private Integer credit;

    public UserProfile() {
    }

    public UserProfile(long id, String firstName, String lastName, String address, String city, String province, String country, String email, String phoneNumber, int credit) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.country = country;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.credit = credit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

}

package comIt.bookride.bookride.model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class UserService {

    private  UserRepository userRepository;
    private  CarRepository carRepository;
    private  CarOwnerRepository carOwnerRepository;


    @Autowired
    public UserService(UserRepository userRepository, CarRepository carRepository, CarOwnerRepository carOwnerRepository) {
        this.userRepository = userRepository;
        this.carRepository = carRepository;
        this.carOwnerRepository = carOwnerRepository;
    }

    public void saveUser(UserProfile userProfile){
        userRepository.save(userProfile);
    }



    public UserProfile findUser(UserProfile userProfile, Long id) {
        Optional<UserProfile> found = userRepository.findById(id);
        if (found.isPresent()) {

            UserProfile user = found.get();
            if(userProfile instanceof CarOwner) {
                CarOwner owner = (CarOwner) userProfile;
                updateUser(owner,user);
                carOwnerRepository.save(owner);
            }else if(userProfile instanceof Car) {
                Car owner = (Car) userProfile;
                updateUser(owner,user);
                carRepository.save((Car) userProfile);
            }
            return user;
        } else {
            throw new EntityNotFoundException("Cinema with id " + id + " could not be found");
        }
    }

    private void updateUser(UserProfile owner, UserProfile user){
        owner.setId(user.getId());
        owner.setFirstName(user.getFirstName());
        owner.setLastName(user.getLastName());
        owner.setAddress(user.getAddress());
        owner.setCity(user.getCity());
        owner.setProvince(user.getProvince());
        owner.setCountry(user.getCountry());
        owner.setEmail(user.getEmail());
        owner.setPhoneNumber(user.getPhoneNumber());
    }

    public void saveLicenseDetails(CarOwner carOwner, Long id) {
        findUser(carOwner,id);
    }

    public void savecarDetails(Car car, Long id) {
        findUser(car,id);
    }
}

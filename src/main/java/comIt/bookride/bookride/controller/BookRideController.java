package comIt.bookride.bookride.controller;


import comIt.bookride.bookride.model.user.Car;
import comIt.bookride.bookride.model.user.CarOwner;
import comIt.bookride.bookride.model.user.UserProfile;
import comIt.bookride.bookride.model.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class BookRideController {

    private UserService userService;

    @Autowired
    public BookRideController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }


    @GetMapping("/login")
    public String logIn() {
        return "login";
    }

   @GetMapping("/signUp")
    public String signUp(@RequestParam(required = false, name="id") Long id, Model model){
       UserProfile userProfile;
       userProfile = new UserProfile();
       model.addAttribute("user", userProfile);
        return "userProfile";
     }

    @PostMapping("/signUp")
    public String saveUser(@ModelAttribute UserProfile userProfile, Model model) {
        userService.saveUser(userProfile);
        model.addAttribute("carOwner",new CarOwner());
        model.addAttribute("car",new Car());
        model.addAttribute("user", userProfile);
        return "ownerDetails";
    }

    @PostMapping("/addDetails")
    public String addOwnerDetails(@ModelAttribute CarOwner carOwner, @ModelAttribute Car car, @RequestParam(required = false, name="id") Long id) {

        userService.saveLicenseDetails(carOwner,id);
        userService.savecarDetails(car,id);
        return "home";
    }


/*    @PostMapping("/{userId}/carOwner")
    public String addTheatreRoom(@ModelAttribute CarOwner carOwner,@ModelAttribute Car car,
                                 @PathVariable(name = "userId") Long userId,
                                 Model model) {
        UserProfile updated = userService.addCarOwner(carOwner, userId, car);
        model.addAttribute("cinema", updated);
        return "home";
    }*/


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "home";
    }

}
package hello;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/registerUser")
    public User registerUser(@RequestParam(value="name") String name, @RequestParam(value="phoneNumber") String phoneNumber) {
    	SQLiteJDBC sqlite = new SQLiteJDBC();
    	int id = sqlite.addUser(name, phoneNumber);
        return new User(id, name, phoneNumber);
    }
    
    @PostConstruct
    public void setup() {
    	SQLiteJDBC sqlite = new SQLiteJDBC();
    	sqlite.createTables();
    }
}


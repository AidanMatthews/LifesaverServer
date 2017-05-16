package lifesaver;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelpRequestController {

    @RequestMapping("/makeRequest")
    public HelpRequest registerUser(@RequestParam(value="userId") int userId,
    						 @RequestParam(value="notifyRadius") int notifyRadius,
    						 @RequestParam(value="call911") boolean call911,
    						 @RequestParam(value="emergencyReason") int emergencyReason,
    						 @RequestParam(value="otherInfo") String otherInfo,
    						 @RequestParam(value="timestamp") double timestamp,
    						 @RequestParam(value="latitude") float latitude,
    						 @RequestParam(value="longitude") float longitude)
    {
    	SQLiteJDBC sqlite = new SQLiteJDBC();
    	int id = sqlite.addRequest(userId, notifyRadius, call911, emergencyReason,
    			otherInfo, timestamp, latitude, longitude);
        return new HelpRequest(id, userId, notifyRadius, call911, emergencyReason,
        		otherInfo, timestamp, latitude, longitude);
    }

    @RequestMapping("/getNearbyRequests")
    public ArrayList<HelpRequest> getNearbyRequests(@RequestParam(value="latitude") float latitude,
    						 @RequestParam(value="longitude") float longitude)
    {
    	SQLiteJDBC sqlite = new SQLiteJDBC();
    	ArrayList<HelpRequest> nearbyRequests = sqlite.getNearbyRequests(latitude, longitude);
        return nearbyRequests;
    }
}

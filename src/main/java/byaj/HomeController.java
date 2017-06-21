package byaj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by student on 6/20/17.
 */
@Controller
public class HomeController {
    @Autowired
    private RoomsRepository roomsRepository;
    private int roomID=0;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/")
    public String newRooms(Model model){
        model.addAttribute("rooms", new Rooms());
        return "form";
    }
    @PostMapping("/add")
    public String processRooms(Model model, @Valid Rooms rooms, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        roomID=rooms.getRoomID();
        roomsRepository.save(rooms);
        model.addAttribute("rooms", new Rooms());
        return "form-two";
        //finishProcessingRooms(rooms, bindingResult);

    }
    /*public String sameClassmate(Model model, Rooms rooms){

        model.addAttribute("classmate", rooms);
        return "form";
    }*/
    @PostMapping("/add-two")
    public String finishProcessingRooms(@Valid Rooms rooms, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
           return "form";
        }
        roomsRepository.findOne(roomID-1).setRoomDescription(rooms.getRoomDescription());
        roomsRepository.findOne(roomID-1).setRoomRules(rooms.getRoomRules());
        roomsRepository.findOne(roomID-1).setRoomWifi(rooms.getRoomWifi());
        roomsRepository.findOne(roomID-1).setRoomCable(rooms.getRoomCable());
        roomsRepository.findOne(roomID-1).setRoomBathroom(rooms.getRoomBathroom());
        return "result";
    }
}

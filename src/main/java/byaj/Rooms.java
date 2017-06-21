package byaj;

/**
 * Created by student on 6/20/17.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*create table Rooms(

    roomAddress varChar (255),
    roomCity varChar (255),
    roomState varChar (255),
    roomDescription varChar (255),
    roomRules varChar (255),
    roomCable varChar (255),
    roomIsRented varChar (255),
    roomID integer auto_increment,
    primary key (roomID)
);*/
@Entity
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@NotNull
    //@Min(1)
    private int roomsID;
    @NotNull
    @Size(min=2, max=100)
    private String roomAddress="  ";
    @NotNull
    @Size(min=2, max=30)
    private String roomCity="  ";
    @NotNull
    @Size(min=2, max=30)
    private String roomState="  ";
    @NotNull
    @DecimalMin(value="0.0", inclusive=false)
    private float roomPrice=1;
    @NotNull
    @Size(min=2, max=255)
    private String roomDescription="  ";
    @NotNull
    @Size(min=2, max=30)
    private String roomRules="  ";
    @NotNull
    private boolean roomWifi=false;
    @NotNull
    @Size(min=2, max=30)
    private String roomCable="  ";
    @NotNull
    private boolean roomBathroom=false;
    @NotNull
    private boolean roomIsRented = false;

    public int getRoomID() {
        return roomsID;
    }

    /*public void setMateID(int roomsID) {
        this.roomsID = roomsID;
    }*/
    public String getRoomAddress() {
        return roomAddress;
    }

    public String getRoomCity() {
        return roomCity;
    }

    public String getRoomState() {
        return roomState;
    }

    public float getRoomPrice(){
        return roomPrice;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public String getRoomRules() {
        return roomRules;
    }

    public boolean getRoomWifi() {
        return roomWifi;
    }

    public boolean getRoomBathroom() {
        return roomBathroom;
    }

    public String getRoomCable() {
        return roomCable;
    }

    public boolean getRoomIsRented() {
        return roomIsRented;
    }

    public void setRoomAddress (String roomAddress) {
        this.roomAddress = roomAddress;
    }

    public void setRoomCity (String roomCity) {
        this.roomCity = roomCity;
    }

    public void setRoomState (String roomState) {
        this.roomState = roomState;
    }

    public void setRoomPrice(float roomPrice) {
        this.roomPrice = roomPrice;
    }

    public void setRoomDescription (String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public void setRoomRules (String roomRules) {
        this.roomRules = roomRules;
    }

    public void setRoomWifi (boolean roomWifi) {
        this.roomWifi = roomWifi;
    }

    public void setRoomCable (String roomCable) {
        this.roomCable = roomCable;
    }

    public void setRoomBathroom (boolean roomBathroom) {
        this.roomBathroom = roomBathroom;
    }

    public void setRoomIsRented (boolean roomIsRented) {
        this.roomIsRented = roomIsRented;
    }
}
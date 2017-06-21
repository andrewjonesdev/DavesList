create schema davesList;
use davesList;

create table Rooms(

    roomAddress varChar (255),
    roomCity varChar (255),
    roomState varChar (255),
    roomPrice double,
    roomDescription varChar (255),
    roomRules varChar (255),
    roomWifi boolean,
    roomCable varChar (255),
    roomIsRented boolean,
    roomBathroom boolean,
    roomID integer auto_increment,
    primary key (roomID)
);

show create table Rooms;

select* from Rooms;

describe Rooms;

#The rooms should show up as a list with the address, city, state,
 #and price on the list and when the user clicks on the link for an item, it goes to another screen and shows the detail of the 
 #individual listing: description, rules, wifi (yes/no), cable (none/basic/premium) and private bathroom (yes/no).

#Finally, every listing should have an isRented field that is used to show that 
#the listing is already taken or not. Rooms that have been rented out arent' deleted, they are marked as isRented. When Dave logs in, he can add a
 #listing or change a listing to be rented or not. He does not delete listings. Only dave should be able to add or update a listing.
import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public AddressBook(ArrayList<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    public void addBuddy(BuddyInfo buddy) {
        this.buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {

        if (this.buddies.size() > 0) {
            for (int i = 0; i < this.buddies.size(); i++)
                if (this.buddies.get(i).getName().equals(buddy.getName())) {
                    this.buddies.remove(i);
                }
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        BuddyInfo buddy2 = new BuddyInfo("Agnes", "OttawaU", "514");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        addressBook.addBuddy(buddy2);
        //this shall be added when?
    }
}

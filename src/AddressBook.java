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

    public void removeBuddy(BuddyInfo name) {

        if (this.buddies.size() > 0) {
            for (BuddyInfo i : this.buddies)
                if (i.getName().equals(name)) {
                    this.buddies.remove(i);
                }
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}

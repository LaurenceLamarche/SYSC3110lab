public class BuddyInfo {

    private String name;
    private String address;
    private String phone;

    public BuddyInfo(){
        this("Laurence", "86 Ravin-Bleu", "514-546-8001");
    }

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jessica", "37 Dominique", "819-771-2208");
        System.out.println("Hello " + buddy.getName());
    }
}

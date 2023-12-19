public class User {
    private String name;
    private String phone;
    private Location location;

    {
        name = "DefaultName";
        phone = "DefaultPhone";
        location = new Location("DefaultRegion", "DefaultDistrict", 0);
    }

    public User() {
    }

    public User(String name, String phone, Location location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Location: " + location;
    }
}

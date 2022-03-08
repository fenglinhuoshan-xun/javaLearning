public class User {
    private int id;
    private String name;
    private String bitrh;

    public User() {
    }

    public User(int id, String name, String bitrh) {
        this.id = id;
        this.name = name;
        this.bitrh = bitrh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBitrh() {
        return bitrh;
    }

    public void setBitrh(String bitrh) {
        this.bitrh = bitrh;
    }

    public String toString() {
        return "User...";
    }
}

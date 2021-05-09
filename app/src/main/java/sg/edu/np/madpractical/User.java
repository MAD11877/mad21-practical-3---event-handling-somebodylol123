package sg.edu.np.madpractical;

public class User {
    private String name;
    private String description;
    private int id;
    private Boolean followed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getFollowed() {
        return followed;
    }

    public void setFollowed(Boolean followed) { this.followed = followed; }

    public User(Boolean followed) {
        this.followed = followed;
    }
}

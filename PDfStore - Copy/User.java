import static java.util.Objects.hash;

public class User
{
    private String Id;
    private String Username;
    private String email;
    private String password;
    private String  profilepic;
    private String bio;
    private UserRole role;
    private int passwordHash;
    public User(String id, String username, String email, String password, String profilepic, String bio, UserRole role) {
        Id = id;
        Username = username;
        this.email = email;
        this.password = password;
        this.profilepic = profilepic;
        this.bio = bio;
        this.role = role;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
    public void  updateProfile(String newUsername, String newEmail, String newBio, String newProfilePic)
    {
        this.Username = newUsername;
        this.email = newEmail;
        this.bio = newBio;
        this.profilepic = newProfilePic;
    }
    public boolean login(String email, String password)
    {
        // Check if email exists and password matches
        return verifyCredentials(email, password);
    }
    private int hashPassword(String password) {
        // Logic to hash password
        return hash(password);
    }
    private boolean verifyCredentials(String email, String password) {
        // Logic to verify user credentials
        return checkpw(password, this.passwordHash);
    }
    private boolean checkpw(String password, int hashpassword)
    {
        return false;
    }
}

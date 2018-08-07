package finalproj.beautybar.entity;

import java.util.Objects;

public class Client extends Entity{

    private String name;
    private String email;
    private String phone;
    private String passwordHash;
    private String salt;

    public Client(String name, String email, String phone, String passwordHash, String salt) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    public Client(Long id, String name, String email, String phone, String passwordHash, String salt) {
        super(id);
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(email, client.email) &&
                Objects.equals(phone, client.phone) &&
                Objects.equals(passwordHash, client.passwordHash) &&
                Objects.equals(salt, client.salt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone, passwordHash, salt);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}

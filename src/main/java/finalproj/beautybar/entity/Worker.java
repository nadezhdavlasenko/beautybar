package finalproj.beautybar.entity;

import java.util.Objects;

public class Worker extends Entity {

    private Role role;
    private String name;
    private String email;
    private String phone;
    private String passwordHash;
    private String salt;

    public Worker(Role role, String name, String email, String phone, String passwordHash, String salt) {
        this.role = role;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    public Worker(Long id, Role role, String name, String email, String phone, String passwordHash, String salt) {
        super(id);
        this.role = role;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        Worker worker = (Worker) o;
        return Objects.equals(role, worker.role) &&
                Objects.equals(name, worker.name) &&
                Objects.equals(email, worker.email) &&
                Objects.equals(phone, worker.phone) &&
                Objects.equals(passwordHash, worker.passwordHash) &&
                Objects.equals(salt, worker.salt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, name, email, phone, passwordHash, salt);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "role=" + role +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}

package finalproj.beautybar.entity;

import java.util.Objects;

public class Role extends Entity {

    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getTypeName() {
        return name;
    }
    public void setTypeName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role that = (Role) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                '}';
    }

}

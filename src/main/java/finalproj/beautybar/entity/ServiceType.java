package finalproj.beautybar.entity;

import java.util.Objects;

public class ServiceType extends Entity{

    private String name;

    public ServiceType(String name) {
        this.name = name;
    }

    public ServiceType(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceType that = (ServiceType) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "ServiceType{" +
                "name='" + name + '\'' +
                '}';
    }
}

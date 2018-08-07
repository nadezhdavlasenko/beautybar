package finalproj.beautybar.entity;

import java.util.Objects;

public class Service extends Entity{

    private String name;
    private Integer duratioon;
    private ServiceType serviceType;

    public Service(String name, Integer duratioon, ServiceType serviceType) {
        this.name = name;
        this.duratioon = duratioon;
        this.serviceType = serviceType;
    }

    public Service(Long id, String name, Integer duratioon, ServiceType serviceType) {
        super(id);
        this.name = name;
        this.duratioon = duratioon;
        this.serviceType = serviceType;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuratioon() {
        return duratioon;
    }

    public void setDuratioon(Integer duratioon) {
        this.duratioon = duratioon;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", duratioon=" + duratioon +
                ", serviceType=" + serviceType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(name, service.name) &&
                Objects.equals(duratioon, service.duratioon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duratioon);
    }
}

package entity;

import java.util.Objects;

public class ServiceType  extends Entity {

    private String typeName;

    public ServiceType(String typeName) {
        this.typeName = typeName;
    }

    public ServiceType(int id, String typeName) {
        super(id);
        this.typeName = typeName;
    }

    public String getTypeName() {

        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceType that = (ServiceType) o;
        return Objects.equals(typeName, that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeName);
    }

    @Override
    public String toString() {
        return "ServiceType{" +
                "typeName='" + typeName + '\'' +
                '}';
    }

}

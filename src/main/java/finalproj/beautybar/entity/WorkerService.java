package finalproj.beautybar.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class WorkerService extends Entity{

    private Worker worker;
    private Service service;
    private BigDecimal price;

    public WorkerService(Worker worker, Service service, BigDecimal price) {
        this.worker = worker;
        this.service = service;
        this.price = price;
    }

    public WorkerService(Long id, Worker worker, Service service, BigDecimal price) {
        super(id);
        this.worker = worker;
        this.service = service;
        this.price = price;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkerService)) return false;
        WorkerService that = (WorkerService) o;
        return Objects.equals(worker, that.worker) &&
                Objects.equals(service, that.service) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worker, service, price);
    }

    @Override
    public String toString() {
        return "WorkerService{" +
                "worker=" + worker +
                ", service=" + service +
                ", price=" + price +
                '}';
    }
}

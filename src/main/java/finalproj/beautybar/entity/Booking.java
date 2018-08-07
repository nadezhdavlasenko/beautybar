package finalproj.beautybar.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Booking extends Entity{

    private Client client;
    private Timestamp timestamp;
    private Worker worker;
    private Integer duration;

    public Booking(Client client, Timestamp timestamp, Worker worker, Integer duration) {
        this.client = client;
        this.timestamp = timestamp;
        this.worker = worker;
        this.duration = duration;
    }

    public Booking(Long id, Client client, Timestamp timestamp, Worker worker, Integer duration) {
        super(id);
        this.client = client;
        this.timestamp = timestamp;
        this.worker = worker;
        this.duration = duration;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return Objects.equals(client, booking.client) &&
                Objects.equals(timestamp, booking.timestamp) &&
                Objects.equals(worker, booking.worker) &&
                Objects.equals(duration, booking.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, timestamp, worker, duration);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "client=" + client +
                ", timestamp=" + timestamp +
                ", worker=" + worker +
                ", duration=" + duration +
                '}';
    }
}

package finalproj.beautybar.entity;

import java.util.Date;
import java.util.Objects;

public class Feedback extends Entity {

    private Client client;
    private Worker worker;
    private String text;
    private Integer mark;
    private Date date;

    public Feedback(Client client, Worker worker, String text, Integer mark, Date date) {
        this.client = client;
        this.worker = worker;
        this.text = text;
        this.mark = mark;
        this.date = date;
    }

    public Feedback(Long id, Client client, Worker worker, String text, Integer mark, Date date) {
        super(id);
        this.client = client;
        this.worker = worker;
        this.text = text;
        this.mark = mark;
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feedback)) return false;
        Feedback feedback = (Feedback) o;
        return Objects.equals(client, feedback.client) &&
                Objects.equals(worker, feedback.worker) &&
                Objects.equals(text, feedback.text) &&
                Objects.equals(mark, feedback.mark) &&
                Objects.equals(date, feedback.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, worker, text, mark, date);
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "client=" + client +
                ", worker=" + worker +
                ", text='" + text + '\'' +
                ", mark=" + mark +
                ", date=" + date +
                '}';
    }
}

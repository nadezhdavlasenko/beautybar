package finalproj.beautybar.entity;


import java.sql.Time;
import java.util.Objects;

public class Scedule extends Entity{

    private Worker worker;
    private Time startMon;
    private Time endMon;
    private Time startTue;
    private Time endTue;
    private Time startWed;
    private Time endWed;
    private Time startThu;
    private Time endThu;
    private Time startFri;
    private Time endFri;
    private Time startSat;
    private Time endSat;
    private Time startSun;
    private Time endSun;

    public Scedule(Worker worker, Time startMon, Time endMon, Time startTue, Time endTue, Time startWed, Time endWed, Time startThu, Time endThu, Time startFri, Time endFri, Time startSat, Time endSat, Time startSun, Time endSun) {
        this.worker = worker;
        this.startMon = startMon;
        this.endMon = endMon;
        this.startTue = startTue;
        this.endTue = endTue;
        this.startWed = startWed;
        this.endWed = endWed;
        this.startThu = startThu;
        this.endThu = endThu;
        this.startFri = startFri;
        this.endFri = endFri;
        this.startSat = startSat;
        this.endSat = endSat;
        this.startSun = startSun;
        this.endSun = endSun;
    }

    public Scedule(Long id, Worker worker, Time startMon, Time endMon, Time startTue, Time endTue, Time startWed, Time endWed, Time startThu, Time endThu, Time startFri, Time endFri, Time startSat, Time endSat, Time startSun, Time endSun) {
        super(id);
        this.worker = worker;
        this.startMon = startMon;
        this.endMon = endMon;
        this.startTue = startTue;
        this.endTue = endTue;
        this.startWed = startWed;
        this.endWed = endWed;
        this.startThu = startThu;
        this.endThu = endThu;
        this.startFri = startFri;
        this.endFri = endFri;
        this.startSat = startSat;
        this.endSat = endSat;
        this.startSun = startSun;
        this.endSun = endSun;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Time getStartMon() {
        return startMon;
    }

    public void setStartMon(Time startMon) {
        this.startMon = startMon;
    }

    public Time getEndMon() {
        return endMon;
    }

    public void setEndMon(Time endMon) {
        this.endMon = endMon;
    }

    public Time getStartTue() {
        return startTue;
    }

    public void setStartTue(Time startTue) {
        this.startTue = startTue;
    }

    public Time getEndTue() {
        return endTue;
    }

    public void setEndTue(Time endTue) {
        this.endTue = endTue;
    }

    public Time getStartWed() {
        return startWed;
    }

    public void setStartWed(Time startWed) {
        this.startWed = startWed;
    }

    public Time getEndWed() {
        return endWed;
    }

    public void setEndWed(Time endWed) {
        this.endWed = endWed;
    }

    public Time getStartThu() {
        return startThu;
    }

    public void setStartThu(Time startThu) {
        this.startThu = startThu;
    }

    public Time getEndThu() {
        return endThu;
    }

    public void setEndThu(Time endThu) {
        this.endThu = endThu;
    }

    public Time getStartFri() {
        return startFri;
    }

    public void setStartFri(Time startFri) {
        this.startFri = startFri;
    }

    public Time getEndFri() {
        return endFri;
    }

    public void setEndFri(Time endFri) {
        this.endFri = endFri;
    }

    public Time getStartSat() {
        return startSat;
    }

    public void setStartSat(Time startSat) {
        this.startSat = startSat;
    }

    public Time getEndSat() {
        return endSat;
    }

    public void setEndSat(Time endSat) {
        this.endSat = endSat;
    }

    public Time getStartSun() {
        return startSun;
    }

    public void setStartSun(Time startSun) {
        this.startSun = startSun;
    }

    public Time getEndSun() {
        return endSun;
    }

    public void setEndSun(Time endSun) {
        this.endSun = endSun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scedule)) return false;
        Scedule scedule = (Scedule) o;
        return Objects.equals(worker, scedule.worker) &&
                Objects.equals(startMon, scedule.startMon) &&
                Objects.equals(endMon, scedule.endMon) &&
                Objects.equals(startTue, scedule.startTue) &&
                Objects.equals(endTue, scedule.endTue) &&
                Objects.equals(startWed, scedule.startWed) &&
                Objects.equals(endWed, scedule.endWed) &&
                Objects.equals(startThu, scedule.startThu) &&
                Objects.equals(endThu, scedule.endThu) &&
                Objects.equals(startFri, scedule.startFri) &&
                Objects.equals(endFri, scedule.endFri) &&
                Objects.equals(startSat, scedule.startSat) &&
                Objects.equals(endSat, scedule.endSat) &&
                Objects.equals(startSun, scedule.startSun) &&
                Objects.equals(endSun, scedule.endSun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worker, startMon, endMon, startTue, endTue, startWed, endWed, startThu, endThu, startFri, endFri, startSat, endSat, startSun, endSun);
    }

    @Override
    public String toString() {
        return "Scedule{" +
                "worker=" + worker +
                ", startMon=" + startMon +
                ", endMon=" + endMon +
                ", startTue=" + startTue +
                ", endTue=" + endTue +
                ", startWed=" + startWed +
                ", endWed=" + endWed +
                ", startThu=" + startThu +
                ", endThu=" + endThu +
                ", startFri=" + startFri +
                ", endFri=" + endFri +
                ", startSat=" + startSat +
                ", endSat=" + endSat +
                ", startSun=" + startSun +
                ", endSun=" + endSun +
                '}';
    }
}

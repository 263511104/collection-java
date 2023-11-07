package work2;

import java.time.LocalDate;

public class Customer {
    protected String name;
    protected int count;
    protected LocalDate latestArrivedTime;

    public Customer(String name) {
        this.name = name;
        this.count = count;
        this.latestArrivedTime = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getcount() {
        return count;
    }

    public void addcount() {
        this.count++;
    }

    public LocalDate getLatestArrivedTime() {
        return latestArrivedTime;
    }

    public void setLatestArrivedTime() {
        latestArrivedTime = LocalDate.now();
    }

    @Override
    public String toString() {
        return "顾客：" +
                "姓名'" + name + '\'' +
                ", 来了" + count +"次"+
                ", 时间为" + latestArrivedTime +
                '}';
    }
}

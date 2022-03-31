package by.itstep.mikola.examOOP.model.entity;

public class Milk {
    private double volume;
    private double fat;
    private double money;

    public Milk() {
    }

    public Milk(double volume, double fat, double money) {
        this.volume = volume;
        this.fat = fat;
        this.money = money;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume > 0) {
            this.volume = volume;
        }
    }

    public double getFat() {

        return fat;

    }

    public void setFat(double fat) {
        if (fat > 0) {
            this.fat = fat;
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money > 0) {
            this.money = money;
        }
    }

    @Override
    public String toString() {
        return "Milk{" +
                "volume = " + volume +
                ", fat = " + fat +
                ", money = " + money +
                '}';
    }
}

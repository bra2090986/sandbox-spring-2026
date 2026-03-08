package org.example.sandbox.fruit;

public class Fruit implements Comparable<Fruit> {
    private String fruitName;
    private int fruitQty;

    public Fruit(String fruitName, int fruitQty) {
        this.fruitName = fruitName;
        this.fruitQty = fruitQty;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getFruitQty() {
        return fruitQty;
    }

    public void setFruitQty(int fruitQty) {
        this.fruitQty = fruitQty;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitQty=" + fruitQty +
                '}';
    }

    @Override
    public int compareTo(Fruit other) {
        int nameComparison = this.fruitName.compareTo(other.fruitName);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(this.fruitQty, other.fruitQty);
    }
}

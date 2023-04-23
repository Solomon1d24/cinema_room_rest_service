package cinema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Seat {

    private int row;

    private int column;

    private int price;

    @JsonIgnore
    private boolean booked;

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        this.booked = false;
        setPrice();
    }

    public Seat() {}

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setPrice() {
        if (row <= 4) {
            price = 10;
        } else {
            price = 8;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}

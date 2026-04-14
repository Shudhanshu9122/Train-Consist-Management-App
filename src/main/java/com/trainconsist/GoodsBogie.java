package com.trainconsist;

/**
 * Represents a goods bogie with a shape and cargo type.
 */
public class GoodsBogie {
    public String shape;   // "Cylindrical" or "Rectangular"
    public String cargo;   // e.g., "Petroleum", "Coal", "Grain"

    public GoodsBogie(String shape, String cargo) {
        this.shape = shape;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "GoodsBogie{shape='" + shape + "', cargo='" + cargo + "'}";
    }
}

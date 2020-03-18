package telran.data;

import java.util.Objects;

public class Cinema {
    private String name;
    private Address address;

    public Cinema(String name) {
        this.name = name;
    }

    public Cinema(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cinema)) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(name, cinema.name) &&
                Objects.equals(address, cinema.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "Cinema: " + name  +
                ", " + address;
    }

    public static boolean isCinemaInArray(Cinema[] cinemas, String name){
        for (int i = 0; i <cinemas.length ; i++) {
            if (cinemas[i].getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}

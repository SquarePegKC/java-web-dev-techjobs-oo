package org.launchcode.techjobs_oo;

import org.launchcode.techjobs_oo.Tests.JobTest;

import java.util.Objects;

public class Location extends JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

    public Location() {
        id = nextId;
        nextId++;
    }
    public Location(String value) {
            this();
            if (value.equals("")) {
                this.value = "Data not available.";
            } else {
                this.value = value;
            }
        }

    // Custom toString, equals, and hashCode methods:
@Override
    public String toString() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Location.nextId = nextId;
    }
// Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Location(int id) {
        this.id = id;
    }
}

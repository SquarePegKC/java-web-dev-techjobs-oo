package org.launchcode.techjobs_oo;

import java.util.*;


public class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField (String value) {
    this();
    if (value.equals("")) {
        this.value = "Data not available.";
    } else {
        this.value = value;
    }
}

};
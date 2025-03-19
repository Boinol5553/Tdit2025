package com.app.comparable;

public class Vendor implements Comparable<Vendor>{
    private int id;
    private String name;

    public Vendor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vendor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return  id +" "+ name;
    }

    @Override
    public int compareTo(Vendor vendor) {
        if(vendor.getId()==this.id)
        return 0;
        else if (vendor.getId() < this.id)
            return 1;
        else
            return -1;

    }
}

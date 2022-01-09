package com.example.test.model;

import java.io.Serializable;

public class Student implements Serializable {

    private int id;
    private String userName;
    private Double avg;

    public Student(int id, String serName, Double avg) {
        this.id = id;
        this.userName = serName;
        this.avg = avg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerName() {
        return userName;
    }

    public void setSerName(String serName) {
        this.userName = serName;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public String toString(){
        return "Student{"+
                "id"+ id+
                ", name : "+userName+'\''+
                ", avg : "+avg+'}';
    }
}

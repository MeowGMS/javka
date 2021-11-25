package mirea.prac9.task2;

import java.io.Serializable;

public class Student implements Comparable<mirea.prac6.Student>, Serializable {
    public int id;

    private double averageBall;
    private String name;

    public Student(int id, String name, double averageBall) {
        this.id = id;
        this.name = name;
        this.averageBall = averageBall;
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

    public double getAverageBall() {
        return averageBall;
    }

    public void setAverageBall(double averageBall) {
        this.averageBall = averageBall;
    }

    @Override
    public int compareTo(mirea.prac6.Student s) {
        return this.id - s.getId();
    }

    @Override
    public String toString() {
        return "Student ID: " + this.id + " Average Ball: " + this.averageBall;
    }
}
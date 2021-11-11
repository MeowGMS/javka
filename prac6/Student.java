package mirea.prac6;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {
    private int id;
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
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return "Student ID: " + this.id + " Average Ball: " + this.averageBall;
    }
}

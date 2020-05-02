package serializationAndDeSerialization2;

public class Student {

    private String name;
    private String batch;
    private int rollNumber;

    public Student(String name, String batch, int rollNumber) {
        this.name = name;
        this.batch = batch;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public String getBatch() {
        return this.batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Integer getRollInteger() {
        return this.rollNumber;
    }

    public void setRollNumber() {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "The Student name is: " + this.name + "studies in Batch: " + this.batch + "and has roll number: " + this.rollNumber;
    }
}
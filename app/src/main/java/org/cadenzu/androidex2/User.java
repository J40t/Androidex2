package org.cadenzu.androidex2;

public class User {
    private String firstName;
    private String lastName;
    private String degreeProgram;
    private String email;

    public User(String firstName, String lastName, String degreeProgram, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.degreeProgram = degreeProgram;
        this.email = email;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDegreeProgram() { return degreeProgram;}

    public String getEmail() {
        return email;
    }
}



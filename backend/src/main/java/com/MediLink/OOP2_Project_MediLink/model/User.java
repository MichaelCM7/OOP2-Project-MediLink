package com.MediLink.OOP2_Project_MediLink.model;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String description;

    public User() {}

    public User(String firstName, String lastName, String email, String phone, String password, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.description = description;
    }

    // Getters and setters...
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
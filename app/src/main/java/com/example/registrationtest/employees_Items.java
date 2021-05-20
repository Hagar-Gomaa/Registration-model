package com.example.registrationtest;

public class employees_Items {

    String name ,email,role ;


    public employees_Items(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }



    public employees_Items(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}

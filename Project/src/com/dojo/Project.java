package com.dojo;

public class Project {
    private String name;
    private String description;


    public Project() {
        this("No name", "no one");
    }

    public Project(String name) {
        this(name, "hi");
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String elevatorPitch(){
        return String.format("%s, %s", this.name, this.description);
    }


}

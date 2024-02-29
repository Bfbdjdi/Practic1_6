package com.oaosalty.homework1;

public class Car {
    
    String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }  
      
    String initName;
    
    public String modify()
    {
        initName = this.name; 
        name = name.replaceAll("a", "o");
        name = name.replaceAll("i", "e");
        name = name.toLowerCase();
        return name;
    }

    @Override
    public String toString() {
        return ("Изначальное название: " + initName + 
                ", измененное название: " + name);
    }
}

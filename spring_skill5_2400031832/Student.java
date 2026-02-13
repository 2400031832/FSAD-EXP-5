
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int id = 2400031832;
    private String name = "Charan";
    private String gender = "Male";

    @Autowired
    private Certification certification;

    public String toString() {
        return id + " " + name + " " + gender + " | Certification: " + certification;
    }
}

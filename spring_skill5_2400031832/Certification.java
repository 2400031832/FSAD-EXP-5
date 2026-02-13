
package com.example;

import org.springframework.stereotype.Component;

@Component
public class Certification {
    private int id = 501;
    private String name = "Java Certification";
    private String dateOfCompletion = "2026-01-20";

    public String toString() {
        return id + " " + name + " " + dateOfCompletion;
    }
}

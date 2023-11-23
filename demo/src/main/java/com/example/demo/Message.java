package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Message{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Ajoutez des getters et des setters
    public Message(){}

    public Message(String message) {
        this.message = message;
    }
    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

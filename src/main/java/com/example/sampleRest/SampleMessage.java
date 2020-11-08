package com.example.sampleRest;

public class SampleMessage {
    private final int id;
    private final String message;

    public SampleMessage(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}

package com.watanabe.hellowold.domain.hello;

public class Hello {
    private Id id;
    private String country;
    private String greeting;
    private String time;

    public Hello(Id id, String country, String greeting, String time) {
        this.id = id;
        this.country = country;
        this.greeting = greeting;
        this.time = time;
    }

    public Id id() {
        return id;
    }

    public Hello setId(Id id) {
        this.id = id;
        return this;
    }

    public String country() {
        return country;
    }

    public Hello setCountry(String country) {
        this.country = country;
        return this;
    }

    public String greeting() {
        return greeting;
    }

    public Hello setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }

    public String time() {
        return time;
    }

    public Hello setTime(String time) {
        this.time = time;
        return this;
    }
}
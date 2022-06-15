package com.watanabe.hellowold.domain.hello;

public enum HelloDefinition {
    JP("日本", "東京", "こんにちは！"),
    CH("中国", "北京", "你好！"),
    US("アメリカ", "ワシントンD.C.", "Hello!");

    private final String country;
    private final String capital;
    private final String greeting;
    HelloDefinition(final String country, final String capital, final String greeting) {
        this.country = country;
        this.capital = capital;
        this.greeting = greeting;
    }
    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    public String getGreeting() {
        return greeting;
    }
}

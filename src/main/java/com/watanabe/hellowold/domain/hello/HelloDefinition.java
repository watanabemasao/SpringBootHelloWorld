package com.watanabe.hellowold.domain.hello;

public enum HelloDefinition {
    JP("日本", "東京","こんにちは！"),
    CH("中国", "北京","你好！"),
    US("アメリカ","ワシントンD.C.","Hello!");

    public final String country;
    public final String capital;
    public final String greeting;

    HelloDefinition(String country, String capital, String greeting) {
        this.country = country;
        this.capital = capital;
        this.greeting = greeting;
    }
}
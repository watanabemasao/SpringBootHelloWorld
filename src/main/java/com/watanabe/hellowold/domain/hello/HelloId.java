package com.watanabe.hellowold.domain.hello;

public enum HelloId {
    JP("日本", "東京","こんにちは！"),
    CH("中国", "北京","你好！"),
    US("アメリカ","ワシントンD.C.","HelloEntity!");

    public final String country;
    public final String capital;
    public final String greeting;

    HelloId(String country, String capital, String greeting) {
        this.country = country;
        this.capital = capital;
        this.greeting = greeting;
    }
}

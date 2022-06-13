package com.watanabe.hellowold;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeDisplay {

    private final String DATA_TIME = "yyyy年MM月dd日(E)HH時mm分ss秒";
    private final String JPN = "Asia/Tokyo";
    private final String CST = "Asia/Shanghai";
    private final String USP = "US/Pacific";

    public String dateTimeJapan() {
        OffsetDateTime offsetJapan = OffsetDateTime.now(ZoneId.of(JPN));
        var formatterJapan = DateTimeFormatter.ofPattern(DATA_TIME);
        return offsetJapan.format(formatterJapan);
    }

    public String dateTimeShanghai() {
        OffsetDateTime offsetShanghai = OffsetDateTime.now(ZoneId.of(CST));
        var formatterShanghai = DateTimeFormatter.ofPattern(DATA_TIME);
        return offsetShanghai.format(formatterShanghai);
    }

    public String dateTimeUS_Pacific() {
        OffsetDateTime offsetUS_Pacific = OffsetDateTime.now(ZoneId.of(USP));
        var formatterUS_Pacific = DateTimeFormatter.ofPattern(DATA_TIME);
        return offsetUS_Pacific.format(formatterUS_Pacific);
    }

}

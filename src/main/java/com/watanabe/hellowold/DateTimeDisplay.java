package com.watanabe.hellowold;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeDisplay {
    DateTimeConstant date = new DateTimeConstant();
    public String dateTimeJapan() {
        OffsetDateTime offsetJapan = OffsetDateTime.now(ZoneId.of(date.getJPN()));
        var formatterJapan = DateTimeFormatter.ofPattern(date.getDATA_TIME());
        return offsetJapan.format(formatterJapan);
    }

    public String dateTimeShanghai() {
        OffsetDateTime offsetShanghai = OffsetDateTime.now(ZoneId.of(date.getCST()));
        var formatterShanghai = DateTimeFormatter.ofPattern(date.getDATA_TIME());
        return offsetShanghai.format(formatterShanghai);
    }

    public String dateTimeUS_Pacific() {
        OffsetDateTime offsetUS_Pacific = OffsetDateTime.now(ZoneId.of(date.getUSP()));
        var formatterUS_Pacific = DateTimeFormatter.ofPattern(date.getDATA_TIME());
        return offsetUS_Pacific.format(formatterUS_Pacific);
    }

}
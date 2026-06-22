package com.tinykafka;

import java.nio.charset.StandardCharsets;

public record Record (byte[] key, byte[] value ) {

    public static java.lang.Record of(String key, String value) {
        return new Record(
                key == null ? null : key.getBytes(StandardCharsets.UTF_8),
                value.getBytes(java.nio.charset.StandardCharsets.UTF_8)
        );
    }
    public String valueAsString(){
        return new String(value, java.nio.charset.StandardCharsets.UTF_8);
    }
}

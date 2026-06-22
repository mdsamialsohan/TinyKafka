package com.tinykafka.log;

import com.tinykafka.Record;

public record RecordWithOffset (long offset, Record record) {}

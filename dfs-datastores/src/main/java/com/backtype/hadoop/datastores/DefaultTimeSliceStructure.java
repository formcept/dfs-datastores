package com.backtype.hadoop.datastores;

import java.util.Map;

public class DefaultTimeSliceStructure extends TimeSliceStructure<byte[]> {
    public byte[] deserialize(byte[] serialized) {
        return serialized;
    }

    public byte[] deserialize(byte[] serialized, Map<String, Object> args) {
        return serialized;
    }

    public byte[] serialize(byte[] object) {
        return (byte[]) object;
    }

    public byte[] serialize(byte[] object, Map<String, Object> args) {
        return object;
    }

    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    public Class getType() {
        return EMPTY_BYTE_ARRAY.getClass();
    }
}

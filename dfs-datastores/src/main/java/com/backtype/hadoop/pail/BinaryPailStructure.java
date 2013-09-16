package com.backtype.hadoop.pail;

import java.util.Map;

public abstract class BinaryPailStructure implements PailStructure<byte[]> {
    public byte[] deserialize(byte[] serialized) {
        return serialized;
    }

    public byte[] deserialize(byte[] serialized, Map<String, Object> args) {
        return serialized;
    }

    public byte[] serialize(byte[] object) {
        return object;
    }

    public byte[] serialize(byte[] object, Map<String, Object> args) {
        return object;
    }

    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    public Class getType() {
        return EMPTY_BYTE_ARRAY.getClass();
    }

}

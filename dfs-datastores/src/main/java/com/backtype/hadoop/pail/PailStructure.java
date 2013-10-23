package com.backtype.hadoop.pail;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Shouldn't take any args
 */
public interface PailStructure<T> extends Serializable {
    public boolean isValidTarget(String... dirs);
    public boolean isValidTarget(Map<String, Object> args, String... dirs);
    public T deserialize(byte[] serialized);
    public T deserialize(byte[] serialized, Map<String,Object> args);
    public byte[] serialize(T object);
    public byte[] serialize(T object, Map<String,Object> args);
    public List<String> getTarget(T object);
    public List<String> getTarget(T object, Map<String,Object> args);
    public Class getType();
}

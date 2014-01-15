package com.backtype.hadoop.pail;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class DefaultPailStructure extends BinaryPailStructure {

    public boolean isValidTarget(Map<String,Object> args, String... dirs) {
        return true;
    }

    public boolean isValidTarget(String... dirs) {
        return true;
    }

    public List<String> getTarget(byte[] object, Map<String,Object> args) {
        return Collections.EMPTY_LIST;
    }

    public List<String> getTarget(byte[] object) {
        return Collections.EMPTY_LIST;
    }
}

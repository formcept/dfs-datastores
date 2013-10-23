package com.backtype.hadoop.datastores;

import com.backtype.hadoop.pail.PailStructure;
import com.backtype.support.Utils;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class TimeSliceStructure<T> implements PailStructure<T> {

    public final boolean isValidTarget(Map<String,Object> args, String... dirs) {
        return isValidTarget(dirs);
    }

    public final boolean isValidTarget(String... dirs) {
        if(dirs.length < 2) {
            return false;
        }
        String weekTimeStr = dirs[0];
        String sliceTimeStr = dirs[1];
        try {
            int weekTimeSecs = Integer.parseInt(weekTimeStr);
            int sliceTimeSecs = Integer.parseInt(sliceTimeStr);

            int week = Utils.toWeek(weekTimeSecs);

            long weekStart = Utils.weekStartTime(week);
            long weekEnd = Utils.weekStartTime(week+1);

            return weekStart == weekTimeSecs && sliceTimeSecs >= weekStart && sliceTimeSecs < weekEnd;
        } catch(NumberFormatException nfe) {
            return false;
        }
    }

    public final List<String> getTarget(T object, Map<String,Object> args) {
        return getTarget(object);
    }

    public final List<String> getTarget(T object) {
        return Collections.EMPTY_LIST; // this isn't valid. At write time, a valid category must be provided
    }

}
